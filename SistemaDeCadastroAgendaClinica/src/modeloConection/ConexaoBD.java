/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloConection;

import java.sql.*;
import javax.swing.JOptionPane;



public class ConexaoBD {
    
    public Statement stm;
    public ResultSet rs;
    private String driver = "org.postgresql.Driver";
    private String url="jdbc:postgresql://localhost:5432/projetoclinica";
    private String usuario="postgres";
    private String senha="1234";
    public Connection con;
    
    
    
    public void conexao(){//metodo responsável por realizar conexão com banco de dados.
    
        try {
            System.setProperty("jdbc.Drivers", driver);
            con=DriverManager.getConnection(url, usuario, senha);
            //JOptionPane.showMessageDialog(null, "Conexão efetuada com sucesso!!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao se conectar com banco de dados:\n"+ex.getMessage());
        }
    }
    public void executaSql(String sql){
        try {
            stm = con.createStatement(rs.TYPE_SCROLL_INSENSITIVE,rs.CONCUR_READ_ONLY);
            rs = stm.executeQuery(sql);
            
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Erro ExecutaSql:\n"+ex.getMessage()); 
        }
    
    
    
    }

    public void desconecta(){
    
        try {
            con.close();
            //JOptionPane.showMessageDialog(null, "BD Desconectado com sucesso");
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, "Erro ao fechar conexão com BD:\n"+ex.getMessage());
        }
    
    }
}

