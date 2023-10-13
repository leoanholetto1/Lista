public class NoEstado {
    private String nome;
    private ListaCidade cid;
    private NoEstado prox;

    public NoEstado(String nome) {
        this.nome = nome;
        this.cid = new ListaCidade();
        this.prox = null;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ListaCidade getCid() {
        return cid;
    }

    public void setCid(ListaCidade cid) {
        this.cid = cid;
    }

    public NoEstado getProx() {
        return prox;
    }

    public void setProx(NoEstado prox) {
        this.prox = prox;
    }
}
