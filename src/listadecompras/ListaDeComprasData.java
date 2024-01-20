package listadecompras; // Substitua pelo nome correto do pacote, se necessário

import java.util.ArrayList;

public class ListaDeComprasData {
    public final ArrayList<ItemLista> listaCompras = new ArrayList<>();

    public ArrayList<ItemLista> getListaCompras() {
        return listaCompras;
    }

    public void add(ItemLista item) {
        listaCompras.add(item);
    }
}

