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
public class Modulo_comercial {

    /**
     * @param args the command line arguments
     */
    
    static void popularEstoque(ControleEstoque estoque){
        String [] nomes = {"Hidrogenio",
                           "Oxigenio",
                           "Cloreto de potassio",
                           "Sulfato Ferroso",
                           "Cloreto de Sódio",
                           "Agua pesada",
                           "Uranio","Plutonio","Torio","Cesio","Sodio","Fluor"};
        
        float valores[] = {12.2f,
                            50.0f,
                            5.3f,
                            2.5f,
                            8.9f,
                            120.0f,
                            5600.0f,5600.0f,4400.0f,1200.0f,56.0f,12.0f};
        
        for(int i=0;i < nomes.length;i++){
            Produto p = new Produto(nomes[i], valores[i], Integer.toString(i));
            estoque.criarProduto(p,5,10);
        }
}
    
    public static void main(String[] args) {
        
        ControleEstoque estoque = new ControleEstoque();
        popularEstoque(estoque);
        
        Funcionario func1 = new Funcionario("Andressa", "Vendas");
        Funcionario func2 = new Funcionario("Helder", "Vendas");
        
        
        // TODO code application logic here
        //interface_comercial inter = new interface_comercial();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new interface_comercial(estoque,func1).setVisible(true);
            }
        });
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new interface_comercial(estoque,func2).setVisible(true);
            }
        });
        
    }
    
}
