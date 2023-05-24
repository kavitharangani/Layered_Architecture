package dao;

import db.DBConnection;
import model.CustomerDTO;
import model.OrderDetailDTO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class OrderDetailsDAOImpl implements OrderDetailDAO{
    @Override
    public boolean saveOrderDetails(OrderDetailDTO dto) throws SQLException, ClassNotFoundException {
        String sql = SQLUtil.execute("INSERT INTO OrderDetails (oid, itemCode, unitPrice, qty) VALUES (?,?,?,?)");
        return SQLUtil.execute(sql, dto.getOid(), dto.getItemCode(), dto.getUnitPrice(), dto.getQty());
    }

}
