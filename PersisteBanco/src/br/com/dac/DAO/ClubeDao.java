package br.com.dac.DAO;

import br.com.dac.entidades.Clube;
import br.com.dac.Exception.ConnectionException;
import br.com.dac.Conexao.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ClubeDao{

    private final Connection connection;

    public ClubeDao() throws ConnectionException, ClassNotFoundException, SQLException {
        this.connection = ConnectionFactory.getIntance().getConnection();
    }


    public void persiste(Clube clube) throws SQLException{      
       
        String sql = "INSERT INTO clubes (nome, cidade, estadio, divisao) VALUES (?,?,?,?)";

        PreparedStatement statement = connection.prepareStatement(sql);
        
        statement.setString(1, clube.getNome());
        statement.setString(2, clube.getCidade());
        statement.setString(3, clube.getEstadio());
        statement.setInt(4, clube.getDivisao());
        
        statement.executeUpdate();
    }

}
