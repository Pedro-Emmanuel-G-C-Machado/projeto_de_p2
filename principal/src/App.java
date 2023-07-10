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
      player2.name = "Desmond Milles";
      player2.forces = "marinha";
     // personagem amigo do exercito 
      Player player3 = new Player();
      player3.name = "Marsh Cooper";
      player3.forces = "exercito";
     

    
    if(player1.apto()){
      Capitulos capitulo_0 = new Capitulos();
      System.out.println("----- Capitulo 0 -------");
      capitulo_0.narrativa = "Bem, senhor(a):" + player1.name + ", você  quer ser de qual  força armada, infelizmente  temos vagas apenas para o exercito e a marinha, qual é a sua escoolha, O exercito ou a marinha ? ";
      capitulo_0.escolhas[0] = "exercito";
      capitulo_0.escolhas[1] = "marinha";
      capitulo_0.alteracaoDeEnergia= 0;
      capitulo_0.mostrar( player1);
      if(capitulo_0.escolha(texto) == 1){
        Capitulos capitulo_1 = new Capitulos();
        capitulo_1.narrativa = "Bom, aqui o senhor(a): " + player1.name + ", vai para os testes de aptidao fisica tem que fazer cinco flexoes, tres barras e vinte abdominais. Voce quer fazer agora ou deixar para amanha ? O que voce quer, hoje ou amanha ?";
        capitulo_1.escolhas[0] = "hoje";
        capitulo_1.escolhas[1] = "amanha";
        capitulo_1.mostrar(player1);
        if(capitulo_1.escolha(texto) == 1){
          System.out.println("Voce estava preparado para fazer todos os exercicios e foi para o escritorio assinar o contrato para ser encaminhado para o treinamento. Parabens," + player1.name + " ,voce esta no airborn, cia 22°, bem vindo ao exercito.");
        }
        else{
          System.out.println("Voce estava descansado, mas não conseguiu fazer os exercicios, você vai ter que ir embora filho.");
          player1.treinoNow = false;
        }
        
        
      }
      else{
        Capitulos capitulo_2 = new Capitulos();
        capitulo_2.narrativa = "Certo, voce tem que fazer teste de apitidao fisica, sao dois quilometros de corrida, tres quilometros e meio de natcao no mar, tres barras e quarenta abdominais. Voce quer fazer  hoje ou  amanha ?";
        capitulo_2.escolhas[0] = "hoje";
        capitulo_2.escolhas[1]= "amanha";
        capitulo_2.mostrar(player1);
        if(capitulo_2.escolha(texto)== 1){
          System.out.println("Você estava enfadado de mais para conseguir nadar e correr tanto e foi reprovado, pode ir embora garoto. ");
          player1.treinoNow = false;
        }
        else{
          System.out.println("Voce ficou com uma boa disposicao, e conseguiu nadar e correr sem muitos problemas e foi encaminhado para o escritório para assinar o contrato com a marinha, e vai para o treinamento, " + player1.name + ",você está na marinha parabéns.");
        }


  
      }
    }
     

     


       texto.close();
      }
    
      
}
