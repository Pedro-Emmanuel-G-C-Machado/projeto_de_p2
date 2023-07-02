import java. util. Scanner;


public class Capitulos {
    String narrativa; 
    int alteracaoDeEnergia; 
    String escolha1 = ""; 
    String escolha2 = "";    
    public void mostrar(Player criarPersonagem ){
        System.out.println(narrativa);
                System.out.println("");
        System.out.println(escolha1);
        System.out.println(escolha2);
                System.out.println("");

        criarPersonagem.fatigue(alteracaoDeEnergia);


    }
    public int escolha(Scanner texto){
       String armazenar = texto.nextLine();
    
        while(!armazenar.equalsIgnoreCase(escolha1) && !armazenar.equalsIgnoreCase(escolha2)){
            System.out.println("Opcao invalida digite novamente.");
            armazenar = texto.nextLine();
        }
        if(armazenar.equalsIgnoreCase(escolha1)){
            return 1;
        }
        else{
            return 2;
        }
    }
    
}
