import java. util. Scanner;


public class Capitulos {
    String narrativa; 
    int alteracaoDeEnergia;
    String escolhas[];
    public Capitulos(int qt){
        escolhas = new String[qt];
    }
    public void mostrar(Player criarPersonagem ){
        System.out.println(narrativa);
               

        criarPersonagem.fatigue(alteracaoDeEnergia);


    }
    public int escolha(Scanner texto){
       String armazenar = texto.nextLine();
       boolean opcaoValida = false; 
    
    
        while(!opcaoValida){
            for (int index = 0; index < escolhas.length; index++) {
                if(escolhas[index].equalsIgnoreCase(armazenar)){
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
    
}
