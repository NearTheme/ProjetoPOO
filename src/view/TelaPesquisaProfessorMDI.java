/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.bean.Pessoa;
import model.bean.Professor;
import model.dao.PessoaDAO;
import model.dao.ProfessorDAO;

/**
 *
 * @author Eduardo Soares
 */
public class TelaPesquisaProfessorMDI extends javax.swing.JInternalFrame {

    /**
     * Creates new form TelaPesquisaAlunoMDI
     */
    public TelaPesquisaProfessorMDI() {
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
        tfRM = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tfNome = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tfCPF = new javax.swing.JFormattedTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        tfEmail = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tfEspecializacao = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        tfHorasdedicacao = new javax.swing.JTextField();
        tfFormacao = new javax.swing.JTextField();
        jScrollPane10 = new javax.swing.JScrollPane();
        tableProfessores = new javax.swing.JTable();

        jPasswordField1.setText("jPasswordField1");

        setClosable(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Pesquisa"));

        try {
            tfRM.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#############")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel1.setText("RM");

        jLabel2.setText("Nome");

        jLabel6.setText("CPF");

        tfCPF.setEditable(false);
        try {
            tfCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

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

        jButton5.setText("Deletar Professor");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel7.setText("E-mail");

        jLabel5.setText("Formacao");

        jLabel3.setText("Especializacao");

        jLabel13.setText("Horas de Dedicacao");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tfCPF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE)
                    .addComponent(tfRM, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(tfEmail))
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5)
                            .addComponent(jLabel2)
                            .addComponent(tfNome, javax.swing.GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE)
                            .addComponent(tfFormacao))
                        .addGap(47, 47, 47)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
                            .addComponent(tfEspecializacao)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(tfHorasdedicacao, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(269, 269, 269)
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton5)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(tfRM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfHorasdedicacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4)
                            .addComponent(jButton5)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfEspecializacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton3)
                            .addComponent(tfFormacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        tableProfessores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CPF", "RM", "Nome", "E-Mail", "Formacao", "Especializacao", "Horas Dedicacao"
            }
        ));
        tableProfessores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableProfessoresMouseClicked(evt);
            }
        });
        tableProfessores.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tableProfessoresKeyReleased(evt);
            }
        });
        jScrollPane10.setViewportView(tableProfessores);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 993, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                .addContainerGap())
        );

        setBounds(240, 180, 1011, 492);
    }// </editor-fold>//GEN-END:initComponents

    private void tableProfessoresKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tableProfessoresKeyReleased

        if (tableProfessores.getSelectedRow() != -1) {
            tfCPF.setText(tableProfessores.getValueAt(tableProfessores.getSelectedRow(), 0).toString());
            tfRM.setText(tableProfessores.getValueAt(tableProfessores.getSelectedRow(), 1).toString());
            tfNome.setText(tableProfessores.getValueAt(tableProfessores.getSelectedRow(), 2).toString());
            tfEmail.setText(tableProfessores.getValueAt(tableProfessores.getSelectedRow(), 3).toString());
            tfFormacao.setText(tableProfessores.getValueAt(tableProfessores.getSelectedRow(), 4).toString());   
            tfEspecializacao.setText(tableProfessores.getValueAt(tableProfessores.getSelectedRow(), 5).toString());
            tfHorasdedicacao.setText(tableProfessores.getValueAt(tableProfessores.getSelectedRow(), 6).toString());// talvez precisa converter inteiro
        }
    }//GEN-LAST:event_tableProfessoresKeyReleased

    private void tableProfessoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableProfessoresMouseClicked

        if (tableProfessores.getSelectedRow() != -1) {
            tfCPF.setText(tableProfessores.getValueAt(tableProfessores.getSelectedRow(), 0).toString());
            tfRM.setText(tableProfessores.getValueAt(tableProfessores.getSelectedRow(), 1).toString());
            tfNome.setText(tableProfessores.getValueAt(tableProfessores.getSelectedRow(), 2).toString());
            tfEmail.setText(tableProfessores.getValueAt(tableProfessores.getSelectedRow(), 3).toString());
            tfFormacao.setText(tableProfessores.getValueAt(tableProfessores.getSelectedRow(), 4).toString());   
            tfEspecializacao.setText(tableProfessores.getValueAt(tableProfessores.getSelectedRow(), 5).toString());
            tfHorasdedicacao.setText(tableProfessores.getValueAt(tableProfessores.getSelectedRow(), 6).toString());// talvez precisa converter inteiro
        }
    }//GEN-LAST:event_tableProfessoresMouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        ProfessorDAO dao = new ProfessorDAO();
        Professor prof = dao.selecionar(tfRM.getText());
        int i = 0;

        DefaultTableModel dtmPesquisaProfessores = (DefaultTableModel) tableProfessores.getModel();
        Object[] dados = {prof.getCpf(), prof.getRm(), prof.getNome(), prof.getEmail(), prof.getFormacao(), prof.getEspecializacao(),
             prof.getHorasdedicacao()};
        
        if (dtmPesquisaProfessores.getRowCount() > 0) {
            for (i = 0; i < dtmPesquisaProfessores.getRowCount(); i++) {
                if (tfRM.getText().equals(dtmPesquisaProfessores.getValueAt(i, 1))) {
                    JOptionPane.showMessageDialog(null, "Professor já registrado em tabela.");
                    break;
                }
            }
        }
        if (prof.getRm() == null){
            JOptionPane.showMessageDialog(null, "Professor não cadastrado!");
        }
        else if (i >= dtmPesquisaProfessores.getRowCount()){
            dtmPesquisaProfessores.addRow(dados);
        }

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        ProfessorDAO dao = new ProfessorDAO();
        dao.deletar(tfRM.getText());

        if (tableProfessores.getSelectedRow() != -1) {
            DefaultTableModel dtmPesquisaProfessores = (DefaultTableModel) tableProfessores.getModel();
            dtmPesquisaProfessores.removeRow(tableProfessores.getSelectedRow());
        } else {
            JOptionPane.showMessageDialog(null, "Nenhum registo selecionado.");
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        ProfessorDAO dao = new ProfessorDAO();
        PessoaDAO dao2 = new PessoaDAO();
        Professor prof = new Professor();
        
        //String oldcpf = tableProfessores.getValueAt(tableProfessores.getSelectedRow(), 0).toString();
        String oldrm = tableProfessores.getValueAt(tableProfessores.getSelectedRow(), 1).toString();
        
        prof.setRm(tfRM.getText());
        prof.setCpf(tfCPF.getText());
        prof.setNome(tfNome.getText());
        prof.setEmail(tfEmail.getText());
        prof.setFormacao(tfFormacao.getText());
        prof.setEspecializacao(tfEspecializacao.getText());
        prof.setHorasdedicacao(Integer.parseInt(tfHorasdedicacao.getText()));

        dao.alterar(prof, oldrm);
        dao2.alterar(prof);
        DefaultTableModel dtmPesquisaProfessores = (DefaultTableModel) tableProfessores.getModel();
        Object[] dados = {prof.getCpf(), prof.getRm(), prof.getNome(), prof.getEmail(), prof.getFormacao(), prof.getEspecializacao(), prof.getHorasdedicacao()};
        dtmPesquisaProfessores.insertRow(tableProfessores.getSelectedRow(), dados);
        dtmPesquisaProfessores.removeRow(tableProfessores.getSelectedRow() + 1);


    }//GEN-LAST:event_jButton4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JTable tableProfessores;
    private javax.swing.JFormattedTextField tfCPF;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JTextField tfEspecializacao;
    private javax.swing.JTextField tfFormacao;
    private javax.swing.JTextField tfHorasdedicacao;
    private javax.swing.JTextField tfNome;
    private javax.swing.JFormattedTextField tfRM;
    // End of variables declaration//GEN-END:variables
}
