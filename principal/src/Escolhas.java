public class Escolhas {
    private String texto;
    public String getTexto() {
        return texto;
    }
    private Capitulos proximo;

    public Escolhas(String texto, Capitulos proximo) {
        this.texto = texto;
        this.proximo = proximo;
    }
    public void executar(){
        this.proximo.executar();
        
    }
    
    
}
