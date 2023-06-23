import java.util.Scanner;

public class Player {
    String name; //nome 
     int energy = 100; // energia
     int age; // idade
    String forces  ;// força armada.
    boolean treinoNow = true;


// fatigue é igual fadiga e value é igual  valor, não se confunde. 

public void fatigue(int value){
    this.energy -= value;
    if(energy >= 10 ){
    System.out.println("Você está bem. Você apenas perdeu: " + energy);
    }
    else if (energy > 0 ){
        System.out.println ("Cuidado você está ficando com pouca energia.");
    }
   else{
        System.out.println("Você está sem como fazer mais nada não  tem energia, vá descansar");

   }




}
//descansar é igual a rest e value2 é igual  valor2
 public void rest( int value){
    this.energy += value;
    if(energy >= 100){
  System.out.println("Você está descansado");
  energy = 100; 

    }
else{
    System.out.println("Você esta se recuperando.");
}

}




//showEnergy é igual  mostrar energia, end  é igual fim 
public void showEnergy(boolean end ){
if(end){
    System.out.println("Sua energia final é: " + this.energy);

}
else{
    System.out.println("Sua energia está em: " + this.energy);
}
}

public void criarPersonagem(Scanner texto){
         
        System.out.println("Olá, bem vindo ao recrutamento miltar, qual é o seu nome?");
        name = texto.nextLine(); 
        System.out.println("Certo senhor(a):" + name);
    
        System.out.println("Qual é a sua idade?"); 
        age = texto.nextInt();
        texto.nextLine();
    
               System.out.println("--------"); 
if(age >= 40){
System.out.println("Você é muito velho para fazer qualquer coisa  aqui, suma daqui! ");


}
        else if(apto()){
            System.out.println("Certo você é apto, para a próxima etapa da seleção de ingresso, prossiga. ");
                                          System.out.println("--------"); 

        }
        else{
            System.out.println("Você não tem idade suficiente para servir ao seu país, vai ter que servir de uma outra forma,"+ name + ". PRÓXIMO !");
            
}


}


public void escolhaMilitar(Scanner texto){
        
      System .out.println("Bem, senhor(a):" + name +", você quer ser de qual  força armada, infelizmente  temos vagas apenas para o exercito e a marinha, qual é a sua escoolha, O exercito ou a marinha ? ");
       forces = texto.nextLine();
                                                     System.out.println("--------"); 


       if(forces.equalsIgnoreCase("exercito")){
      // vamos fazer um if e else dentro do if. choses = escolhas
      String choses;
      System.out.println("Bom, aqui o senhor(a): " + name + ", vai para os testes de aptidão fisíca tem que fazer cinco flexões, três barras e vinte abdominais. Você quer fazer agora ou deixar para amanhã ? O que você quer, hoje ou amanhã ?" );
      choses = texto.nextLine();
                                              System.out.println("--------"); 

      if(choses.equalsIgnoreCase("hoje")){
        System.out.println("Você estava preparado para fazer todos os exercícios e foi para o escritório assinar o contrato para ser encaminhado para o treinamento. Parabéns," + name + " ,você está no airborn, cia 22°, bem vindo ao exercito."); 
            
      }
     else{
      System.out.println("Você estava descansado, mas não conseguiu fazer os exercícios, você vai ter que ir embora filho.");
    treinoNow = false;
    }
      }
      else if(forces.equalsIgnoreCase("marinha")){
      String choses2;
      System.out.println("Certo, você tem que fazer teste de apitidão física, são dois quilometros de corrida, três quilometros e meio de natção no mar, três barras e quarenta abdominais. Você quer fazer  hoje ou  amanhã ? ");
      choses2=  texto.nextLine();
                                                    System.out.println("--------"); 

       if(choses2.equalsIgnoreCase("hoje")){
        System.out.println("Você estava enfadado de mais para conseguir nadar e correr tanto e foi reprovado, pode ir embora garoto. ");
            treinoNow = false;


       }
       else{
        System.out.println("Você ficou com uma boa disposição, e conseguiu nadar e correr sem muitos problemas e foi encaminhado para o escritório para assinar o contrato com a marinha, e vai para o treinamento, " + name + ",você está na marinha parabéns.");

       }


}



}
public boolean apto(){
    return age >= 18 && age < 40 && treinoNow; 
    
}

}
