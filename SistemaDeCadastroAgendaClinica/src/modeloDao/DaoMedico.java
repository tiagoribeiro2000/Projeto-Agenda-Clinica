
package modeloDao;

import modeloConection.ConexaoBD;
import modeloBeans.BeansMedico;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;



public class DaoMedico {
    ConexaoBD conex= new ConexaoBD();
    BeansMedico mod=new BeansMedico();
    
    public void Salvar(BeansMedico mod){
    
    conex.conexao();
        try {
            PreparedStatement pst= conex.con.prepareStatement("insert into medicos(nome_medico,especializacao_medico,crm_medico) values(?,?,?)" );
            
            pst.setString(1, mod.getNome());
            pst.setString(2,mod.getEspecializacao());
            pst.setInt(3, mod.getCrm());
            
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados alterados com sucesso!");
        } catch (SQLException ex) {
            
             JOptionPane.showMessageDialog(null, "Erro na alteração dos dados!/nErro:"+ex);
        }
    conex.desconecta();
    
    }
    
    
    
    
    
    public void Excluir(BeansMedico mod){
    
    conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("delete from medicos where cod_medico=?");
            pst.setInt(1, mod.getCodigo());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados excluidos com sucesso.");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir dados./nErro:"+ex);
        }
    
    
    
    
    conex.desconecta();
    
    
    }
    public void Editar(BeansMedico mod){
    
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("update medicos set nome_medico=?,especializacao_medico=?,crm_medico=? where cod_medico=?");
            pst.setString(1, mod.getNome());
            pst.setString(2, mod.getEspecializacao());
            pst.setInt(3, mod.getCrm());
            pst.setInt(4, mod.getCodigo());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados alterados com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro na alteração dos dados./nErro:"+ex);
        }
        conex.desconecta();
    
    }
    
    public BeansMedico buscaMedico(BeansMedico mod){
    
        conex.conexao();
        conex.executaSql("select *from medicos where nome_medico like'%"+mod.getPesquisa()+"%'");
        try {
            conex.rs.first();
            mod.setCodigo(conex.rs.getInt("cod_medico"));
            mod.setNome(conex.rs.getString("nome_medico"));
            mod.setEspecializacao(conex.rs.getString("especializacao_medico"));
            mod.setCrm(conex.rs.getInt("crm_medico")); 
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Médico não cadastrado./nErro:"+ex);
        }
        conex.desconecta();
        return mod;
    
    }

}
