import java.util.Scanner;

public class Player {
    String name; //nome 
     int energy; // energia
 
Player(String name, int energy){
this.name=name;
this.energy=energy;
}
// fatigue é igual fadiga e value é igual  valor, não se confunde. 

void fatigue(int value){
    this.energy -= value;
    if(value >= 10 ){
    System.out.println("Você está bem. Você apenas perdeu: " +  this.energy);
    }
   else if(value ==0){
        System.out.println("Você está sem como fazer mais nada não" +
        " tem energia"
        + ", vá descansar");

   }




}
// descansar é igual a rest e value2 é igual  valor2
// void rest( int value){
//     value = 5;
//     this.energy += value;
//     if(value == 0){
//   System.out.println("Você está descansando");
//     }
// else if(value == this.energy){
//     System.out.println("Você esta recuperado.");
// }

// }




//showEnergy é igual  mostrar energia, end  é igual fim 
void showEnergy(boolean end ){
if(end){
    System.out.println("Sua energia final é: " + this.energy);

}
else{
    System.out.println("Sua energia está em: " + this.energy);
}
}

void criarPersonagem(Scanner scan){
    
}


}

