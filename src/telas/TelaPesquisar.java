/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import classes.Livro;
import javax.swing.JOptionPane;
import repositorio.RepositorioLivro;

/**
 *
 * @author gabrielaambos
 */
public class TelaPesquisar extends javax.swing.JFrame {

    /**
     * Creates new form TelaPesquisar
     */
    private Livro livro;
    
    public TelaPesquisar(Livro livro) {
        initComponents();
        this.livro = livro;
        if(livro != null)
            carregaLivro(livro);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        id_tituloExibido = new javax.swing.JLabel();
        id_anoExibido = new javax.swing.JLabel();
        id_editoraExibida = new javax.swing.JLabel();
        id_autorExibido = new javax.swing.JLabel();
        id_edicaoExibida = new javax.swing.JLabel();
        id_serieExibida = new javax.swing.JLabel();
        id_voltar = new javax.swing.JButton();
        bt_editar = new javax.swing.JButton();
        bt_excluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        id_tituloExibido.setText("Título: ");

        id_anoExibido.setText("Ano: ");

        id_editoraExibida.setText("Editora: ");

        id_autorExibido.setText("Autor:");

        id_edicaoExibida.setText("Edição:");

        id_serieExibida.setText("Serie:");

        id_voltar.setText("Voltar");
        id_voltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                id_voltarMouseClicked(evt);
            }
        });
        id_voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_voltarActionPerformed(evt);
            }
        });

        bt_editar.setText("Editar");
        bt_editar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_editarMouseClicked(evt);
            }
        });

        bt_excluir.setText("Excluir");
        bt_excluir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_excluirMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(id_tituloExibido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(id_anoExibido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(id_editoraExibida, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
                        .addComponent(id_autorExibido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(id_edicaoExibida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(id_serieExibida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(id_voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(bt_editar, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(bt_excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(75, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(id_tituloExibido, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(id_anoExibido, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(id_editoraExibida, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(id_autorExibido, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(id_edicaoExibida, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(id_serieExibida, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(id_voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_editar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void id_voltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_id_voltarMouseClicked
        this.setVisible(false);
    }//GEN-LAST:event_id_voltarMouseClicked

    private void bt_excluirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_excluirMouseClicked
       int confirmeDialog = JOptionPane.showConfirmDialog(rootPane, "Tem certeza que deseja deletar? ", "excluir livro", 0); //Sim e Nao
       if(confirmeDialog == 0) {
            boolean deletado = RepositorioLivro.deletarLivro(this.livro);
            if(deletado) {
                JOptionPane.showMessageDialog(rootPane, "Livro deletado com sucesso!");
                this.setVisible(false);
            } else {
                JOptionPane.showMessageDialog(rootPane, "Ocorreu um erro ao deletar, tente novamente!");
            }
       }
       
    }//GEN-LAST:event_bt_excluirMouseClicked

    private void bt_editarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_editarMouseClicked
        TelaAdicionarLivro tela = new TelaAdicionarLivro(this.livro);
        tela.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_bt_editarMouseClicked

    private void id_voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_voltarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id_voltarActionPerformed

    private void carregaLivro(Livro livro) {
        id_tituloExibido.setText("Titulo: " + livro.getTitulo());
        id_anoExibido.setText("Ano: " + livro.getAno() + "");
        id_autorExibido.setText("Autor: " + livro.getAutor());
        id_edicaoExibida.setText("Edicao: " + livro.getEdicao());
        id_serieExibida.setText("Serie: " + livro.getSerie());
        id_editoraExibida.setText("Editora: " + livro.getEditora());
    }
    
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
            java.util.logging.Logger.getLogger(TelaPesquisar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPesquisar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPesquisar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPesquisar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPesquisar(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_editar;
    private javax.swing.JButton bt_excluir;
    private javax.swing.JLabel id_anoExibido;
    private javax.swing.JLabel id_autorExibido;
    private javax.swing.JLabel id_edicaoExibida;
    private javax.swing.JLabel id_editoraExibida;
    private javax.swing.JLabel id_serieExibida;
    private javax.swing.JLabel id_tituloExibido;
    private javax.swing.JButton id_voltar;
    // End of variables declaration//GEN-END:variables
}
