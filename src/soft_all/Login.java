
package soft_all;

import java.awt.HeadlessException;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import utilitarios.ConectaBanco;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JPopupMenu;
import org.apache.derby.impl.drda.NetworkServerControlImpl;
         
public class Login extends javax.swing.JFrame {
    
    PreparedStatement pstm = null;
    ResultSet rs = null;
    Connection con = null;       
   
    public Login() throws InterruptedException {
        initComponents();
        setLocationRelativeTo(null);
        getRootPane().setDefaultButton(bt_Entrar);
        //Imagem de ícone da janela    
        ImageIcon imagemTituloJanela = new ImageIcon("C:\\SoftAll\\src\\Imagens\\Icones pequenos\\password.png");
        setIconImage(imagemTituloJanela.getImage());
  
try {
//Caminho do Banco de Dados
        System.setProperty("derby.system.home", "C:\\SoftAll\\DERBY\\bin");
        NetworkServerControlImpl networkServer = new NetworkServerControlImpl();
        networkServer.start(new PrintWriter(System.out));
            System.out.println("Conectado ao banco de dados.");
        } catch (Exception ex) {
            System.out.println("Não conseguiu conectar no banco de dados.");
        }
        try {   
            //Criei esse "DELAY" de 2 segundos para ter certeza que o banco já estaria ligado para fazer a conexão
            Thread.sleep(2000);
            con = ConectaBanco.conectabanco();
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(this,"Erro ao conectar! \n"+ex);
        }
    } 
    public void Logar(){        
        try {
            String sql = "Select *from usuarios where nome=? and senha=?";
            pstm = con.prepareStatement(sql);
            pstm.setString(1, txt_Usuario.getText());
            pstm.setString(2, txt_Senha.getText());
            rs = pstm.executeQuery();
            if(rs.next()){
                JOptionPane.showMessageDialog(null, "Conectado com Sucesso!");
                MenuPrincipal menu = new MenuPrincipal();
                menu.setVisible(true);
                dispose();                
            }else{
                JOptionPane.showMessageDialog(null, "Login/Senha inválido!\n Prováveis motivos:\n * Usuário e/ou Senha incorretos\n * Sem cadastro no sistema\n * Tecla CAPSLOCK ativada");
            }
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showConfirmDialog(null, "ERRO:"+e);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        bt_Entrar = new javax.swing.JButton();
        bt_Cancelar = new javax.swing.JButton();
        bt_Cadastar = new javax.swing.JButton();
        msgLogin = new javax.swing.JLabel();
        msgUsuario = new javax.swing.JLabel();
        txt_Usuario = new javax.swing.JTextField();
        msgSenha = new javax.swing.JLabel();
        txt_Senha = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LOGIN");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 340, Short.MAX_VALUE)
        );

        bt_Entrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Icones pequenos/accept.png"))); // NOI18N
        bt_Entrar.setText("Entrar");
        bt_Entrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_EntrarActionPerformed(evt);
            }
        });

        bt_Cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Icones pequenos/cancel.png"))); // NOI18N
        bt_Cancelar.setText("Cancelar");
        bt_Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_CancelarActionPerformed(evt);
            }
        });

        bt_Cadastar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Icones pequenos/user_suitrr.png"))); // NOI18N
        bt_Cadastar.setText("Cadastrar");
        bt_Cadastar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_CadastarActionPerformed(evt);
            }
        });

        msgLogin.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        msgLogin.setText("Login");

        msgUsuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        msgUsuario.setText("Usuário:");

        msgSenha.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        msgSenha.setText("Senha:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bt_Cadastar)
                                .addGap(18, 18, 18)
                                .addComponent(bt_Cancelar)
                                .addGap(18, 18, 18)
                                .addComponent(bt_Entrar))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(msgUsuario)
                                    .addComponent(msgSenha))
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_Senha, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(33, 33, 33))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(msgLogin)
                        .addGap(138, 138, 138)))
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(msgLogin)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(msgUsuario)
                            .addComponent(txt_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(msgSenha)
                            .addComponent(txt_Senha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(116, 116, 116)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bt_Cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bt_Cadastar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bt_Entrar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_EntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_EntrarActionPerformed
        ValidarCampos();
        Logar();    
    }//GEN-LAST:event_bt_EntrarActionPerformed

    private void bt_CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_CancelarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_bt_CancelarActionPerformed

    private void bt_CadastarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_CadastarActionPerformed
    ValidarCampos();
        try {
            String sql = "Select *from usuarios where nome=? and senha=?";
            pstm = con.prepareStatement(sql);
            pstm.setString(1, txt_Usuario.getText());
            pstm.setString(2, txt_Senha.getText());
            rs = pstm.executeQuery();
            if(rs.next()){
                Cadastro cad = new Cadastro();
                cad.setVisible(true);
                dispose();
                
            }else{
                JOptionPane.showMessageDialog(null, "Login/Senha inválido!");
            }
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showConfirmDialog(null, "ERRO:"+e);
        }
    }//GEN-LAST:event_bt_CadastarActionPerformed
public void ValidarCampos(){
    if(txt_Usuario.getText().equals("")){
        JOptionPane.showMessageDialog(this, "POR FAVOR DIGITE UM NOME DE USUÁRIO!");
    }if(txt_Senha.getText().equals("")){
        JOptionPane.showMessageDialog(this, "POR FAVOR DIGITE UMA SENHA!");            
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Login().setVisible(true);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_Cadastar;
    private javax.swing.JButton bt_Cancelar;
    private javax.swing.JButton bt_Entrar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel msgLogin;
    private javax.swing.JLabel msgSenha;
    private javax.swing.JLabel msgUsuario;
    private javax.swing.JPasswordField txt_Senha;
    private javax.swing.JTextField txt_Usuario;
    // End of variables declaration//GEN-END:variables
}
