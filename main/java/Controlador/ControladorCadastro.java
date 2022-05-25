package Controlador;

import Cliente.Cliente;
import Conexão.ClienteSQL;
import Conexão.Conexao;
import Telas.Cadastro;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class ControladorCadastro {
    
    private Cadastro view;

    public ControladorCadastro(Cadastro view) {
        this.view = view;
    }
    
    public void salvaCliente(){
        
        String nome = view.getjTextFieldnome().getText();
        String cpf = view.getjTextFieldcpf().getText();
        String endereco = view.getjTextFieldendereco().getText();
        String saldo = view.getjTextFieldsaldo().getText();
        String senha = view.getjPasswordFieldsenha().getText();
        
        Cliente cliente = new Cliente(saldo, nome, endereco, cpf, senha);
       
        try {
            Connection conexao = new Conexao().getConnection();
            ClienteSQL clienteConexao = new ClienteSQL(conexao);
            clienteConexao.insert(cliente);
            
            JOptionPane.showMessageDialog(null, "Conta criada com sucesso!");
            JOptionPane.showMessageDialog(view, "Bem vindo "+nome);
        
        } catch (SQLException ex) {
            Logger.getLogger(Cadastro.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
