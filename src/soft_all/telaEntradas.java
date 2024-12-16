package soft_all;

import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import utilitarios.ConectaBanco;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import static utilitarios.ConectaBanco.conectabanco;
import javax.swing.JFrame;


public final class telaEntradas extends javax.swing.JFrame {
       
    PreparedStatement pstm = null;
    ResultSet rs = null;
    Connection con = null;  
    
    public telaEntradas() {
        initComponents();
        setLocationRelativeTo(null); 
    //Seta o campo txt_dataOperacao para a data do dia em que for utilizado 
        txt_dataOperacao.setText(new SimpleDateFormat("dd/MM/yyyy").format(new Date(System.currentTimeMillis())));
    //Imagem de ícone da janela    
        ImageIcon imagemTituloJanela = new ImageIcon("C:\\SoftAll\\src\\Imagens\\dollar-stats-icon.png");
        setIconImage(imagemTituloJanela.getImage());
        try {
            con = ConectaBanco.conectabanco();            
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(rootPane, "Erro: "+ex);
        }
        try {
            GeraID();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(telaEntradas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        msg_Observacoes = new javax.swing.JLabel();
        txt_Referentea = new javax.swing.JTextField();
        txt_dataOperacao = new javax.swing.JTextField();
        msg_Valor = new javax.swing.JLabel();
        txt_id = new javax.swing.JTextField();
        msg_Codigo = new javax.swing.JLabel();
        observacoes = new javax.swing.JScrollPane();
        txt_obs = new javax.swing.JTextArea();
        txt_CedenteSacado = new javax.swing.JTextField();
        msg_DatadaOperacao = new javax.swing.JLabel();
        msg_Referentea = new javax.swing.JLabel();
        txt_Valor = new javax.swing.JTextField();
        msg_Entradas = new javax.swing.JLabel();
        msg_Cedente = new javax.swing.JLabel();
        bt_Gravar = new javax.swing.JButton();
        bt_Cancelar = new javax.swing.JButton();
        bt_Excluir = new javax.swing.JButton();
        bt_Alterar = new javax.swing.JButton();
        bt_Pesquisar = new javax.swing.JButton();
        bt_edit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Entradas");
        setBackground(new java.awt.Color(153, 255, 153));

        msg_Observacoes.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        msg_Observacoes.setText("Observações:");

        msg_Valor.setText("Valor:");

        txt_id.setEditable(false);

        msg_Codigo.setText("Código:");

        txt_obs.setColumns(20);
        txt_obs.setRows(5);
        observacoes.setViewportView(txt_obs);

        msg_DatadaOperacao.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        msg_DatadaOperacao.setText("Data da Operação: ");

        msg_Referentea.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        msg_Referentea.setText("Referente à:");

        msg_Entradas.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        msg_Entradas.setForeground(new java.awt.Color(0, 204, 0));
        msg_Entradas.setText("Entradas");

        msg_Cedente.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        msg_Cedente.setText("Cedente/Sacado:");

        bt_Gravar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Icones pequenos/disk.png"))); // NOI18N
        bt_Gravar.setText("Salvar");
        bt_Gravar.setToolTipText("Salvar novos dados");
        bt_Gravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_GravarActionPerformed(evt);
            }
        });

        bt_Cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Icones pequenos/cancel.png"))); // NOI18N
        bt_Cancelar.setText("Cancelar");
        bt_Cancelar.setToolTipText("Cancelar operação");
        bt_Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_CancelarActionPerformed(evt);
            }
        });

        bt_Excluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Icones pequenos/delete.png"))); // NOI18N
        bt_Excluir.setText("Excluir");
        bt_Excluir.setToolTipText("Excluir uma entrada existente");
        bt_Excluir.setEnabled(false);
        bt_Excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_ExcluirActionPerformed(evt);
            }
        });

        bt_Alterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Icones pequenos/folder_edit.png"))); // NOI18N
        bt_Alterar.setText("Alterar Dados");
        bt_Alterar.setToolTipText("Editar uma Entrada existente");
        bt_Alterar.setEnabled(false);
        bt_Alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_AlterarActionPerformed(evt);
            }
        });

        bt_Pesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Icones pequenos/zoom.png"))); // NOI18N
        bt_Pesquisar.setToolTipText("Pesquisar Entradas ");
        bt_Pesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_PesquisarActionPerformed(evt);
            }
        });

        bt_edit.setText("Editar Registro");
        bt_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_editActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(observacoes, javax.swing.GroupLayout.PREFERRED_SIZE, 523, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(178, 178, 178)
                            .addComponent(bt_Excluir)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(bt_Alterar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(bt_Cancelar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(bt_Gravar))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(65, 65, 65)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(msg_Cedente)
                                        .addComponent(msg_Referentea))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txt_Referentea)
                                        .addComponent(txt_CedenteSacado)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(msg_Entradas)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(msg_Codigo))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(msg_DatadaOperacao)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(txt_dataOperacao, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(msg_Valor)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addGap(0, 0, Short.MAX_VALUE)
                                            .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(bt_Pesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(txt_Valor)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(msg_Observacoes)
                                        .addComponent(bt_edit))
                                    .addGap(0, 0, Short.MAX_VALUE))))))
                .addGap(62, 76, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(msg_Codigo)
                        .addComponent(msg_Entradas, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_id))
                    .addComponent(bt_Pesquisar))
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(msg_Valor)
                    .addComponent(txt_Valor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(msg_DatadaOperacao)
                    .addComponent(txt_dataOperacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(msg_Cedente)
                    .addComponent(txt_CedenteSacado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(msg_Referentea)
                    .addComponent(txt_Referentea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(msg_Observacoes)
                .addGap(18, 18, 18)
                .addComponent(observacoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_Excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_Alterar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_Cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_Gravar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bt_GravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_GravarActionPerformed
        try {
            ValidarCampos();                
            PreparedStatement pst = con.prepareStatement("INSERT INTO entradas (data_de_operacao, cedente_sacado, referente, observacoes, valor)values(?,?,?,?,?)");      
                String dia = txt_dataOperacao.getText().substring(0, 2);
                String mes = txt_dataOperacao.getText().substring(3, 5);
                String ano = txt_dataOperacao.getText().substring(6);
                String DataBD = ano+"-"+mes+"-"+dia;
            pst.setString(1, DataBD);
            pst.setString(2, txt_CedenteSacado.getText());
            pst.setString(3, txt_Referentea.getText());
            pst.setString(4, observacoes.getToolTipText());
            pst.setInt(5, (Integer.parseInt(txt_Valor.getText())));
            pst.executeUpdate();
            JOptionPane.showMessageDialog(rootPane, "Salvo com sucesso!");
            LimparCampos();
            GeraID();             
                    
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Erro ao salvar!\n "+ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(telaEntradas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bt_GravarActionPerformed

    private void bt_CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_CancelarActionPerformed
        bt_Gravar.setEnabled(true);
        bt_Alterar.setEnabled(false);
        bt_Excluir.setEnabled(false);
        LimparCampos();        
    }//GEN-LAST:event_bt_CancelarActionPerformed

    private void bt_AlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_AlterarActionPerformed
         try {                                          
            Connection con = ConectaBanco.conectabanco();
            PreparedStatement pst = null;
              
            try {                
                pst = con.prepareStatement("UPDATE entradas SET data_de_operacao=?, cedente_sacado=?, referente=?, observacoes=?, valor=? where id=?");                              
                    String dia = txt_dataOperacao.getText().substring(0, 2);
                    String mes = txt_dataOperacao.getText().substring(3, 5);
                    String ano = txt_dataOperacao.getText().substring(6);
                String DataBD = ano+"-"+mes+"-"+dia;
                pst.setString(1, DataBD);                
                pst.setString(2, txt_CedenteSacado.getText());
                pst.setString(3, txt_Referentea.getText());
                pst.setString(4, txt_obs.getText());
                pst.setString(5, txt_Valor.getText());
                pst.setInt(6, Integer.parseInt(txt_id.getText()));
                pst.executeUpdate();                
                JOptionPane.showMessageDialog(rootPane, "Alterações Salvas com sucesso!");
                
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(rootPane, "Erro ao tentar alterar cadastro! \n "+ex);
            }
        
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Cadastro.class.getName()).log(Level.SEVERE, null,ex);
        }finally{            
        } 
    }//GEN-LAST:event_bt_AlterarActionPerformed

    private void bt_PesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_PesquisarActionPerformed
        HabilitaCampos();
        bt_Gravar.setEnabled(false);
        telaEntradas obj = null;       
        if(txt_id.getText().equals("")){
           JOptionPane.showMessageDialog(this, "Digite o Código da operação desejada !");
           txt_id.requestFocus();
       }else{
           try {               
            con = ConectaBanco.conectabanco();
            String sql = "Select *from entradas where id=?";
            pstm = con.prepareStatement(sql);
            pstm.setInt(1, (Integer.parseInt(txt_id.getText())));
            ResultSet rst = pstm.executeQuery();
            if(rst.next()){
                String ID = rst.getString("id");
                txt_id.setText(ID);
                String DATA = rst.getString("data_de_operacao");
                //Método criado para transformar datas no modelo 2017-01-01 para 01/01/2017    
                    String ano = DATA.substring(0, 4);
                    String mes = DATA.substring(5, 7);
                    String dia = DATA.substring(8);
                    String DataBD = dia+"/"+mes+"/"+ano;
                txt_dataOperacao.setText(DataBD);
                txt_dataOperacao.setText(DataBD);
                String VALOR = rst.getString("valor");
                txt_Valor.setText(VALOR);
                String CS = rst.getString("cedente_sacado");
                txt_CedenteSacado.setText(CS);
                String REFERENTE = rst.getString("referente");
                txt_Referentea.setText(REFERENTE);
                String OBS = rst.getString("observacoes");
                txt_obs.setText(OBS);                
            }
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(this, "ERRO: \n"+ex);
        }   catch (SQLException ex) {           
                Logger.getLogger(telaEntradas.class.getName()).log(Level.SEVERE, null, ex);
            }                   
    }  
    }//GEN-LAST:event_bt_PesquisarActionPerformed

    private void bt_ExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_ExcluirActionPerformed
            String sql = "DELETE FROM entradas WHERE id=?";
            PreparedStatement ps = null;
        try {
            ps = conectabanco().prepareStatement(sql);
            ps.setInt(1, (Integer.parseInt(txt_id.getText())));
            ps.executeUpdate();
            JOptionPane.showMessageDialog(this, "Entrada exluída com sucesso !");
            LimparCampos();
            GeraID();
            
    } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(this, "ERRO ao excluir: "+e);           
    }    
 
    }//GEN-LAST:event_bt_ExcluirActionPerformed

    private void bt_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_editActionPerformed
        HabilitaCampos();
        
    }//GEN-LAST:event_bt_editActionPerformed

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
            java.util.logging.Logger.getLogger(telaEntradas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaEntradas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaEntradas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaEntradas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new telaEntradas().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_Alterar;
    private javax.swing.JButton bt_Cancelar;
    private javax.swing.JButton bt_Excluir;
    private javax.swing.JButton bt_Gravar;
    private javax.swing.JButton bt_Pesquisar;
    private javax.swing.JButton bt_edit;
    private javax.swing.JLabel msg_Cedente;
    private javax.swing.JLabel msg_Codigo;
    private javax.swing.JLabel msg_DatadaOperacao;
    private javax.swing.JLabel msg_Entradas;
    private javax.swing.JLabel msg_Observacoes;
    private javax.swing.JLabel msg_Referentea;
    private javax.swing.JLabel msg_Valor;
    private javax.swing.JScrollPane observacoes;
    private javax.swing.JTextField txt_CedenteSacado;
    private javax.swing.JTextField txt_Referentea;
    private javax.swing.JTextField txt_Valor;
    private javax.swing.JTextField txt_dataOperacao;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextArea txt_obs;
    // End of variables declaration//GEN-END:variables

    public boolean ValidarCampos(){
        if(txt_dataOperacao.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Digite a data de operação!");
            txt_dataOperacao.requestFocus();
            return false;
        }
        if(txt_CedenteSacado.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Digite o Cedente Sacado!");
            txt_CedenteSacado.requestFocus();
            return false;
        }    
        if(txt_Valor.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Digite o Valor!");
            txt_Valor.requestFocus();
            return false;
        }    
        if(txt_Referentea.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Digite a referência do valor!");
            txt_Referentea.requestFocus();
            return false;    
        }  
    return true;
}
    private void LimparCampos(){
        txt_CedenteSacado.setText("");        
        txt_Referentea.setText("");
        txt_Valor.setText("");        
        txt_obs.setText("");
        txt_dataOperacao.setText(new SimpleDateFormat("dd/MM/yyyy").format(new Date(System.currentTimeMillis())));
        txt_id.setText("");
    }    
    
       public void HabilitaCampos(){
        
        txt_id.setEditable(true);
        bt_Pesquisar.setEnabled(true);
        bt_Excluir.setEnabled(true);
        txt_CedenteSacado.setEnabled(true);
        txt_Referentea.setEnabled(true);
        txt_Valor.setEnabled(true);
        txt_dataOperacao.setEnabled(true);
        txt_obs.setEnabled(true);
        bt_Alterar.setEnabled(true);
    }
    public void DesabilitaCampos(){
        txt_id.setEditable(true);
        bt_Pesquisar.setEnabled(true);
        bt_Excluir.setEnabled(false);
        txt_CedenteSacado.setEnabled(false);
        txt_Referentea.setEnabled(false);
        txt_Valor.setEnabled(false);
        txt_dataOperacao.setEnabled(false);
        txt_obs.setEnabled(false);
    }
     public void GeraID() throws ClassNotFoundException, SQLException{                   
            txt_id.requestFocus();      
           try {               
            con = ConectaBanco.conectabanco();
            String sql = "select * from entradas where id = (select max(id) from entradas)";
            pstm = con.prepareStatement(sql);           
            ResultSet rst = pstm.executeQuery();
            if(rst.next()){
                Integer ID = rst.getInt("id");
                int resu = ID+1;
                String str = Integer.toString (resu);
                txt_id.setText(str);                
            }            
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(this, "ERRO: "+ex);
        }   catch (SQLException ex) {           
                Logger.getLogger(telaEntradas.class.getName()).log(Level.SEVERE, null, ex);
            }        
} 
     
}
