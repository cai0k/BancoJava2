package Controlador;

import Cliente.Cliente;
import Conexão.ClienteSQL;
import Conexão.Conexao;
import Telas.Login;
import Telas.Menu;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class ControladorLogin{
    
    private Login view;

    public ControladorLogin(Login view) {
        this.view = view;
    }
    
    

    public void autenticar() throws SQLException{
        String cpf = view.getjTextFieldcpf().getText();
        String senha = view.getjPasswordFieldsenha().getText();
        Cliente autenticarCliente = new Cliente(cpf, senha);
        
        Connection conexao = new Conexao().getConnection();
        ClienteSQL clienteConexao = new ClienteSQL(conexao);
        
        boolean existe = clienteConexao.autenticarPorCpf(autenticarCliente);
        
        if(existe){
            Menu telademenu = new Menu();
            telademenu.setVisible(true);
        }else{
            JOptionPane.showMessageDialog(view, "CPF ou senha invalidos");
        }
        
        
        
        
       
    }
    }
    
    
    

