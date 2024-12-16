package utilitarios;

import java.sql.*;
import javax.swing.JOptionPane;

public class ConectaBanco {
    public static Connection conectabanco() throws ClassNotFoundException{
        try {            
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/BDSoftAll","bdsoftall","bdsoftall");
//            JOptionPane.showMessageDialog(null, "Conectado com Sucesso!");
            return con;        
        } catch (SQLException error) {
             JOptionPane.showMessageDialog(null, "Erro ao conectar!\n Erro:"+error);        
        return null;
        }        
    } 
} 