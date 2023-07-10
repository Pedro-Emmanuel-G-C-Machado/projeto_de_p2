import java. util. Scanner;


public class Capitulos {
    String narrativa; 
    int alteracaoDeEnergia;
    String escolhas[];
    public Capitulos(){
        escolhas = new String[2];
    }
    public void mostrar(Player criarPersonagem ){
        System.out.println(narrativa);
               

        criarPersonagem.fatigue(alteracaoDeEnergia);


    }
    public int escolha(Scanner texto){
       String armazenar = texto.nextLine();
    
        while(!armazenar.equalsIgnoreCase( escolhas[0]) && !armazenar.equalsIgnoreCase(  escolhas[1])){
            System.out.println("Opcao invalida digite novamente.");
            armazenar = texto.nextLine();
        }
        if(armazenar.equalsIgnoreCase(escolhas[0])){
            return 1;
        }
        else{
            return 2;
        }
    }
    
}
