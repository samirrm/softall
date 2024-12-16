package soft_all;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import utilitarios.ConectaBanco;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import static utilitarios.ConectaBanco.conectabanco;

public final class telaSaidas extends javax.swing.JFrame {

    PreparedStatement pstm = null;
    ResultSet rs = null;
    Connection con = null;    
    
    public telaSaidas() throws ClassNotFoundException{
        initComponents();
    //Seta o campo txt_dataOperacao para a data do dia em que for utilizado 
        txt_dataOperacao.setText(new SimpleDateFormat("dd/MM/yyyy").format(new Date(System.currentTimeMillis()))); 
    //Imagem de ícone da janela    
        ImageIcon imagemTituloJanela = new ImageIcon("C:\\SoftAll\\src\\Imagens\\coins-icon.png");
        setIconImage(imagemTituloJanela.getImage());        
        setLocationRelativeTo(null);
        try {
    ///Conecta com o banco de dados 
            con = ConectaBanco.conectabanco();          
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(rootPane, "Erro ao tentar conectar com o banco de dados!\n "+ex);
        }
        try {
            GeraID();
        } catch (SQLException ex) {
            Logger.getLogger(telaSaidas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt_Valor = new javax.swing.JTextField();
        msg_Cedente = new javax.swing.JLabel();
        msg_Observacoes = new javax.swing.JLabel();
        txt_dataOperacao = new javax.swing.JTextField();
        txt_id = new javax.swing.JTextField();
        txt_Observacoes = new javax.swing.JScrollPane();
        txt_obs = new javax.swing.JTextArea();
        txt_CedenteSacado = new javax.swing.JTextField();
        msg_DatadaOperacao = new javax.swing.JLabel();
        msg_Referentea = new javax.swing.JLabel();
        msg_EntradaseSaidas = new javax.swing.JLabel();
        txt_Referentea = new javax.swing.JTextField();
        msg_Valor = new javax.swing.JLabel();
        msg_Codigo = new javax.swing.JLabel();
        bt_Pesquisar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        bt_Excluir = new javax.swing.JButton();
        bt_Alterar = new javax.swing.JButton();
        bt_Cancelar = new javax.swing.JButton();
        bt_Gravar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Saidas");

        msg_Cedente.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        msg_Cedente.setText("Cedente/Sacado:");

        msg_Observacoes.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        msg_Observacoes.setText("Observações:");

        txt_dataOperacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_dataOperacaoActionPerformed(evt);
            }
        });

        txt_id.setEditable(false);

        txt_obs.setColumns(20);
        txt_obs.setRows(5);
        txt_Observacoes.setViewportView(txt_obs);

        msg_DatadaOperacao.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        msg_DatadaOperacao.setText("Data da Operação: ");

        msg_Referentea.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        msg_Referentea.setText("Referente à:");

        msg_EntradaseSaidas.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        msg_EntradaseSaidas.setForeground(new java.awt.Color(255, 0, 51));
        msg_EntradaseSaidas.setText("Saídas");

        msg_Valor.setText("Valor:");

        msg_Codigo.setText("Código:");

        bt_Pesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Icones pequenos/zoom.png"))); // NOI18N
        bt_Pesquisar.setToolTipText("Pesquisar Saídas");
        bt_Pesquisar.setEnabled(false);
        bt_Pesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_PesquisarActionPerformed(evt);
            }
        });

        jButton1.setText("Editar Registro");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        bt_Excluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Icones pequenos/delete.png"))); // NOI18N
        bt_Excluir.setText("Excluir");
        bt_Excluir.setEnabled(false);
        bt_Excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_ExcluirActionPerformed(evt);
            }
        });

        bt_Alterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Icones pequenos/folder_edit.png"))); // NOI18N
        bt_Alterar.setText("Alterar Dados");
        bt_Alterar.setEnabled(false);
        bt_Alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_AlterarActionPerformed(evt);
            }
        });

        bt_Cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Icones pequenos/cancel.png"))); // NOI18N
        bt_Cancelar.setText("Cancelar");
        bt_Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_CancelarActionPerformed(evt);
            }
        });

        bt_Gravar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Icones pequenos/disk.png"))); // NOI18N
        bt_Gravar.setText("Salvar Nova Saída");
        bt_Gravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_GravarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bt_Excluir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bt_Alterar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bt_Cancelar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bt_Gravar)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_Excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_Alterar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_Cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_Gravar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(msg_EntradaseSaidas, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(138, 138, 138)
                                        .addComponent(msg_Codigo))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(msg_DatadaOperacao)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txt_dataOperacao, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(msg_Valor)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(bt_Pesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txt_Valor, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txt_Observacoes, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(msg_Cedente)
                                        .addComponent(msg_Referentea))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txt_Referentea, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txt_CedenteSacado, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(msg_Observacoes)
                                .addGap(71, 71, 71))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(msg_EntradaseSaidas, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txt_id)
                                .addComponent(msg_Codigo))
                            .addGap(2, 2, 2))
                        .addComponent(bt_Pesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(msg_Valor)
                    .addComponent(msg_DatadaOperacao)
                    .addComponent(txt_dataOperacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Valor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(msg_Cedente)
                    .addComponent(txt_CedenteSacado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(msg_Referentea)
                    .addComponent(txt_Referentea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addComponent(msg_Observacoes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_Observacoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bt_CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_CancelarActionPerformed
        HabilitaCampos();
        LimparCampos();
    }//GEN-LAST:event_bt_CancelarActionPerformed

    private void bt_GravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_GravarActionPerformed
        try {
            ValidarCampos();
            PreparedStatement pst = con.prepareStatement("INSERT INTO saidas (data_de_operacao, cedente_sacado, referente, observacoes, valor)values(?,?,?,?,?)");            
                String dia = txt_dataOperacao.getText().substring(0, 2);
                String mes = txt_dataOperacao.getText().substring(3, 5);
                String ano = txt_dataOperacao.getText().substring(6);
                String DataBD = ano+"-"+mes+"-"+dia;
            pst.setString(1, DataBD);
            pst.setString(2, txt_CedenteSacado.getText());
            pst.setString(3, txt_Referentea.getText());
            pst.setString(4, txt_Observacoes.getToolTipText());
            pst.setInt(5, (Integer.parseInt(txt_Valor.getText())));
            pst.executeUpdate();
            JOptionPane.showMessageDialog(rootPane, "Salvo com sucesso!");            
            LimparCampos();
            GeraID();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Erro ao salvar!\n "+ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(telaSaidas.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }//GEN-LAST:event_bt_GravarActionPerformed

    private void txt_dataOperacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_dataOperacaoActionPerformed
    
    }//GEN-LAST:event_txt_dataOperacaoActionPerformed

    private void bt_ExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_ExcluirActionPerformed
        String sql = "DELETE FROM saidas WHERE id=?";
            PreparedStatement ps = null;
        try {
            if(txt_id.equals(null)){
                JOptionPane.showMessageDialog(this, "Digite um valor válido!");
            }else{
            ps = conectabanco().prepareStatement(sql);
            ps.setInt(1, (Integer.parseInt(txt_id.getText())));
            ps.executeUpdate();
            JOptionPane.showMessageDialog(this, "Entrada exluída com sucesso !");
            LimparCampos();
            GeraID();
            }        
    } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(this, "ERRO ao excluir: "+e);           
    }
    }//GEN-LAST:event_bt_ExcluirActionPerformed

    private void bt_AlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_AlterarActionPerformed
        try {                                          
            Connection con = ConectaBanco.conectabanco();
            PreparedStatement pst = null;
              
            try {                
                pst = con.prepareStatement("UPDATE saidas SET data_de_operacao=?, cedente_sacado=?, referente=?, observacoes=?, valor=? where id=?");                              
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
        telaEntradas obj = null;       
        if(txt_id.getText().equals("")){
           JOptionPane.showMessageDialog(this, "Digite o Código da operação desejada !");
           txt_id.requestFocus();
       }else{
           try {               
            con = ConectaBanco.conectabanco();
            String sql = "Select *from saidas where id=?";
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
                    String DataSaida = dia+"/"+mes+"/"+ano;                
                txt_dataOperacao.setText(DataSaida);
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
            JOptionPane.showMessageDialog(this, "ERRO: "+ex);
        }   catch (SQLException ex) {           
                Logger.getLogger(telaEntradas.class.getName()).log(Level.SEVERE, null, ex);
            }         
        }  
    }//GEN-LAST:event_bt_PesquisarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        DesabilitaCampos();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(telaSaidas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaSaidas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaSaidas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaSaidas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new telaSaidas().setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(telaSaidas.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_Alterar;
    private javax.swing.JButton bt_Cancelar;
    private javax.swing.JButton bt_Excluir;
    private javax.swing.JButton bt_Gravar;
    private javax.swing.JButton bt_Pesquisar;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel msg_Cedente;
    private javax.swing.JLabel msg_Codigo;
    private javax.swing.JLabel msg_DatadaOperacao;
    private javax.swing.JLabel msg_EntradaseSaidas;
    private javax.swing.JLabel msg_Observacoes;
    private javax.swing.JLabel msg_Referentea;
    private javax.swing.JLabel msg_Valor;
    private javax.swing.JTextField txt_CedenteSacado;
    private javax.swing.JScrollPane txt_Observacoes;
    private javax.swing.JTextField txt_Referentea;
    private javax.swing.JTextField txt_Valor;
    private javax.swing.JTextField txt_dataOperacao;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextArea txt_obs;
    // End of variables declaration//GEN-END:variables

    private void LimparCampos() {
        txt_CedenteSacado.setText("");        
        txt_Referentea.setText("");
        txt_Valor.setText("");
        txt_dataOperacao.setText(new SimpleDateFormat("dd/MM/yyyy").format(new Date(System.currentTimeMillis())));
        txt_obs.setText("");
    }
        private boolean ValidarCampos(){
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
    @SuppressWarnings("empty-statement")
    public void GeraID() throws ClassNotFoundException, SQLException{                   
            txt_id.requestFocus();      
           try {               
            con = ConectaBanco.conectabanco();
            String sql = "select * from saidas where id = (select max(id) from saidas)";
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
