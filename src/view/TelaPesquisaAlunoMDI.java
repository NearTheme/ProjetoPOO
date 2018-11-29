/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.bean.Aluno;
import model.dao.AlunoDAO;

/**
 *
 * @author Luiz Oliveira
 */
public class TelaPesquisaAlunoMDI extends javax.swing.JInternalFrame {

    /**
     * Creates new form TelaPesquisaAlunoMDI
     */
    public TelaPesquisaAlunoMDI() {
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
        tfRA = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tfNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tfCurso = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tfCPF = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        tfSemestre = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        cfHorario = new javax.swing.JComboBox<>();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        tfEmail = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane10 = new javax.swing.JScrollPane();
        tableAlunos = new javax.swing.JTable();

        jPasswordField1.setText("jPasswordField1");

        setClosable(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Pesquisa"));

        try {
            tfRA.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#############")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel1.setText("RA");

        jLabel2.setText("Nome");

        jLabel3.setText("Curso");

        jLabel6.setText("CPF");

        try {
            tfCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel5.setText("Semestre");

        tfSemestre.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        jLabel4.setText("Horário");

        cfHorario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Manhã", "Tarde", "Noite" }));

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

        jButton5.setText("Deletar Aluno");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel7.setText("E-mail");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel6)
                        .addComponent(jLabel1)
                        .addComponent(tfEmail)
                        .addComponent(tfCPF, javax.swing.GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE)
                        .addComponent(tfRA))
                    .addComponent(jLabel7))
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel2))
                                        .addGap(49, 49, 49))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(cfHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jButton4)
                                        .addGap(47, 47, 47)
                                        .addComponent(jButton5))
                                    .addComponent(jLabel3)
                                    .addComponent(tfCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(tfSemestre, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfRA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfSemestre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(tfCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cfHorario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4)
                            .addComponent(jButton5))))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        tableAlunos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "RA", "Nome", "E-mail", "Curso", "CPF", "Semestre", "Horário"
            }
        ));
        tableAlunos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableAlunosMouseClicked(evt);
            }
        });
        tableAlunos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tableAlunosKeyReleased(evt);
            }
        });
        jScrollPane10.setViewportView(tableAlunos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 954, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        setBounds(240, 180, 1011, 483);
    }// </editor-fold>//GEN-END:initComponents

    private void tableAlunosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tableAlunosKeyReleased

        if (tableAlunos.getSelectedRow() != -1) {
            tfRA.setText(tableAlunos.getValueAt(tableAlunos.getSelectedRow(), 0).toString());
            tfNome.setText(tableAlunos.getValueAt(tableAlunos.getSelectedRow(), 1).toString());
            tfEmail.setText(tableAlunos.getValueAt(tableAlunos.getSelectedRow(), 2).toString());
            tfCurso.setText(tableAlunos.getValueAt(tableAlunos.getSelectedRow(), 3).toString());
            tfCPF.setText(tableAlunos.getValueAt(tableAlunos.getSelectedRow(), 4).toString());
            tfSemestre.setText(tableAlunos.getValueAt(tableAlunos.getSelectedRow(), 5).toString());
            cfHorario.setSelectedItem(tableAlunos.getValueAt(tableAlunos.getSelectedRow(), 6).toString());
        }
    }//GEN-LAST:event_tableAlunosKeyReleased

    private void tableAlunosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableAlunosMouseClicked

        if (tableAlunos.getSelectedRow() != -1) {
            tfRA.setText(tableAlunos.getValueAt(tableAlunos.getSelectedRow(), 0).toString());
            tfNome.setText(tableAlunos.getValueAt(tableAlunos.getSelectedRow(), 1).toString());
            tfEmail.setText(tableAlunos.getValueAt(tableAlunos.getSelectedRow(), 2).toString());
            tfCurso.setText(tableAlunos.getValueAt(tableAlunos.getSelectedRow(), 3).toString());
            tfCPF.setText(tableAlunos.getValueAt(tableAlunos.getSelectedRow(), 4).toString());
            tfSemestre.setText(tableAlunos.getValueAt(tableAlunos.getSelectedRow(), 5).toString());
            cfHorario.setSelectedItem(tableAlunos.getValueAt(tableAlunos.getSelectedRow(), 6).toString());
        }
    }//GEN-LAST:event_tableAlunosMouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        AlunoDAO dao = new AlunoDAO();
        Aluno al = dao.selecionar(tfRA.getText());
        int i = 0;
        //tfNome.setText(al.getNome());
        DefaultTableModel dtmPesquisaAlunos = (DefaultTableModel) tableAlunos.getModel();
        Object[] dados = {al.getRa(), al.getNome(), al.getEmail(), al.getCurso(), al.getCpf(),
             al.getSemestre(), al.getHorario()};
        
        if (dtmPesquisaAlunos.getRowCount() > 0) {
            for (i = 0; i < dtmPesquisaAlunos.getRowCount(); i++) {
                if (tfRA.getText().equals(dtmPesquisaAlunos.getValueAt(i, 0))) {
                    JOptionPane.showMessageDialog(null, "Aluno já registrado em tabela.");
                    break;
                }
            }
        }
        if (al.getRa() == null){
            JOptionPane.showMessageDialog(null, "Aluno não cadastrado!");
        }
        else if (i >= dtmPesquisaAlunos.getRowCount()){
            dtmPesquisaAlunos.addRow(dados);
        }

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        AlunoDAO dao = new AlunoDAO();
        dao.deletar(tfRA.getText());

        if (tableAlunos.getSelectedRow() != -1) {
            DefaultTableModel dtmPesquisaAlunos = (DefaultTableModel) tableAlunos.getModel();
            dtmPesquisaAlunos.removeRow(tableAlunos.getSelectedRow());
        } else {
            JOptionPane.showMessageDialog(null, "Nenhum registo selecionado.");
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        AlunoDAO dao = new AlunoDAO();
        Aluno al = new Aluno();
        String oldra = tableAlunos.getValueAt(tableAlunos.getSelectedRow(), 0).toString();
        al.setRa(tfRA.getText());
        al.setCpf(tfCPF.getText());
        al.setNome(tfNome.getText());
        al.setEmail(tfEmail.getText());
        al.setCurso(Integer.parseInt(tfCurso.getText()));
        al.setHorario(cfHorario.getSelectedItem().toString());
        al.setSemestre(Integer.parseInt(tfSemestre.getText()));

        dao.alterar(al, oldra);
        DefaultTableModel dtmPesquisaAlunos = (DefaultTableModel) tableAlunos.getModel();
        Object[] dados = {al.getRa(), al.getNome(), al.getEmail(), al.getCurso(), al.getCpf(),
             al.getSemestre(), al.getHorario()};
        dtmPesquisaAlunos.insertRow(tableAlunos.getSelectedRow(), dados);
        dtmPesquisaAlunos.removeRow(tableAlunos.getSelectedRow() + 1);

        //aluno.setRa(oldra);

    }//GEN-LAST:event_jButton4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cfHorario;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JTable tableAlunos;
    private javax.swing.JFormattedTextField tfCPF;
    private javax.swing.JTextField tfCurso;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JTextField tfNome;
    private javax.swing.JFormattedTextField tfRA;
    private javax.swing.JFormattedTextField tfSemestre;
    // End of variables declaration//GEN-END:variables
}
