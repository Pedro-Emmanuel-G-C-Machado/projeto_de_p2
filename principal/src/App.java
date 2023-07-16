import java.util.Scanner;

public class App{
    public static void  main(String args[]) {
     
     // você jogador.
      Scanner texto = new Scanner(System.in);
      Player player1= new Player();
      player1.criarPersonagem(texto);

      System.out.println("Nome do jogador 1:" + player1.name);
        System.out.println("-----------------------------------");
      // personagem amigo da marinha 
      Player player2= new Player();
      player2.name = "Desmond Milles";
      player2.forces = "marinha";
     // personagem amigo do exercito 
      Player player3 = new Player();
      player3.name = "Marsh Cooper";
      player3.forces = "exercito";
     
      Capitulos capitulo_0 = new Capitulos(player1 , texto);
      capitulo_0.narrativa = "Bem, senhor(a):" + player1.name + ", você  quer ser de qual  força armada, infelizmente  temos vagas apenas para o exercito e a marinha, qual é a sua escoolha, O exercito ou a marinha ? ";
      
      Capitulos capitulo_1 = new Capitulos(player1, texto);
      capitulo_1.narrativa = "Bom, aqui o senhor(a): " + player1.name + ", vai para os testes de aptidao fisica tem que fazer cinco flexoes, tres barras e vinte abdominais. Voce quer fazer agora ou deixar para amanha ? O que voce quer, hoje ou amanha ?";
      Capitulos capitulo_1_1 = new Capitulos(player1,texto);
      capitulo_1_1.narrativa  = "Voce estava descansado, mas não conseguiu fazer os exercicios, você vai ter que ir embora filho.";
      Capitulos capitulo_1_2 = new Capitulos(player1, texto); 
      capitulo_1_2.narrativa = "Voce estava preparado para fazer todos os exercicios e foi para o escritorio assinar o contrato para ser encaminhado para o treinamento. Parabens," + player1.name + " ,voce esta no airborn, cia 22°, bem vindo ao exercito.";
      
      
      Capitulos capitulo_2 = new Capitulos(player1, texto);
      capitulo_2.narrativa ="Certo, voce tem que fazer teste de apitidao fisica, sao dois quilometros de corrida, tres quilometros e meio de natcao no mar, tres barras e quarenta abdominais. Voce quer fazer  hoje ou  amanha ?";
      Capitulos capitulo_2_1 = new Capitulos(player1, texto);
      capitulo_2_1.narrativa = "Voce ficou com uma boa disposicao, e conseguiu nadar e correr sem muitos problemas e foi encaminhado para o escritório para assinar o contrato com a marinha, e vai para o treinamento, " + player1.name + ",você está na marinha parabéns."; 
      Capitulos capitulo_2_2 = new Capitulos(player1, texto);
      capitulo_2_2.narrativa ="Você estava enfadado de mais para conseguir nadar e correr tanto e foi reprovado, pode ir embora garoto. ";
       
      capitulo_0.adicionarEscolhas("exercito", capitulo_1);
      capitulo_0.adicionarEscolhas("marinha", capitulo_2);

      capitulo_1.adicionarEscolhas("hoje", capitulo_1_1);
      capitulo_1.adicionarEscolhas("amanha", capitulo_1_2);

      capitulo_2.adicionarEscolhas("hoje", capitulo_2_2);
      capitulo_2.adicionarEscolhas("amanha" , capitulo_2_1); 
      if(player1.apto()) capitulo_0.executar();


       texto.close();
      }
    
      
}
