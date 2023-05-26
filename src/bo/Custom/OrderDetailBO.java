package bo.Custom;

import model.OrderDetailDTO;

import java.sql.SQLException;

public interface OrderDetailBO {
    public boolean saveOrderDetail(OrderDetailDTO dto) throws SQLException, ClassNotFoundException;
}
