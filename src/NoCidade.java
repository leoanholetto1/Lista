public class NoCidade {
    private String nome;
    private NoCidade prox;

    public NoCidade(String nome) {
        this.nome = nome;
        this.prox = null;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public NoCidade getProx() {
        return prox;
    }

    public void setProx(NoCidade prox) {
        this.prox = prox;
    }
}
