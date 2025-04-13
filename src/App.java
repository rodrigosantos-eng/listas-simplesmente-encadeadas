public class App {
    public static void main(String[] args) throws Exception {
        ListaEncadeada listaEncadeada = new ListaEncadeada();

        listaEncadeada.inserir("Rodrigo");
        listaEncadeada.inserir("Gabriel");
        listaEncadeada.inserir("João");
        listaEncadeada.removerUltimo();
        listaEncadeada.removerUltimo();
        listaEncadeada.removerUltimo();
        listaEncadeada.imprimeLista();
    }
}
