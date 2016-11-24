/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modulo_comercial;

import java.util.HashMap;
import java.util.Map;
/**
 *
 * @author Helder
 */
public class interface_comercial extends javax.swing.JFrame {

    /**
     * Creates new form interface_comercial
     */
    
    ControleEstoque estoque;
    Funcionario vendedor;
    
    private void criarTabela(){
        Object [] cols = {"Id","nome","valor","quantidade"};
        Object [][] data = new Object[estoque.produtos.size()][4];
        
        int i=0;
        for (Map.Entry<String, ControleProduto> entry : this.estoque.produtos.entrySet()) 
        { 
            ControleProduto cp = entry.getValue();
            
            data[i][0] = cp.produto.id;
            data[i][1] = cp.produto.nome;
            data[i][2] = new Float(cp.produto.valor);
            data[i][3] = new Integer(cp.quantidade);
            i++;
        }
        this.jTablelaProdutos.setModel(new javax.swing.table.DefaultTableModel(data,cols));
        
    }
    
    public interface_comercial(ControleEstoque estoque,Funcionario f) {
        this.estoque = estoque;
        this.vendedor = f; 
        initComponents();
        criarTabela();
        
        jLabelNome.setText(this.vendedor.nome);
        
        
    }
        
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelNome = new javax.swing.JLabel();
        jBtnVender = new javax.swing.JButton();
        jBtnAtulizar = new javax.swing.JButton();
        jBoxBuscar = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTablelaProdutos = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jBoxQtt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jBtnBuscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelNome.setText("Nome");

        jBtnVender.setText("Vender");
        jBtnVender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnVenderActionPerformed(evt);
            }
        });

        jBtnAtulizar.setText("Atualizar");
        jBtnAtulizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAtulizarActionPerformed(evt);
            }
        });

        jTablelaProdutos.setAutoCreateRowSorter(true);
        jTablelaProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTablelaProdutos);
        jTablelaProdutos.getAccessibleContext().setAccessibleName("jTabelaProdutos");
        jTablelaProdutos.getAccessibleContext().setAccessibleDescription("");

        jLabel2.setText("Lista de Produtos");

        jBoxQtt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBoxQttActionPerformed(evt);
            }
        });

        jLabel1.setText("Quantidade");

        jBtnBuscar.setText("Buscar");
        jBtnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelNome)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jBtnBuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBoxBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jBtnAtulizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jBtnVender, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBoxQtt, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelNome)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnVender)
                    .addComponent(jBoxQtt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jBoxBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBtnAtulizar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(4, 4, 4)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabelNome.getAccessibleContext().setAccessibleName("jnomeUsuario");
        jBtnVender.getAccessibleContext().setAccessibleName("jVender");
        jBtnAtulizar.getAccessibleContext().setAccessibleName("jAtualizar");
        jBoxBuscar.getAccessibleContext().setAccessibleName("jBuscar");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnVenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnVenderActionPerformed
        try{
            int index = jTablelaProdutos.getSelectedRow();
            Object id = jTablelaProdutos.getValueAt(index, 0);

            ControleProduto cp = estoque.produtos.get(id.toString());
            try{
                int qtd = Integer.valueOf(jBoxQtt.getText());
                boolean result = estoque.pegarProduto(cp.produto, qtd);
                if(result)
                    criarTabela();
            }catch(Exception e){
                System.out.println("Selecione a quantia desejada para venda");
                return;
            }
            
        }catch(Exception e){
            System.out.println("Selecione um produto da tabela");
        }
    }//GEN-LAST:event_jBtnVenderActionPerformed

    private void jBoxQttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBoxQttActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBoxQttActionPerformed

    private void jBtnAtulizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAtulizarActionPerformed
        criarTabela();
    }//GEN-LAST:event_jBtnAtulizarActionPerformed

    private void jBtnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnBuscarActionPerformed
        String busca = jBoxBuscar.getText();
        
        for(int i = 0;i < jTablelaProdutos.getRowCount();i++){
            if(busca.equals(jTablelaProdutos.getValueAt(i, 1))){
                jTablelaProdutos.setRowSelectionInterval(i, i);
                
              
                return;
            }
        }
        System.out.println("Produto não encontrado");
    }//GEN-LAST:event_jBtnBuscarActionPerformed

    /**
     * @param args the command line arguments
     */
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField jBoxBuscar;
    private javax.swing.JTextField jBoxQtt;
    private javax.swing.JButton jBtnAtulizar;
    private javax.swing.JButton jBtnBuscar;
    private javax.swing.JButton jBtnVender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTablelaProdutos;
    // End of variables declaration//GEN-END:variables
}
