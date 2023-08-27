import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class App{
    public static void  main(String args[]) {
     
     // você jogador.
      Scanner texto = new Scanner(System.in);
      Player player1= new Player();
      player1.criarPersonagem(texto);

      System.out.println("Nome do jogador 1:" + player1.name);
        System.out.println("-----------------------------------");
      // personagem amigo da marinha 
      Player player2= new Player();
      player2.name = "Desmond\n";
      player2.forces = "marinha";
     // personagem amigo do exercito 
      Player player3 = new Player();
      player3.name = "Marshall\n";
      player3.forces = "exercito";
     
     
     
      Map<String, Capitulos> listaDeCaps = new HashMap<String, Capitulos>();
      File arquivo = new File("projeto_de_p2\\principal\\rsc\\h\u00EDstoria.txt");
      try {
        Scanner leitorDeARQ = new Scanner(arquivo,"UTF-8" );
        while(leitorDeARQ.hasNextLine()){
          String linhaLida = leitorDeARQ.nextLine();
          if(linhaLida.equalsIgnoreCase("CAPITULO")){
            String nomeCapitulo = leitorDeARQ.nextLine();
            String narrativa = leitorDeARQ.nextLine(); 
            int energia = Integer.parseInt(leitorDeARQ.nextLine()) ;
            String nomeDoNPC = leitorDeARQ.nextLine();
            listaDeCaps.put(nomeCapitulo, new Capitulos(player1, texto));
            listaDeCaps.get(nomeCapitulo).setNarrativa(narrativa);
            listaDeCaps.get(nomeCapitulo).setAlteracaoDeEnergia(energia);
            listaDeCaps.get(nomeCapitulo).setNpc(nomeDoNPC);
           }else if(linhaLida.equalsIgnoreCase("ESCOLHA")){
              String capOrigem =leitorDeARQ.nextLine();
              String escolha = leitorDeARQ.nextLine();
              String capDestino = leitorDeARQ.nextLine();
              Capitulos destino = listaDeCaps.get(capDestino);
              listaDeCaps.get(capOrigem).adicionarEscolhas(escolha, destino);
              
           }
           else if(linhaLida.equalsIgnoreCase("CAPITULOIMAGEM")){
            String nomeCapitulo = leitorDeARQ.nextLine();
            String narrativa = leitorDeARQ.nextLine(); 
            int energia = Integer.parseInt(leitorDeARQ.nextLine()) ;
            String nomeDoNPC = leitorDeARQ.nextLine();
            String imagem = "";
            while(true){
                String linhatemporaria = leitorDeARQ.nextLine();
                if(linhatemporaria.equalsIgnoreCase("Fim")){
                  break;
                }
                imagem = imagem+linhatemporaria + "\n"; 

            }
            CapituloImagem temporario = new CapituloImagem(player1,texto);
            listaDeCaps.put(nomeCapitulo,temporario);
            temporario.setNarrativa(narrativa);
            temporario.setAlteracaoDeEnergia(energia);
            temporario.setNpc(nomeDoNPC);
            temporario.setImagem(imagem);
          

          }


        }


      } catch (Exception e) {
        System.out.println("ERRO NA LEITURA DO ARQUIVO !");
        System.exit(0); 
      }

      if(player1.apto()) listaDeCaps.get("cap0").executar();


       texto.close();
      }
    
      
}
