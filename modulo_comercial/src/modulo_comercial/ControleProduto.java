/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modulo_comercial;

/**
 *
 * @author Helder
 */
public class ControleProduto{
        public Produto produto;
        public int quantidade;
        public int minimo;
        
        public ControleProduto(Produto p, int min,int quantidade){
            this.produto = p;
            this.minimo = min;
            this.quantidade = quantidade;
        }  
           
}