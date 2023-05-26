package bo.Custom;

import dao.Custom.Impl.OrderDAOImpl;
import dao.Custom.OrderDAO;
import model.OrderDTO;

import java.sql.SQLException;

public interface OrderBO {
    public boolean existOrder(String s) throws SQLException, ClassNotFoundException ;

    public boolean saveOrder(OrderDTO dto) throws SQLException, ClassNotFoundException ;

    public String generateOID() throws SQLException, ClassNotFoundException ;

}
