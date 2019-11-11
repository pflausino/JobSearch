/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guii;

import dao.CurriculumDao;
import dao.QualificationDao;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import poo.Curriculum;
import poo.Qualification;
import poo.Vaga;
import poo.Qualification;
import dao.VagaDao;
import gui.component.CurriculumTableModel;
import gui.component.VagasTableModel;

/**
 *
 * @author shady
 */
public class VagasCadastro extends javax.swing.JInternalFrame {

    /**
     * Creates new form VagasCadastro
     */
    
    private Vaga vaga = null;
    private VagaDao vagaDao = new VagaDao();
    private DefaultListModel listaQ = new DefaultListModel();
    
    public VagasCadastro() {
        initComponents();
        

        loadComboQualification();
        enableForm(false);
        loadTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new keeptoo.KGradientPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtTituto = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescricao = new javax.swing.JTextArea();
        cb_Qualification = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        qList = new javax.swing.JList<>();
        btnAddQ = new keeptoo.KButton();
        btnRemoveQ = new keeptoo.KButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btSalvar = new keeptoo.KButton();
        btExcluir = new keeptoo.KButton();
        btCancelar = new keeptoo.KButton();
        btNovo = new keeptoo.KButton();

        setClosable(true);
        setResizable(true);
        setTitle("Cadastro de Vaga");

        kGradientPanel1.setkEndColor(new java.awt.Color(0, 0, 0));
        kGradientPanel1.setkStartColor(new java.awt.Color(0, 153, 153));

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Titulo da Vaga: ");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Descrição:");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Qualificações: ");

        txtDescricao.setColumns(20);
        txtDescricao.setRows(5);
        jScrollPane1.setViewportView(txtDescricao);

        cb_Qualification.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_QualificationActionPerformed(evt);
            }
        });

        jScrollPane2.setViewportView(qList);

        btnAddQ.setText("Adicionar");
        btnAddQ.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnAddQ.setkBackGroundColor(new java.awt.Color(153, 153, 153));
        btnAddQ.setkHoverForeGround(new java.awt.Color(153, 153, 153));
        btnAddQ.setkHoverStartColor(new java.awt.Color(153, 153, 153));
        btnAddQ.setkSelectedColor(new java.awt.Color(153, 153, 153));
        btnAddQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddQActionPerformed(evt);
            }
        });

        btnRemoveQ.setText("Remover");
        btnRemoveQ.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnRemoveQ.setkBackGroundColor(new java.awt.Color(153, 153, 153));
        btnRemoveQ.setkHoverForeGround(new java.awt.Color(153, 153, 153));
        btnRemoveQ.setkHoverStartColor(new java.awt.Color(153, 153, 153));
        btnRemoveQ.setkSelectedColor(new java.awt.Color(153, 153, 153));
        btnRemoveQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveQActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtTituto)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cb_Qualification, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAddQ, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                            .addComponent(btnRemoveQ, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtTituto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(cb_Qualification, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAddQ, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(119, 119, 119)
                        .addComponent(btnRemoveQ, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jTable1.setModel(new VagasTableModel());
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable1);

        btSalvar.setText("Salvar");
        btSalvar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btSalvar.setkBackGroundColor(new java.awt.Color(153, 153, 153));
        btSalvar.setkHoverForeGround(new java.awt.Color(153, 153, 153));
        btSalvar.setkHoverStartColor(new java.awt.Color(153, 153, 153));
        btSalvar.setkSelectedColor(new java.awt.Color(153, 153, 153));
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });

        btExcluir.setText("Excluir");
        btExcluir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btExcluir.setkBackGroundColor(new java.awt.Color(153, 153, 153));
        btExcluir.setkHoverForeGround(new java.awt.Color(153, 153, 153));
        btExcluir.setkHoverStartColor(new java.awt.Color(153, 153, 153));
        btExcluir.setkSelectedColor(new java.awt.Color(153, 153, 153));
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });

        btCancelar.setText("Cancelar");
        btCancelar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btCancelar.setkBackGroundColor(new java.awt.Color(153, 153, 153));
        btCancelar.setkHoverForeGround(new java.awt.Color(153, 153, 153));
        btCancelar.setkHoverStartColor(new java.awt.Color(153, 153, 153));
        btCancelar.setkSelectedColor(new java.awt.Color(153, 153, 153));
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });

        btNovo.setText("Novo");
        btNovo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btNovo.setkBackGroundColor(new java.awt.Color(153, 153, 153));
        btNovo.setkHoverForeGround(new java.awt.Color(153, 153, 153));
        btNovo.setkHoverStartColor(new java.awt.Color(153, 153, 153));
        btNovo.setkSelectedColor(new java.awt.Color(153, 153, 153));
        btNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNovoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane3))
                        .addContainerGap())
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(btNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 199, Short.MAX_VALUE))))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 767, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cb_QualificationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_QualificationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_QualificationActionPerformed

    private void btnAddQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddQActionPerformed
        // TODO add your handling code here:
        Qualification qualificationCb = (Qualification) cb_Qualification.getSelectedItem();
        
        if (listValidation(qualificationCb)) {
            listaQ.addElement(qualificationCb);
            qList.setModel(listaQ);
        }
    }//GEN-LAST:event_btnAddQActionPerformed

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        if (formValidate()) {
            

            vaga.setTitulo(txtTituto.getText().trim());
            vaga.setDescricao(txtDescricao.getText());
            
            vaga.setQualifications(new ArrayList<Qualification>());
            
            
            for (int i = 0; i < qList.getModel().getSize(); i++) {
                Qualification q = (Qualification) qList.getModel().getElementAt(i);
                vaga.setQualifications(q);
            }
            
            if(vaga.getId() == 0){
                try{
                    vagaDao.insert(vaga);
                    JOptionPane.showMessageDialog(this, "Sua Vaga Foi Cadastrada"
                    , "Concluido", JOptionPane.INFORMATION_MESSAGE);
                }catch(Exception ex){
                    JOptionPane.showMessageDialog(this, "Erro ao inserir Cadastro."
                    + "\n" +ex.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
                }
            }else{
                try{
                    vagaDao.update(vaga);
                    JOptionPane.showMessageDialog(this, "Seu Vaga Foi Atualizada"
                    , "Concluido", JOptionPane.INFORMATION_MESSAGE);
                }catch(Exception ex){
                    JOptionPane.showMessageDialog(this, "Erro ao alterar Cadastro."
                    + "\n" +ex.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        
        loadTable();
        enableForm(false);
    }//GEN-LAST:event_btSalvarActionPerformed

    private void btNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovoActionPerformed
        // TODO add your handling code here:
        vaga = new Vaga();
        //chama o método habilitar formulario ativando os botoes
        enableForm(true);
        btExcluir.setEnabled(false);
    }//GEN-LAST:event_btNovoActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        // TODO add your handling code here:
        enableForm(false);
    }//GEN-LAST:event_btCancelarActionPerformed

    private void btnRemoveQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveQActionPerformed
        // TODO add your handling code here:
        DefaultListModel model = (DefaultListModel) qList.getModel();
        int selectedIndex = qList.getSelectedIndex();
        if (selectedIndex != -1) {
            model.remove(selectedIndex);
        }
    }//GEN-LAST:event_btnRemoveQActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        if(evt.getClickCount() == 2){

            VagasTableModel tm = (VagasTableModel) jTable1.getModel();

            vaga = tm.getRowValue(jTable1.getSelectedRow());

            txtTituto.setText(vaga.getTitulo());
            txtDescricao.setText(vaga.getDescricao());
            listLoad(vaga.getQualificacoesExigidas());

            enableForm(true);
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        // TODO add your handling code here:
        try{
            vagaDao.delete(vaga);
            loadTable();
            enableForm(false);
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this, "Erro ao Exluir."
                    + "\n" +ex.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btExcluirActionPerformed
    private void loadComboQualification(){
        
        QualificationDao qualificaitonDao = new QualificationDao();
        ArrayList<Qualification> qualificationList = new ArrayList<Qualification>();

        try{
            qualificationList = qualificaitonDao.listAll();
            
            for (Qualification q : qualificationList) {
                cb_Qualification.addItem(q);
            }
            ;
            
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this, "Erro ao carregar Qualificações."
                    + "\n" +ex.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void listLoad(ArrayList<Qualification> q){
        listaQ.clear();
         for (Qualification q1 : q) {
            
            Qualification qualificationCb = (Qualification) q1;
            listaQ.addElement(qualificationCb);
            qList.setModel(listaQ);
         }
    }
    
    
    private boolean listValidation (Qualification qualificationCb){
        
        for (int i = 0; i < qList.getModel().getSize(); i++) {
            Qualification q = (Qualification) qList.getModel().getElementAt(i);
            String interation = q.getQualificationName();
            String newQ = qualificationCb.getQualificationName();
            if (interation.equals(newQ) ) {
                return false;
            }
        }
        return true;
    }
    private void enableForm(boolean ativo){
        btNovo.setEnabled(!ativo);
        btSalvar.setEnabled(ativo);
        btExcluir.setEnabled(ativo);
        btCancelar.setEnabled(ativo);
        txtTituto.setEnabled(ativo);
        txtDescricao.setEnabled(ativo);
        cb_Qualification.setEnabled(ativo);
        btnAddQ.setEnabled(ativo);
        //btnSearch.setEnabled(ativo);
        //jTable1.setEnabled(!ativo);
        
        if(!ativo){
            clearForm();
        }
    }
    
    private void clearForm (){
        txtTituto.setText("");
        txtDescricao.setText("");
        listaQ.clear();
    }
    
     private boolean formValidate(){
        if(txtTituto.getText().trim().length() < 2){
            JOptionPane.showMessageDialog(this, "Titulo inválido", "Alerta",
            JOptionPane.WARNING_MESSAGE);
            return false;
        }
        if(txtDescricao.getText().trim().length() < 2){
            JOptionPane.showMessageDialog(this, "Descriçao inválido", "Alerta",
            JOptionPane.WARNING_MESSAGE);
            return false;
        }

        return true;
    }
     
     private void loadTable(){
        VagasTableModel tm = (VagasTableModel) jTable1.getModel();
        
        try{
            tm.setDados(vagaDao.listAll());
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this, "Erro ao carregar a grade."
                    + "\n" +ex.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private keeptoo.KButton btCancelar;
    private keeptoo.KButton btExcluir;
    private keeptoo.KButton btNovo;
    private keeptoo.KButton btSalvar;
    private keeptoo.KButton btnAddQ;
    private keeptoo.KButton btnRemoveQ;
    private javax.swing.JComboBox<Object> cb_Qualification;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JList<Object> qList;
    private javax.swing.JTextArea txtDescricao;
    private javax.swing.JTextField txtTituto;
    // End of variables declaration//GEN-END:variables
}