import java.util.Scanner;

public class Player {
    String name; //nome 
     int energy = 100; // energia
     int age; // idade
    String forces  ;// força armada.
    int life = 1000;
    boolean treinoNow = true;
    boolean die = false;

// fatigue é igual fadiga e value é igual  valor, não se confunde. 

public void fatigue(int value){
    this.energy -= value;
    if(energy >= 10 ){
    System.out.println("Você está bem, com: " + energy + " de energia.");
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
    System.out.println("Você esta se recuperando mas , está com: " + energy + ".");
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
// função para dano 
/**
 * @param value
 */
public void damage( int value){
    this.life -= value;
    if(life >= 100 ){
        System.out.println("Você está sem nehum ferimento e está com: " + life + ", não se preocupe.");
         
    }
    else if( life >= 10 && life < 100 ){
        System.out.println("Você já está com vários ferimentos busque alguma forma de se recuperar, pois voce esta com : " + life );
    }
    else if (life >=1 && life < 10 ){
        System.out.println("Voce esta criticamente ferido, procure um medico !");
    }
     else{
        System.out.println("Você morreu.");
        die = true;
     }
}

public void recover(int value){
    life += value;
    if(life >= 1000){
  System.out.println("Voce está recuperado.");
  energy = 1000; 

    }
else{
    System.out.println("Você esta se recuperando mas , está com: " + life + ".");
}


}


// aqui é a parte da força armada.
public boolean apto(){
    return age >= 18 && age < 40; 
    
}

}
