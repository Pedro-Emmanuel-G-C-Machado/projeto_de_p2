import java.util.Scanner;

public class Treinamento {
    public void main(Scanner texto, Player jogadorTreinando){
       String exercicio;
        System.out.println("Começar o treinamento de " + jogadorTreinando.name);
        if(jogadorTreinando.forces.equalsIgnoreCase("marinha")){ 
            System.out.println("Bem vindo a marinha seu imundo, aqui você não é nada mais " + 
                " do que  um caçador de Japas e chucrutes " +
                " miseraveis agora eu quero saber se você é ou não" + 
                " é um inutil," + 
                "  meu nome" + " é,  Sgt.Morris e antes de mais nada me pague cinco flexões !"); 
                                                          System.out.println("--------"); 

            jogadorTreinando.fatigue(1);
                                                      System.out.println("--------"); 

          System.out.println("Levanta, vamos começar o treinamento de verdade mocinahas,"
           + "quero que vocês acompanhem o meu assistente o cabo, Mars e vão para pista."
           + "depois de dez minutos você chegou a pista de exercícios tem duas opções," +
           "corrida ou barra ?");
                                                        System.out.println("--------"); 

         exercicio = texto.nextLine();
         
         if(exercicio.equalsIgnoreCase("corrida")){
           System.out.println("Você correu muito afoitamente e não fez um bom percurso");
                                                     System.out.println("--------"); 

           jogadorTreinando.fatigue(15);
                                                    System.out.println("--------"); 


         }
         else{
            System.out.println("Você conseguiu performar muito bem na barra e foi bem rápido");
                                                      System.out.println("--------"); 

            jogadorTreinando.fatigue(5);
                                                      System.out.println("--------"); 

         }
         System.out.println("Chega que horror nunca vi uma turma" +
         "tão ruim quanto essa que tenebroso,"+
         "acredito senhores que vocês estão aqui na marinha por que sabem nadar, agora quero" +
         " que me provem." +
         "Você foi em caminhado para uma praia você deve nadar um quilometro de ida e volta" + 
          "qual é o estilo ? peito ou crau. " ); 
                                                    System.out.println("--------"); 

         exercicio = texto.nextLine();
         if(exercicio.equalsIgnoreCase("peito")){
            System.out.println("Você nadou bem e conseguiu ir e voltar sem muita dificuldade.");
             jogadorTreinando.fatigue(20);

        }
        else{
            System.out.println("Você no meio do caminho ficou tonto e teve que fazer o dobro de esforço");
            jogadorTreinando.fatigue(40);
        }
                                                  System.out.println("--------"); 
        System.out.println("Meu Deus como a minha querida marinha foi arrumar vocês? " + 
        "certo miseraveis vocês vão conhecer a sua amante aquela que vai salvar vocês, " +
        "a minha querida m4 garand, e a tarde inteira você ficou praticando tiro ao alvo,  depois disso foi dormir. "
        );
                                                          System.out.println("--------"); 

        jogadorTreinando.showEnergy(false); 
                                                          System.out.println("--------"); 

       jogadorTreinando.rest(100); 



    }

    else{
      System.out.println("Bem vindos ao exercito seu imundo, aqui você não é nada mais " + 
                " do que  um caçador de Japas e chucrutes " +
                " miseraveis agora eu quero saber se você é ou não" + 
                " é um inutil," + 
                "  meu nome" + " é,  Sgt.Morris e antes de mais nada me pague cinco flexões !");
                                                                              System.out.println("--------"); 

                jogadorTreinando.fatigue(1);
                                                     System.out.println("--------"); 
      System.out.println("vanta, vamos começar o treinamento de verdade mocinahas,"
           + "quero que vocês acompanhem o meu assistente o cabo, Mars e vão para pista."
           + "depois de dez minutos você chegou a pista de exercícios tem duas opções," +
           "corrida ou barra ?");
                                                                System.out.println("--------"); 

           exercicio = texto.nextLine(); 

     if(exercicio.equalsIgnoreCase("corrida")){
        System.out.println("Você correu como uma flecha e fez o percurso sem nenhuma dificuldade.");
        jogadorTreinando.fatigue(5);

     }
     else{
        System.out.println("Você não foi bem na barra e se cansou muito.");
        jogadorTreinando.fatigue(15);
     }  
     System.out.println("Meu Deus, Chega que horror nunca vi uma turma" +
         "tão ridícula quanto essa que tenebroso," + "Vamos fazer mais exercícios agora vamos fazer a subida na corda" +
         "também podemos fazer ou flexões? " + "corda ou flexões"        
          );
     exercicio = texto.nextLine();
     if(exercicio.equalsIgnoreCase("corda")){
        System.out.println("Você  estava mal, mas como a subida era curta você conseguiu subir.");
        jogadorTreinando.fatigue(20);
                                                    System.out.println("--------"); 

     }
     else{
        System.out.println("Você  se esforçou muito para fazer todas as flexões.");
        jogadorTreinando.fatigue(45);
     }
    System.out.println("Meu Deus como o meu amado exercito foi arrumar vocês? " + 
        "certo miseraveis vocês vão conhecer a sua amante aquela que vai salvar vocês, " +
        "a minha querida m4 garand, e a tarde inteira você ficou praticando tiro ao alvo, depois disso foi dormir.");
     jogadorTreinando.showEnergy(false);
                                                       System.out.println("--------"); 

     
     jogadorTreinando.rest(100);
                                                       System.out.println("--------"); 

    }
    
}
}