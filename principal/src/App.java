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
      player2.name = "Desmond\n";
      player2.forces = "marinha";
     // personagem amigo do exercito 
      Player player3 = new Player();
      player3.name = "Marshall\n";
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
        capitulo_2.narrativa ="Certo, voce tem que fazer teste de apitidao fisica, sao dois quilometros de corrida, " +
        " tres quilometros e meio de natcao no mar, tres barras e quarenta abdominais."
         + "Voce quer fazer  hoje ou  amanha ?";
          Capitulos capitulo_2_1 = new Capitulos(player1, texto);
          capitulo_2_1.narrativa = "Voce ficou com uma boa disposicao, e conseguiu nadar e correr" + 
          "sem muitos problemas e foi encaminhado para o escritório para assinar o contrato com a marinha, e vai para o treinamento, "
          + player1.name + 
          ",você está na marinha parabéns.";
          Capitulos capitulo_2_2 = new Capitulos(player1, texto);
          capitulo_2_2.narrativa ="Você estava enfadado de mais para"+
           "conseguir nadar e correr tanto" +
          "e foi reprovado, pode ir embora garoto. ";



          Capitulos capitulos_3 = new Capitulos(player1, texto);
          capitulos_3.narrativa ="Depois do treinamento de paraquedista, voce conheceu "
          + player3.name +
          "e viraram parceiros de farda, quando voce terminou voces foram colocados na operacao do dia D, porem voces nao sabiam o que iam fazer "+
          "voce estava em um avião cargueiro, ja anoitecendo com mais dez paraquedistas, voce percebia as bombas e as defesas antiaeras destruindo os outros avioes, ate que voce se depara com" +
          " o seu oficial  fazendo movimentos com as maos para"+
           "para indicar o momento do salto e voce se organiza para isso, nesse momento "+
           "um chaqualhao acontece no aviao, que foi atingida por um disparo, e voce e obrigado a saltar, mas antes disso" +
           player3.name + ",ficou meio preso no equipamento o que voce faz ?";
           Capitulos capitulo_3_1 = new Capitulos(player1, texto);
           capitulo_3_1.narrativa = "Voce descidiu ajudar o " 
           + player3.name 
           + "voce correu e quando chegou perto," 
           +   "viu que estava predendendo ele e rapidamente, coseguiu" 
           + "tiralo dali, mas isso teve um custo pela reacao rapida custou um pouco de energia" 
           + "depois dissos voces sairam do aviao o mais rapido possivel." 
           + "ja no ceu descendo voce percebe que o aviao explodiu poco tempo depois de voces sairem, e depois de se voltarem para o chao voce ve um campo vazio, que nao tinha nenhum sinal de tropas, mas"
           + "voce fica com sua M1 Garand em maos e fica esperando por um" 
           + "combate, no entanto quando voce aterriza nao ve nenhum alemao"
           + "e tambem ao mesmo tempo nenhum sinal do seu pelotao, e esta,e " 
           + player3.name 
           +"quiz procurar os outros, mas tambem reconheceu que era muito tarde para isso e deixou no seu encargo de descidir" 
           + " você vai ficar e montar um acampamento ou vai procurar o seu pelotao ?"; 
          capitulo_3_1.alteracaoDeEnergia = 5;
          Capitulos capitulo_3_2 = new Capitulos(player1, texto);
          capitulo_3_2.narrativa = "Voce foi para a beira do aviao decidido em saltar, mas se arrempedeu e quiz voltar e quando você estava se aproximando dele, o aviao explode e voces dois morrem junto com o piloto";



          Capitulos capitulo_4 = new Capitulos(player1, texto);
          capitulo_4.narrativa = 	"Durante o treinamento voce fica amigo" 
          + player2.name 
          + " e se consideram irmaos de farda e na marinha voces ficam na parte de operar pecas de artilharias navais"
          + " e depois do treinamento ele e voce foi desiginado para as ilhas do pacifico"
          + " estava no atol de Midway, estava ensolarado, e tranquilo não viam nada alem de oceano"
          + " ate que ouviram um aviao e em seguida um som de explosão com essa explosão, "
       + " eles correram para os postos e começaram a disparar nos aviões japoneses, "
       + "enquanto eles atiravam viram um aviao ja danificado vindo em direcao deles, mais especificamente para o navio"
       + "e" 
       + player2.name 
       + " disse para voce destruir de vez o aviao, mas voce sentiu que poderia usar de alguma forma.";

       Capitulos capitulo_4_1 = new Capitulos(player1, texto);
       capitulo_4_1.narrativa = "Voce seguiu a sugestao dele e destruiu de vez o aviao, mas a batalha ainda nao tinha acabado e com isso voce "
       + " se vira para um encouracado japones que estava se virando para voce disparando no navio, mas o dano"
      + " nao foi grande para os marinheiros se preocupar mas eles sairam da peca de artilharia " 
            +" quando saiu foram mandados para a cabine de comando, voce viu o seu comandante desesperado, pois nao sabia como sair dessa"
      + " situacao com isso voces dois recebe uma ordem de ir para o paiol para pegar mais municao, so que voce ouve mais um explosao"
            + "e o navio dessa vez ficou bem danificado";
       Capitulos capitulo_4_2 = new Capitulos(player1, texto);
       capitulo_4_2.narrativa = "Voce seguiu seu pensamento e não destruiu, o aviao caiu no conves do navio nao explodiu"
       + " e voce saiu rapidamente foi em direcao ao aviao e voce conseguiu abrir a  cabine e la o piloto estava morto " 
       + "e voce conseguiu uma carta e voce levou imediatamente para a cabine de comando e la voce entregou imediatamente"
        + " para o seu comandante e ele extremamente satisfeito ele pediu para que esperasse a proxima ordem ";
     





















       
      capitulo_0.adicionarEscolhas("exercito", capitulo_1);
      capitulo_0.adicionarEscolhas("marinha", capitulo_2);
      
      capitulo_1.adicionarEscolhas("hoje", capitulo_1_2);
      capitulo_1.adicionarEscolhas("amanha", capitulo_1_1); 
     capitulo_1_2.adicionarEscolhas("continuar",capitulos_3);

      capitulo_2.adicionarEscolhas("hoje", capitulo_2_2);
      capitulo_2.adicionarEscolhas("amanha" , capitulo_2_1); 
      capitulo_2_1.adicionarEscolhas("continuar" , capitulo_4); 


      capitulos_3.adicionarEscolhas("ajudar" , capitulo_3_1);
     capitulos_3.adicionarEscolhas("saltar" , capitulo_3_2);


     capitulo_4.adicionarEscolhas("destruir", capitulo_4_1);
     capitulo_4.adicionarEscolhas("poupar o avião" , capitulo_4_2);
 

      if(player1.apto()) capitulo_0.executar();


       texto.close();
      }
    
      
}
