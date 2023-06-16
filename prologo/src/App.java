import java.util.Scanner;

public class App{
    public static void  main(String args[]) {
      //Estouu fazendo a primeira parte perguntando o nome e idade do jogador. (NOME = NAME E IDADE = AGE)
     
     
      Scanner texto = new Scanner(System.in);
        String name; 
        System.out.println("Olá, bem vindo ao recrutamento miltar, qual é o seu nome?");
        name = texto.nextLine(); 
        System.out.println("Certo senhor(a):" + name);
    
        System.out.println("Qual é a sua idade?"); 
        int age = texto.nextInt();
        texto.nextLine();
    
               System.out.println("--------"); 

        if( age >= 18){
            System.out.println("Certo você é apto, para a próxima etapa da seleção de ingresso, prossiga. ");
                                          System.out.println("--------"); 

        }
        // se cair no else o codigo tem voltar para o inicio.
        else{
            System.out.println("Você não tem idade suficiente para servir ao seu país, vai ter que servir de uma outra forma,"+ name + ". PRÓXIMO !");
            System.exit(0);
        }
    // depois do if vamos fazer a segunda seleção. (FORCES = FORÇAS)

      String forces  ;
      System .out.println("Bem, senhor(a):" + name +"você quer ser de qual  força armada, infelizmente  temos vagas apenas para o exercito e a marinha, qual é a sua escoolha, O exercito ou a marinha ? ");
       forces = texto.nextLine();
                                                     System.out.println("--------"); 


       if(forces.equalsIgnoreCase("exercito")){
      // vamos fazer um if e else dentro do if. choses = escolhas
      String choses;
      System.out.println("Bom, aqui o senhor(a): " + name + ",vai para os testes de aptidão fisíca tem que fazer cinco flexões, três barras e vinte abdominais. Você quer fazer agora ou deixar para amanhã ? O que você quer, hoje ou amanhã ?" );
      choses = texto.nextLine();
                                              System.out.println("--------"); 

      if(choses.equalsIgnoreCase("hoje")){
        System.out.println("Você estava animado e fez todos os exercícios tranquilamente e foi para o escritório assinar o contrato para ser encaminhado para o treinamento. Parabéns," + name + " ,você está no airborn, cia 22°, bem vindo ao exercito."); 
            
      }
     else{
      System.out.println("Você ficou frio e não conseguiu fazer todos, você vai ter que ir embora filho.");
     }
      }
      else if(forces.equalsIgnoreCase("marinha")){
      String choses2;
      System.out.println("Certo, você tem que fazer teste de apitidão física, são dois quilometros de corrida, três quilometros e meio de natção no mar, três barras e quarenta abdominais. Você quer vim hoje ou  amanhã ? ");
      choses2=  texto.nextLine();
                                                    System.out.println("--------"); 

       if(choses2.equalsIgnoreCase("hoje")){
        System.out.println("Você estava enfadado de mais para conseguir nadar e correr tanto e foi reprovado, pode ir embora garoto. ");


       }
       else if(choses2.equalsIgnoreCase("amanhã")){
        System.out.println("Você ficou com uma disposição, e conseguiu nadar e correr sem muitos problemas e foi encaminhado para o escritório para assinar o contrato com a marinha, e vai para o treinamento, " + name + ",você está na marinha parabéns.");

       }
      }
    
}
}