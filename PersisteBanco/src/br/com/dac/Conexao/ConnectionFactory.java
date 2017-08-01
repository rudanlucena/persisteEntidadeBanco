package br.com.dac.Conexao;

import br.com.dac.Exception.ConnectionException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    private static ConnectionFactory instance;
    private static Connection connection;

    public ConnectionFactory() {
    }

    public static ConnectionFactory getIntance() throws  ClassNotFoundException, SQLException, ConnectionException{

        try {
            if (instance == null) {
                instance = new ConnectionFactory();
                Class.forName("org.postgresql.Driver");
                connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/fifa","postgres","hvlk");                
            }
        } catch (ClassNotFoundException e) {
            throw new ConnectionException("Driver não encontrado");
        } catch (SQLException e) {
            throw new ConnectionException("Dados de conexão inválidos");
        }
        return instance;
    }

    public static Connection getConnection() {
        if (connection != null) {
            return connection;
        } else {
            throw new NullPointerException("Variavel conexão não iniciada.");
        }
    }

    public static void setConnection(Connection connection) {
        ConnectionFactory.connection = connection;
    }
}