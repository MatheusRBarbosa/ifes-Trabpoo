/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Control.ItemControl;
import Model.Eletronico;
import Model.FileR;
import Model.Item;
import Model.ItemCasa;
import Model.Livro;
import Model.Produto;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;

/**
 *
 * @author mathe
 */
public class Menu extends javax.swing.JFrame {

    FileR file;
    Produto produtos;
    ItemControl itemControl;
    Item item;
    Map<Integer, ArrayList<Item>> itens;
    private boolean finded = false;

    public Menu() {
        item = new Item();
        file = new FileR();
        itemControl = new ItemControl();
        initComponents();
    }

    /**
     * Creates new form NewJFrame
     */
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        textFieldBusca = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnHistorico = new javax.swing.JButton();
        btnComprar = new javax.swing.JButton();
        fileSelect = new javax.swing.JButton();
        textFieldFileName = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        comboBox = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        listItens = new javax.swing.JList<>();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Busca Produtos");

        jLabel1.setText("Busca:");

        textFieldBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldBuscaActionPerformed(evt);
            }
        });

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnHistorico.setText("Histórico de compra");

        btnComprar.setText("Comprar");
        btnComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprarActionPerformed(evt);
            }
        });

        fileSelect.setText("...");
        fileSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fileSelectActionPerformed(evt);
            }
        });

        textFieldFileName.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        textFieldFileName.setText("Selecione o arquivo");
        textFieldFileName.setEnabled(false);

        jLabel2.setText("Arquivo de texto:");

        comboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Codigo", "Nome", "Tipo", "Loja" }));

        jScrollPane1.setViewportView(listItens);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textFieldFileName, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fileSelect)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(comboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(textFieldBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnBuscar)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 136, Short.MAX_VALUE)
                        .addComponent(btnHistorico)
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGap(247, 247, 247)
                .addComponent(btnComprar)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldFileName, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(fileSelect))
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar)
                    .addComponent(btnHistorico)
                    .addComponent(comboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnComprar)
                .addGap(40, 40, 40))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textFieldBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldBuscaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldBuscaActionPerformed

    private void btnComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnComprarActionPerformed

    private void fileSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fileSelectActionPerformed
        JFileChooser fileChooser = new JFileChooser();

        int returnVal = fileChooser.showOpenDialog(Menu.this);

        if (returnVal == fileChooser.APPROVE_OPTION) {

            setVisible(false);
            String path = fileChooser.getSelectedFile().getAbsolutePath();
            String filename = fileChooser.getSelectedFile().getName();

            //This is where a real application would open the file.
            FileR file = new FileR();
            try {
                produtos.setProdutos(file.readFile(path));
                itemControl.setItens(produtos.getProdutos());

            } catch (IOException ex) {
            }

            textFieldFileName.setText(filename);
            this.show();

        }
    }//GEN-LAST:event_fileSelectActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed

        String conteudo = textFieldBusca.getText();
        String cb = (String) comboBox.getSelectedItem();
        DefaultListModel dlm = new DefaultListModel();
        itens = item.getItens();

        if (itens != null) {
            if (cb.equals("Codigo")) {
                int codigo = Integer.parseInt(conteudo);
                if (this.itens.containsKey(codigo)) {
                    finded = true;
                    for (int j = 0; j < itens.get(codigo).size(); j++) {
                        dlm.addElement(itens.get(codigo).get(j).toString());
                    }
                    listItens.setModel(dlm);
                }
            } else if (cb.equals("Nome")) {
                for (Integer i : itens.keySet()) {
                    for (int j = 0; j < itens.get(i).size(); j++) {
                        if (itens.get(i).get(j).getProduto().getNome().toUpperCase().contains(conteudo.toUpperCase())) {
                            finded = true;
                            dlm.addElement(itens.get(i).get(j).toString());
                        }
                    }
                    listItens.setModel(dlm);
                }
            } else if (cb.equals("Tipo")) {
                if ("LIVRO".contains(conteudo.toUpperCase())) {
                    for (Integer i : itens.keySet()) {
                        for (int j = 0; j < itens.get(i).size(); j++) {
                            if (itens.get(i).get(j).getProduto() instanceof Livro) {
                                dlm.addElement(itens.get(i).get(j).toString());
                            }
                        }
                        listItens.setModel(dlm);
                    }
                } else if ("ELETRONICO".contains(conteudo.toUpperCase())) {
                    for (Integer i : itens.keySet()) {
                        for (int j = 0; j < itens.get(i).size(); j++) {
                            if (itens.get(i).get(j).getProduto() instanceof Eletronico) {
                                dlm.addElement(itens.get(i).get(j).toString());
                            }
                        }
                        listItens.setModel(dlm);
                    }
                } else if ("ITEMCASA".contains(conteudo.toUpperCase())) {
                    for (Integer i : itens.keySet()) {
                        for (int j = 0; j < itens.get(i).size(); j++) {
                            if (itens.get(i).get(j).getProduto() instanceof ItemCasa) {
                                dlm.addElement(itens.get(i).get(j).toString());
                            }
                        }
                        listItens.setModel(dlm);
                    }
                }
            } else if (cb.equals("Loja")) {
                for (Integer i : itens.keySet()) {
                    for (int j = 0; j < itens.get(i).size(); j++) {
                        if (itens.get(i).get(j).getLoja().getNome().toUpperCase().contains(conteudo.toUpperCase())) {
                            dlm.addElement(itens.get(i).get(j).toString());
                        }
                    }
                }
                listItens.setModel(dlm);
            }
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnComprar;
    private javax.swing.JButton btnHistorico;
    private javax.swing.JComboBox<String> comboBox;
    private javax.swing.JButton fileSelect;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JList<String> listItens;
    private javax.swing.JTextField textFieldBusca;
    private javax.swing.JLabel textFieldFileName;
    // End of variables declaration//GEN-END:variables
}
