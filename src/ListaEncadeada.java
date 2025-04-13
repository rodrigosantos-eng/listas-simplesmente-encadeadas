public class ListaEncadeada {
    //Referência inicial da lista (head)
    private Celula inicio = null;

    public void inserir(String elemento){
        //cria uma celula
        Celula celula = new Celula();
        //recebe o elemento
        celula.setElemento(elemento);
        //verifica se a lista está vazia
        if(this.inicio == null){
            celula.setProximo(null);
            this.inicio = celula;
        } else {
            Celula ultimo = buscarUltimo();
            ultimo.setProximo(celula);
            celula.setProximo(null);
        }
    }

    private Celula buscarUltimo(){
        Celula atual = inicio;
        //Se a lista está vazia o inicio vai ser o null
        if(this.inicio == null){
            return null;
        }

        while (atual.getProximo() != null) {
            atual = atual.getProximo();
        }
        //Nesse momento o atual está apontando para nulo portanto ele é o último elemento
        return atual;
    }

    private Celula buscarPenultimo(){
        Celula atual = inicio;

        //Quando a lista está vazia
        if(this.inicio == null){
            return null;
        }

        //Quando só tem uma celula na lista
        if(this.inicio.getProximo() == null){
            return null;
        }

        while (atual.getProximo().getProximo() != null) {
            atual = atual.getProximo();
        }
        return atual;
    }

    public void imprimeLista(){
        Celula atual = inicio;

        if(this.inicio == null){
            System.out.println("A lista está vazia");
        } else {
            while (atual.getProximo() != null) {
                System.out.println(atual.getElemento() + "");
                atual = atual.getProximo();
            }
            System.out.println(atual.getElemento() + "");
        }
    }

    public void removerUltimo(){
        Celula penultimo = buscarPenultimo();

        //se não tiver penultimo a lista ficará vazia (inicio = null)
        if(penultimo == null){
            this.inicio = null;
        } else {
            //caso a lista tem penultimo o penultimo aponta para null
            penultimo.setProximo(null);
        }
    }
}