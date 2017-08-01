package br.com.dac.app;

import br.com.dac.DAO.ClubeDao;
import br.com.dac.Exception.ConnectionException;
import br.com.dac.entidades.Clube;
import java.sql.SQLException;

public class Loader {
    public static void main(String[] args) throws ConnectionException, ClassNotFoundException, SQLException{
        Clube vasco = new Clube("vasco da gama", "RJ", "São januario", 1);
        ClubeDao dao = new ClubeDao();
        
        dao.persiste(vasco);
    }
}
