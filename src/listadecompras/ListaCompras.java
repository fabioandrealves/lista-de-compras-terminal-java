package listadecompras;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ListaCompras {
   private float totalCompra = 0.0f;
    public ArrayList<ItemLista> carrinho = new ArrayList<>();
    public Produto novoProduto = null;
    public Random random = new Random();

    public void cadastrarProduto(Scanner scanner) {
    int codigo = random.nextInt(1000);
    System.out.println("Digite o nome do produto: ");
    String nome = scanner.nextLine();

    System.out.println("Digite a quantidade a ser comprada: ");
    int quantidade = scanner.nextInt();

    System.out.println("Digite o preço do produto:");
    float preco = lerPreco(scanner);

    novoProduto = new Produto(codigo, nome, preco);
    ItemLista novoItem = new ItemLista(quantidade, novoProduto); // Associa o produto ao item
    carrinho.add(novoItem);

    System.out.println("Produto cadastrado com sucesso!");
}


    public void adicionarProdutoLista() {
        if (!carrinho.isEmpty()) {
            System.out.println("Produto adicionado à lista de compras!");
            novoProduto = null;
        } else {
            System.out.println("Cadastre um produto primeiro!");
        }
    }

    private float lerPreco(Scanner scanner) {
        while (true) {
            try {
                return Float.parseFloat(scanner.next());
            } catch (java.util.InputMismatchException e) {
                System.out.println("Valor inválido. Digite um preço válido: ");
                scanner.next(); // Limpar a entrada inválida do Scanner
            }
        }
    }

public void imprimirLista() {
    if (carrinho.isEmpty()) {
        System.out.println("Nenhum produto cadastrado.");
        return;
    }

    System.out.println("===== Lista de Compras =====");
    for (ItemLista item : carrinho) {
        System.out.println("Produto: " + item.getProduto().getNome());
        System.out.println("Quantidade: " + item.getQuantidade());
        System.out.println("Preço unitário: " + item.getProduto().getPreco());
        totalCompra += item.calcularTotal();
    }
    System.out.println("Total da compra: R$" + totalCompra);
}



    public void sairDaLista(Scanner scanner) {
       try (scanner) {
           System.out.println("Saindo...");
       }
        System.exit(0);
    }
}



