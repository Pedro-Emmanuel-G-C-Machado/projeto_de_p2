import java.util.ArrayList;
import java. util. Scanner;


public class Capitulos {
    Player jogador;
    Scanner leitor; 
    String narrativa; 
    int alteracaoDeEnergia;
    ArrayList<Escolhas> Lescolhas; 
    public Capitulos(Player criarPersonagem, Scanner texto){
        Lescolhas =  new ArrayList<Escolhas>();
        jogador = criarPersonagem; 
        leitor = texto;

    }
    private void mostrar(Player criarPersonagem ){
       
        System.out.println(narrativa);
        for (int i = 0; i < Lescolhas.size(); i++) {
            System.out.println(Lescolhas.get(i).getTexto());
            
        }
    
    
        criarPersonagem.fatigue(alteracaoDeEnergia);
  

    }
    private int choice(Scanner texto){
       String armazenar = texto.nextLine();
       boolean opcaoValida = false; 
    
    
        while(!opcaoValida){
            for (int index = 0; index < Lescolhas.size(); index++) {
                if(Lescolhas.get(index).getTexto().equalsIgnoreCase(armazenar)){
                    opcaoValida = true;

                    return index;
                }
            }
            if(!opcaoValida){ 
                System.out.println("Opcao invalida digite novamente.");
                armazenar = texto.nextLine();
            }
        }
        return -1;
       
    }
    public void executar() {
        mostrar(jogador);
        if(Lescolhas.size() > 0){ 
            int preferencia = choice(leitor);
            Lescolhas.get(preferencia).executar();  
              
        }
        
    }
    public void adicionarEscolhas(String texto , Capitulos proximo){
        Lescolhas.add(new Escolhas(texto, proximo));
    }
    
}
