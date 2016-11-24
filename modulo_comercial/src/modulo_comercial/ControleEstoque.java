/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Helder
 */

package modulo_comercial;

import java.util.HashMap;

public class ControleEstoque {
    
    HashMap<String,ControleProduto> produtos = new HashMap<String,ControleProduto>();
    
    public ControleEstoque(){
    }
    
    public boolean criarProduto(Produto p,int min,int quantidade){
        synchronized(produtos){
            if(produtos.containsKey(p.id)){
                System.out.println("Produto ja existente.");
                return false;
            }

            ControleProduto cp = new ControleProduto(p,min,quantidade);
            try{
                System.out.println("Produto inserido com sucesso");
                produtos.put(p.id, cp);
                return true;
            }catch(Exception e){
                System.out.println("Erro ao inserir produto");
            }
        }
        return false;
    }
    
    public boolean addProduto(Produto p,int quantidade){
        synchronized(produtos){
            if(produtos.containsKey(p.id)){
                ControleProduto cp = produtos.get(p.id);
                cp.quantidade += quantidade;
                return true;
            }

            System.out.println("Produto inexixtente, insira um novo produto com o ID desejado");
        }
        return false;
    }
    
    public boolean pegarProduto(Produto p,int quantidade){
        
    synchronized(produtos){    
        if(produtos.containsKey(p.id)){
            ControleProduto cp = produtos.get(p.id);
            if((cp.quantidade - quantidade) < 0 ){
                System.out.println("Quantidade desejada indisponivel");
                return false;
            }
            cp.quantidade -= quantidade;
            if(cp.quantidade <= cp.minimo)
                alerta(cp);
            
            return true;
        }
    }
        System.out.println("Produto inexixtente, insira um novo produto com o ID desejado");
        return false;
       
    }
    public boolean removerProduto(Produto p){
        
        synchronized(produtos){
            if(produtos.containsKey(p.id)){
                ControleProduto cp = produtos.get(p.id);

                if(cp.quantidade > 0){
                    System.out.println("Impossivel remover o produto " + cp.produto.nome + " pois ainda existem unidades em estoque");
                    return false;
                }
                produtos.remove(cp.produto.id);
                return true;
            }
        }
        System.out.println("ERRO! Produto inexistente");
        return false;
    }
    
    //Funcao chamada para alertar o vendedor que a quantidade de determinado
    //produto esta abaixo do limiar permitido
    
    private void alerta(ControleProduto cp){
        System.out.println("O produto" + cp.produto.nome + " possui apenas "+ cp.quantidade
        + " unidades em estoque, é necessario efetuar a reposição");
    }
}
