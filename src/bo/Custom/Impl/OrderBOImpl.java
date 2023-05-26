package bo.Custom.Impl;

import bo.Custom.OrderBO;
import dao.Custom.Impl.OrderDAOImpl;
import dao.Custom.OrderDAO;
import model.OrderDTO;

import java.sql.SQLException;

public class OrderBOImpl implements OrderBO {
    public boolean existOrder(String s) throws SQLException, ClassNotFoundException {
        OrderDAO orderDAO = new OrderDAOImpl();
        return orderDAO.exist(s);
    }
    public boolean saveOrder(OrderDTO dto) throws SQLException, ClassNotFoundException {
        OrderDAO orderDAO = new OrderDAOImpl();
        return orderDAO.save(dto);
    }
    public String generateOID() throws SQLException, ClassNotFoundException {
        OrderDAO orderDAO = new OrderDAOImpl();
        return orderDAO.generateOID();
    }

}
