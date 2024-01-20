
package listadecompras;

public class ItemLista {
    public int quantidade;
    public Produto produto;

    public ItemLista(int quantidade, Produto produto) {
        this.quantidade = quantidade;
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
    public float calcularTotal() {
        return quantidade * produto.getPreco();
    }

}
