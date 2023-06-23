import java.util.Scanner;

public class Treinamento {
    public void main(Scanner texto, Player jogadorTreinando){
        System.out.println("Começar o treinamento de " + jogadorTreinando.name);
        if(jogadorTreinando.forces.equalsIgnoreCase("marinha")){ 
            System.out.println("Bem vindo a marinha seu imundo, aqui você não é mais" + 
                "além de um caçador de Japas e chucrutes" +
                "miseraveis agora eu quero saber se você não" + 
                "é um inutil," + 
                " meu nome" + "É Sgt.Morris e antes de mais nada me pague cinco flexõex !"); 
            jogadorTreinando.fatigue(1);
           
            

        }


    }
    
}
