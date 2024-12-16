
package soft_all;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import utilitarios.ConectaBanco;
import static utilitarios.ConectaBanco.conectabanco;

public class Cadastro extends javax.swing.JFrame {

    PreparedStatement pstm = null;
    ResultSet rs = null;
    Connection con = null;
    
    public Cadastro() {
        initComponents();
        setLocationRelativeTo(null);
    //Seta o campo txt_DataAdm para a data do dia em que for utilizado    
        txt_DataAdm.setText(new SimpleDateFormat("dd/MM/yyyy").format(new java.util.Date(System.currentTimeMillis())));
    //Imagem de ícone da janela    
        ImageIcon imagemTituloJanela = new ImageIcon("C:\\SoftAll\\src\\Imagens\\Icones pequenos\\user_suit.png");
        setIconImage(imagemTituloJanela.getImage());
    //Conexão com o Banco de Dados    
        try {
            con = ConectaBanco.conectabanco();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Cadastro.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        bt_Excluir = new javax.swing.JButton();
        bt_Editar = new javax.swing.JButton();
        bt_Cancelar = new javax.swing.JButton();
        bt_Salvar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        txt_nome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_nMatricula = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_RG = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_DataAdm = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_Senha = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        txt_ConfirmaSenha = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        bt_Pesquisar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Usuário");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Cadastro de Usuário");

        bt_Excluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Icones pequenos/delete.png"))); // NOI18N
        bt_Excluir.setText("Excluir");
        bt_Excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_ExcluirActionPerformed(evt);
            }
        });

        bt_Editar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Icones pequenos/folder_edit.png"))); // NOI18N
        bt_Editar.setText("Alterar Cadastro Existente");
        bt_Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_EditarActionPerformed(evt);
            }
        });

        bt_Cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Icones pequenos/cancel.png"))); // NOI18N
        bt_Cancelar.setText("Cancelar");
        bt_Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_CancelarActionPerformed(evt);
            }
        });

        bt_Salvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Icones pequenos/accept.png"))); // NOI18N
        bt_Salvar.setText("Criar Novo Cadastro");
        bt_Salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_SalvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bt_Excluir)
                .addGap(20, 20, 20)
                .addComponent(bt_Editar)
                .addGap(18, 18, 18)
                .addComponent(bt_Cancelar)
                .addGap(18, 18, 18)
                .addComponent(bt_Salvar)
                .addGap(27, 27, 27))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_Excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_Editar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_Cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_Salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        txt_nome.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Nome:");

        txt_nMatricula.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Número de Matricula:");

        txt_RG.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("RG:");

        txt_DataAdm.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Data de Admissão:");

        txt_Senha.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Senha:");

        txt_ConfirmaSenha.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Confirmar Senha:");

        bt_Pesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Icones pequenos/zoom.png"))); // NOI18N
        bt_Pesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_PesquisarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5))
                        .addGap(57, 57, 57)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_Senha, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_DataAdm, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_ConfirmaSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_nMatricula)
                            .addComponent(txt_nome)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txt_RG, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bt_Pesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, Short.MAX_VALUE))))
                    .addComponent(jLabel2))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_nMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_RG)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(bt_Pesquisar)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txt_DataAdm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txt_Senha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txt_ConfirmaSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(195, 195, 195))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_CancelarActionPerformed
        setVisible(false);
    }//GEN-LAST:event_bt_CancelarActionPerformed

    private void bt_SalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_SalvarActionPerformed
    // Salva um novo Registro de Cadastro 
        try {                                          
            Connection con = ConectaBanco.conectabanco();
            PreparedStatement pst = null;
        //Confere se a senha e confirmar senha estão iguais   
            if(txt_Senha.getText().equals(txt_ConfirmaSenha.getText())){          
            try {                
                pst = con.prepareStatement("INSERT INTO usuarios (nome,numero_de_matricula,rg,data_de_admissao,senha)values(?,?,?,?,?)");
                pst.setString(1, txt_nome.getText());
                pst.setInt(2, Integer.valueOf(txt_nMatricula.getText()));
                pst.setInt(3, Integer.parseInt(txt_RG.getText()));
                    String dia = txt_DataAdm.getText().substring(0, 2);
                    String mes = txt_DataAdm.getText().substring(3, 5);
                    String ano = txt_DataAdm.getText().substring(6);
                String DataBD = ano+"-"+mes+"-"+dia;
                pst.setString(4, DataBD);
                pst.setString(5, txt_Senha.getText());
                pst.executeUpdate();                
                JOptionPane.showMessageDialog(rootPane, "Salvo com sucesso!");
                LimpaCampos();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(rootPane, "Erro na inclusão! \n "+ex);
            }
        }else{
                JOptionPane.showMessageDialog(this, "Senhas não conferem!\n Por favor digite novamente!");
                txt_Senha.setText("");
                txt_ConfirmaSenha.setText("");
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Cadastro.class.getName()).log(Level.SEVERE, null,ex);
        }finally{            
        }        
    }//GEN-LAST:event_bt_SalvarActionPerformed

    private void bt_PesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_PesquisarActionPerformed
    //Pesquisa no Banco de Dados e retorna os dados para seus devidos campos    
        try {               
            con = ConectaBanco.conectabanco();
            String sql = "Select *from usuarios where rg=?";
            pstm = con.prepareStatement(sql);
            pstm.setInt(1, (Integer.parseInt(txt_RG.getText())));
            ResultSet rst = pstm.executeQuery();
            if(rst.next()){
                String NOME = rst.getString("nome");
                txt_nome.setText(NOME);
                String NMAT = rst.getString("numero_de_matricula");
                txt_nMatricula.setText(NMAT);
                String RG = rst.getString("rg");
                txt_RG.setText(RG);
                String DTADM = rst.getString("data_de_admissao");
            //Método criado para transformar datas no modelo 2017-01-01 para 01/01/2017    
                    String ano = DTADM.substring(0, 4);
                    String mes = DTADM.substring(5, 7);
                    String dia = DTADM.substring(8);
                    String DataBD = dia+"/"+mes+"/"+ano;
                txt_DataAdm.setText(DataBD);                
            }else{
                JOptionPane.showMessageDialog(this, "Este número de RG não possui cadastro ou está incorreto!");
            }
            }catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(this, "ERRO: \n"+ex);
}       catch (SQLException ex) {
            Logger.getLogger(Cadastro.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bt_PesquisarActionPerformed

    private void bt_ExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_ExcluirActionPerformed
            if(txt_RG.getText().equals("")){
                JOptionPane.showMessageDialog(this, "Por favor digite um número de rg já cadastrado para exclusão!");
            }
            String sql = "DELETE FROM usuarios WHERE rg=?";
            PreparedStatement ps = null;
        try {
            ps = conectabanco().prepareStatement(sql);
            ps.setInt(1, (Integer.parseInt(txt_RG.getText())));
            ps.executeUpdate();
            LimpaCampos();
            JOptionPane.showMessageDialog(this, "Usuário exluído com sucesso !");            
    } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(this, "ERRO ao excluir: \n "+e);           
    }    
    }//GEN-LAST:event_bt_ExcluirActionPerformed

    private void bt_EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_EditarActionPerformed
       try {                                          
            Connection con = ConectaBanco.conectabanco();
            PreparedStatement pst = null;
            if(txt_Senha.getText().equals(txt_ConfirmaSenha.getText())){          
            try {                
                pst = con.prepareStatement("UPDATE usuarios SET nome=?, numero_de_matricula=?, data_de_admissao=?, senha=? where rg=?");
                pst.setString(1, txt_nome.getText());
                pst.setInt(2, Integer.valueOf(txt_nMatricula.getText()));                
                    String dia = txt_DataAdm.getText().substring(0, 2);
                    String mes = txt_DataAdm.getText().substring(3, 5);
                    String ano = txt_DataAdm.getText().substring(6);
                String DataBD = ano+"-"+mes+"-"+dia;
                pst.setString(3, DataBD);
                pst.setString(4, txt_Senha.getText());
                pst.setInt(5, Integer.parseInt(txt_RG.getText()));
                pst.executeUpdate();                
                JOptionPane.showMessageDialog(rootPane, "Alterações Salvas com sucesso!");
                LimpaCampos();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(rootPane, "Erro ao tentar alterar cadastro! \n "+ex);
            }
        }else{
                JOptionPane.showMessageDialog(this, "Senhas não conferem!\n Por favor digite novamente!");
                txt_Senha.setText("");
                txt_ConfirmaSenha.setText("");
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Cadastro.class.getName()).log(Level.SEVERE, null,ex);
        }finally{            
        }       
        
        
        
    }//GEN-LAST:event_bt_EditarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cadastro().setVisible(true);
            }
        });
    }
public void LimpaCampos(){
    txt_nome.setText("");
    txt_nMatricula.setText("");
    txt_RG.setText("");
    txt_Senha.setText("");
    txt_ConfirmaSenha.setText("");
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_Cancelar;
    private javax.swing.JButton bt_Editar;
    private javax.swing.JButton bt_Excluir;
    private javax.swing.JButton bt_Pesquisar;
    private javax.swing.JButton bt_Salvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField txt_ConfirmaSenha;
    private javax.swing.JTextField txt_DataAdm;
    private javax.swing.JTextField txt_RG;
    private javax.swing.JPasswordField txt_Senha;
    private javax.swing.JTextField txt_nMatricula;
    private javax.swing.JTextField txt_nome;
    // End of variables declaration//GEN-END:variables
}
