public class ListaCidade {
    private NoCidade inicio,fim;
    public ListaCidade() {
        this.inicio = null;
        this.fim = null;
    }

    public void insert(String cidade){
        NoCidade novo;
        if(fim == null){
            novo = new NoCidade(cidade);
            inicio = fim = novo;
        }
        else{
            NoCidade aux = buscaCidade(cidade);
            if(aux == null){
                novo = new NoCidade(cidade);
                fim.setProx(novo);
                fim = novo;
            }
        }
    }

    public NoCidade buscaCidade(String cidade) {
        NoCidade aux = inicio;
        while (aux!= null && aux.getNome().equals(cidade) == false){
            aux = aux.getProx();
        }
        return aux;
    }

    public void exibirCidade(){
        NoCidade aux = inicio;
        while(aux != null){
            System.out.println(aux.getNome());
            aux = aux.getProx();
        }
    }

    public void ordena(){
        NoCidade aux = inicio,aux2,menor;
        String valor;
        while(aux != null){
            aux2 = aux;
            menor = aux;
            while(aux2!=null){
                if(aux2.getNome().compareTo(menor.getNome()) < 0 ){
                    menor = aux2;
                }
                aux2 = aux2.getProx();
            }
            if(aux != menor){
                valor = aux.getNome();
                aux.setNome(menor.getNome());
                menor.setNome(valor);
            }
            aux = aux.getProx();
        }
    }

}
