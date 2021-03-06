/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import classes.Livro;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import repositorio.RepositorioLivro;

/**
 *
 * @author gabrielaambos
 */
public class TelaListarLivros extends javax.swing.JFrame {

    ArrayList<Livro> livros = new ArrayList<Livro>();
    
    /**
     * Creates new form TelaListarLivros
     */
    int tipo;
    
    public TelaListarLivros(int tipo) { //0 - Comprados; 1 - Desejados
        initComponents();
        this.tipo = tipo;
        if(tipo == 0) {
            livros = RepositorioLivro.pesquisarLivrosComprados("");
        } else {
            livros = RepositorioLivro.pesquisarLivrosDesejados("");
        }
        carregaTabela(livros);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        id_botaoVoltar = new javax.swing.JButton();
        id_campoPesquisar = new javax.swing.JTextField();
        id_botaoPesquisar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        id_tabelaLivros = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        id_botaoVoltar.setText("Voltar");
        id_botaoVoltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                id_botaoVoltarMouseClicked(evt);
            }
        });

        id_botaoPesquisar.setText("Filtrar");
        id_botaoPesquisar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                id_botaoPesquisarMouseClicked(evt);
            }
        });

        id_tabelaLivros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Titulo", "Autor", "Editora", "Série"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        id_tabelaLivros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                id_tabelaLivrosMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(id_tabelaLivros);
        if (id_tabelaLivros.getColumnModel().getColumnCount() > 0) {
            id_tabelaLivros.getColumnModel().getColumn(0).setPreferredWidth(200);
            id_tabelaLivros.getColumnModel().getColumn(1).setPreferredWidth(60);
            id_tabelaLivros.getColumnModel().getColumn(2).setPreferredWidth(60);
            id_tabelaLivros.getColumnModel().getColumn(3).setPreferredWidth(200);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(422, 422, 422)
                        .addComponent(id_botaoVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 877, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(id_campoPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 715, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(id_botaoPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(72, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(id_campoPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(id_botaoPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(id_botaoVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void id_botaoVoltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_id_botaoVoltarMouseClicked
        TelaPrincipal tela = new TelaPrincipal();
        tela.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_id_botaoVoltarMouseClicked

    private void id_botaoPesquisarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_id_botaoPesquisarMouseClicked
        atualizaTabela(id_campoPesquisar.getText());
    }//GEN-LAST:event_id_botaoPesquisarMouseClicked

    private void id_tabelaLivrosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_id_tabelaLivrosMousePressed
        if(evt.getClickCount() == 2) {
            int posicao = id_tabelaLivros.getSelectedRow();
                Livro livro = livros.get(posicao);
                TelaPesquisar tela = new TelaPesquisar(livro);
                tela.setVisible(true);
        }
    }//GEN-LAST:event_id_tabelaLivrosMousePressed

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        atualizaTabela("");
    }//GEN-LAST:event_formWindowGainedFocus

    private void atualizaTabela(String pesquisa) {
        if(this.tipo == 0) {
            livros = RepositorioLivro.pesquisarLivrosComprados(pesquisa);
        } else {
            livros = RepositorioLivro.pesquisarLivrosDesejados(pesquisa);
        }
        if(livros.isEmpty() && !pesquisa.isBlank()) {
            JOptionPane.showMessageDialog(rootPane, "Opps...nenhum livro encontrado");          
        } else {
            carregaTabela(livros);
        }
    }
    
    private void carregaTabela(ArrayList<Livro> livros) {
        DefaultTableModel tabela = (DefaultTableModel) id_tabelaLivros.getModel();
        tabela.setRowCount(0);
        //Para cada livro, na lista de livros
        for(Livro livro : livros) {
            tabela.addRow(new Object[]{
                livro.getTitulo(),
                livro.getAutor(),
                livro.getEditora(),
                livro.getSerie()
            });
        }
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
            java.util.logging.Logger.getLogger(TelaListarLivros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaListarLivros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaListarLivros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaListarLivros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaListarLivros(0).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton id_botaoPesquisar;
    private javax.swing.JButton id_botaoVoltar;
    private javax.swing.JTextField id_campoPesquisar;
    private javax.swing.JTable id_tabelaLivros;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
