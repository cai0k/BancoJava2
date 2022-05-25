package Conexão;

import Cliente.Cliente;
import Telas.Cadastro;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ClienteSQL{

    
    private final Connection connection;

    public ClienteSQL(Connection connection) {
        this.connection = connection;
    }
    
    public void insert(Cliente cliente) throws SQLException{
        
        String sql = "insert into cliente(nome, endereco, saldo, CPF, senha) Values(?, ?, ?, ?, ?); ";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, cliente.getNome());
        statement.setString(2, cliente.getEndereco());
        statement.setString(3, cliente.getSaldo());
        statement.setString(4, cliente.getCpf());
        statement.setString(5, cliente.getSenha());
        statement.execute();
        connection.close();
        
    }
   
    public boolean autenticarPorCpf(Cliente autenticarCliente) throws SQLException{
        String sql = "select * from cliente where cpf = ? and senha = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, autenticarCliente.getCpf());
        statement.setString(2, autenticarCliente.getSenha());
        statement.execute();
        ResultSet resultSet = statement.getResultSet();
        return resultSet.next();
    }
         
   
        
}




