import java.util.Scanner;

public class App{
    public static void  main(String args[]) {
      //Estouu fazendo a primeira parte perguntando o nome e idade do jogador. (NOME = NAME E IDADE = AGE)
     
     
      Scanner texto = new Scanner(System.in);
      Player player1= new Player();
      player1.criarPersonagem(texto);

    // depois do if vamos fazer a segunda seleção. (FORCES = FORÇAS)
    if(player1.apto())   player1.escolhaMilitar(texto);

      Player player2 = new Player(); 
      player2.criarPersonagem(texto);
          if(player2.apto())  player2.escolhaMilitar(texto);

      System.out.println("Nome do jogador 1:" + player1.name);
      System.out.println("Nome do jogador 2:" + player2.name);
      Treinamento treinar = new Treinamento();
     if(player1.apto())  treinar .main(texto, player1);
      if(player2.apto())  treinar .main(texto, player2);
       texto.close();
      }
    
      
}
