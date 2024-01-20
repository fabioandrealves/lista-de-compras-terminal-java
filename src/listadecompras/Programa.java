/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package listadecompras;

import java.util.Scanner;

/**
 *
 * @author fabiojunior
 */
public class Programa {
       
   
    
    public static void main(String[] args) {
        
    
       Scanner scanner = new Scanner(System.in);
       ListaCompras tarefa = new ListaCompras();
       
       int opcao;
       
       
       do{
            System.out.println("===== Menu =====");
            System.out.println("1. Cadastrar novo produto");
            System.out.println("2. Adicionar produto à lista de compras");
            System.out.println("3. Imprimir lista de compras");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            
            opcao = scanner.nextInt();
            scanner.nextLine();
            
            switch(opcao){
                case 1:
                    tarefa.cadastrarProduto(scanner);
                break;
                case 2:
                    tarefa.adicionarProdutoLista();
                break;
                case 3:
                    tarefa.imprimirLista();
                break;
                case 0:
                    tarefa.sairDaLista(scanner);
                default:
                    System.out.println("Opcao invalida. Escolha uma opcao valida!");
            }
       }while(opcao != 0);

    }

}