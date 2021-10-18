/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package produto;

import java.util.Scanner;

/**
 *
 * @author Wilson Diniz Silva
 * Classe responsável pelo cadastro de produto
 */
public class CadastroProduto {

    /**
     * Metodo principal da classe CadastroProduto
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Produto produto = new Produto();
        
        System.out.print("Produto: ");
        produto.setDescricao(sc.nextLine());
        
        System.out.print("Categoria: ");
        produto.setCategoria(sc.nextLine());
        
        System.out.print("Valor Unitario: ");
        produto.setValorUnitario(sc.nextDouble());
        
        System.out.println(produto.getDescricao());
        System.out.println(produto.getCategoria());
        System.out.println(produto.getValorUnitario());
        
    } // Fim do método main
} // Fim da classe CadastroProduto
