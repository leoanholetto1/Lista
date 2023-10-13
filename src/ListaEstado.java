public class ListaEstado {
    private NoEstado inicio,fim;

    public ListaEstado() {
        this.inicio = null;
        this.fim = null;
    }

    public void insert(String estado,String cidade){
        NoEstado novo;
        if(fim == null){
            novo = new NoEstado(estado);
            inicio = fim = novo;
            novo.getCid().insert(cidade);
        }
        else{
            NoEstado aux = buscaEstado(estado);
            if(aux == null){
                novo = new NoEstado(estado);
                novo.getCid().insert(cidade);
                fim.setProx(novo);
                fim = novo;
            }
            else{
                aux.getCid().insert(cidade);
            }
        }
    }

    public NoEstado buscaEstado(String estado) {
        NoEstado aux = inicio;
        while (aux!= null && aux.getNome().equals(estado) == false){
            aux = aux.getProx();
        }
        return aux;
    }

    public void exibirEstado(){
        NoEstado aux = inicio;
        while(aux != null){
            System.out.println(aux.getNome());
            aux = aux.getProx();
        }
    }

    public void exibirListaCidades(String estado){
        NoEstado aux = buscaEstado(estado);
        if(aux == null){
            System.out.println("Estado não encontrado!");
        }
        else{
            aux.getCid().exibirCidade();
        }
    }

    public boolean buscaEstadoCidade(String estado,String cidade){
        NoEstado auxE = buscaEstado(estado);
        if(auxE == null){
            return false;
        }
        else{
            NoCidade auxC = auxE.getCid().buscaCidade(cidade);
            if(auxC == null){
                return false;
            }
            else{
                return true;
            }
        }
    }

    public void ordenaEstado(){
        NoEstado aux = inicio,aux2;
        String valor;
        ListaCidade cid;
        while(aux != null){
            aux2 = inicio;
            while(aux2.getProx()!=null){
                if(aux2.getNome().compareTo(aux2.getProx().getNome()) > 0 ){
                    valor = aux2.getNome();
                    aux2.setNome(aux2.getProx().getNome());
                    aux2.getProx().setNome(valor);
                    cid = aux2.getCid();
                    aux2.setCid(aux2.getProx().getCid());
                    aux2.getProx().setCid(cid);
                }
                aux2 = aux2.getProx();
            }
            aux = aux.getProx();
        }
    }

    public void ordenaCidade(String estado) {
        NoEstado aux = buscaEstado(estado);
        if (aux != null) {
            aux.getCid().ordena();
        }
        else{
            System.out.println("Estado não encontrado!");
        }
    }
}
