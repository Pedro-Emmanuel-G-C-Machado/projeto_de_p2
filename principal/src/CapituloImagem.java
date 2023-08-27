import java.util.Scanner;

public class CapituloImagem extends Capitulos {
private String imagem;

    public void setImagem(String imagem) {
    this.imagem = imagem;
}

    public CapituloImagem(Player criarPersonagem, Scanner texto) {
        super(criarPersonagem, texto);
         
    }

    public void mostrar(Player criarPersonagem ){
       System.out.println(this.imagem);
       super.mostrar(criarPersonagem);
    }
}
