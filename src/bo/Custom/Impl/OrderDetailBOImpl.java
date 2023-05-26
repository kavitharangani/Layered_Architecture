package bo.Custom.Impl;

import bo.Custom.OrderDetailBO;
import dao.Custom.Impl.OrderDetailsDAOImpl;
import dao.Custom.OrderDetailDAO;
import model.OrderDetailDTO;

import java.sql.SQLException;

public class OrderDetailBOImpl implements OrderDetailBO {
    public boolean saveOrderDetail(OrderDetailDTO dto) throws SQLException, ClassNotFoundException {
        OrderDetailDAO orderDetailDAO = new OrderDetailsDAOImpl();
        return orderDetailDAO.save(dto);
    }
}
