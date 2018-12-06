/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.bean.Curso;
import model.dao.CursoDAO;

/**
 *
 * @author Eduardo Soares
 */
public class TelaPesquisaCursoMDI extends javax.swing.JInternalFrame {

    /**
     * Creates new form TelaPesquisaAlunoMDI
     */
    public TelaPesquisaCursoMDI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPasswordField1 = new javax.swing.JPasswordField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tfNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tfDatafim = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cfHorario = new javax.swing.JComboBox<>();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        tfCodigo = new javax.swing.JTextField();
        tfDatainicio = new javax.swing.JTextField();
        jScrollPane10 = new javax.swing.JScrollPane();
        tableCursos = new javax.swing.JTable();

        jPasswordField1.setText("jPasswordField1");

        setClosable(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Pesquisa"));

        jLabel1.setText("Codigo");

        jLabel2.setText("Nome");

        jLabel3.setText("Data Fim");

        jLabel6.setText("Data Inicio");

        jLabel4.setText("Horário");

        cfHorario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Manhã", "Tarde", "Noite" }));
        cfHorario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cfHorarioActionPerformed(evt);
            }
        });

        jButton3.setText("Pesquisar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Salvar Alterações");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Deletar Curso");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        tfCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCodigoActionPerformed(evt);
            }
        });

        tfDatainicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfDatainicioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addGap(54, 54, 54)
                .addComponent(jButton5)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(tfDatainicio, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(99, 99, 99)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(tfDatafim, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel4)
                        .addComponent(cfHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(67, 67, 67))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cfHorario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(jButton3))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfDatafim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfDatainicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(14, 14, 14)
                        .addComponent(jButton4))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jButton5)))
                .addContainerGap())
        );

        tableCursos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nome", "Horário", "Data Inicio", "Data Fim"
            }
        ));
        tableCursos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableCursosMouseClicked(evt);
            }
        });
        tableCursos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tableCursosKeyReleased(evt);
            }
        });
        jScrollPane10.setViewportView(tableCursos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane10)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE)
                .addContainerGap())
        );

        setBounds(240, 180, 921, 492);
    }// </editor-fold>//GEN-END:initComponents

    private void tableCursosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tableCursosKeyReleased

        if (tableCursos.getSelectedRow() != -1) {
            tfCodigo.setText(tableCursos.getValueAt(tableCursos.getSelectedRow(), 0).toString());
            tfNome.setText(tableCursos.getValueAt(tableCursos.getSelectedRow(), 1).toString());
            cfHorario.setSelectedItem(tableCursos.getValueAt(tableCursos.getSelectedRow(), 2).toString());
            tfDatainicio.setText(tableCursos.getValueAt(tableCursos.getSelectedRow(), 3).toString());
            tfDatafim.setText(tableCursos.getValueAt(tableCursos.getSelectedRow(), 4).toString());
        }
    }//GEN-LAST:event_tableCursosKeyReleased

    private void tableCursosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableCursosMouseClicked

        if (tableCursos.getSelectedRow() != -1) {
            tfCodigo.setText(tableCursos.getValueAt(tableCursos.getSelectedRow(), 0).toString());
            tfNome.setText(tableCursos.getValueAt(tableCursos.getSelectedRow(), 1).toString());
            cfHorario.setSelectedItem(tableCursos.getValueAt(tableCursos.getSelectedRow(), 2).toString());
            tfDatainicio.setText(tableCursos.getValueAt(tableCursos.getSelectedRow(), 3).toString());
            tfDatafim.setText(tableCursos.getValueAt(tableCursos.getSelectedRow(), 4).toString());
        }
    }//GEN-LAST:event_tableCursosMouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        CursoDAO dao = new CursoDAO();
        Curso curso = dao.selecionar(Integer.parseInt(tfCodigo.getText()));
        int i = 0;

        DefaultTableModel dtmPesquisaCursos = (DefaultTableModel) tableCursos.getModel();
        Object[] dados = {curso.getCodigo(), curso.getNome(), curso.getHorario(), curso.getDatainicio(), curso.getDatafim()};
        dtmPesquisaCursos.addRow(dados);
        
        if (curso.getCodigo() <= 0){
            JOptionPane.showMessageDialog(null, "Curso não cadastrado!");
        }
        else if (dtmPesquisaCursos.getRowCount() > 0) {
            for (i = 0; i < dtmPesquisaCursos.getRowCount(); i++) {
                if (tfCodigo.getText().equals(dtmPesquisaCursos.getValueAt(i, 0))) {
                    JOptionPane.showMessageDialog(null, "Curso já registrado em tabela.");
                    break;
                }
            }
        }
        
        else if (i >= dtmPesquisaCursos.getRowCount()){
            dtmPesquisaCursos.addRow(dados);
        }

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        CursoDAO dao = new CursoDAO();
        dao.deletar(Integer.parseInt(tfCodigo.getText()));

        if (tableCursos.getSelectedRow() != -1) {
            DefaultTableModel dtmPesquisaCursos = (DefaultTableModel) tableCursos.getModel();
            dtmPesquisaCursos.removeRow(tableCursos.getSelectedRow());
        } else {
            JOptionPane.showMessageDialog(null, "Nenhum registo selecionado.");
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        CursoDAO dao = new CursoDAO();
        Curso curso = new Curso();
        int oldcodigo = Integer.parseInt(tfCodigo.getText());

        curso.setNome(tfNome.getText());
        curso.setHorario(cfHorario.getSelectedItem().toString());
        curso.setDatainicio(tfDatainicio.getText());
        curso.setDatafim(tfDatafim.getText());

        dao.alterar(curso, oldcodigo);
        DefaultTableModel dtmPesquisaCursos = (DefaultTableModel) tableCursos.getModel();
        Object[] dados = {tfCodigo.getText(), curso.getNome(), curso.getHorario(), curso.getDatainicio(), curso.getDatafim()};
        dtmPesquisaCursos.insertRow(tableCursos.getSelectedRow(), dados);
        dtmPesquisaCursos.removeRow(tableCursos.getSelectedRow() + 1);

    }//GEN-LAST:event_jButton4ActionPerformed

    private void cfHorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cfHorarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cfHorarioActionPerformed

    private void tfDatainicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfDatainicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfDatainicioActionPerformed

    private void tfCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCodigoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cfHorario;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JTable tableCursos;
    private javax.swing.JTextField tfCodigo;
    private javax.swing.JTextField tfDatafim;
    private javax.swing.JTextField tfDatainicio;
    private javax.swing.JTextField tfNome;
    // End of variables declaration//GEN-END:variables
}
