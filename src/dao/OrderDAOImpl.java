package dao;

import db.DBConnection;
import model.OrderDTO;

import java.sql.*;

public class OrderDAOImpl implements OrderDAO{
    @Override
    public String generateOID() throws SQLException, ClassNotFoundException {
        ResultSet rst = SQLUtil.execute("SELECT oid FROM `Orders` ORDER BY oid DESC LIMIT 1;");
        return rst.next() ? String.format("OID-%03d", (Integer.parseInt(rst.getString("oid").replace("OID-", "")) + 1)) : "OID-001";
    }
    @Override
    public boolean existOrder(String orderId) throws SQLException, ClassNotFoundException {
        String sql = SQLUtil.execute("SELECT oid FROM `Orders` WHERE oid=?");
        return SQLUtil.execute(sql,orderId);

    }


    @Override
    public boolean saveOrder(OrderDTO dto) throws SQLException, ClassNotFoundException {
        String sql = SQLUtil.execute("INSERT INTO `Orders` (oid, date, customerID) VALUES (?,?,?)");
        return SQLUtil.execute(sql, dto.getOrderId(), dto.getOrderDate(), dto.getCustomerId());
    }



    /*@Override
    public String generateOID() throws SQLException, ClassNotFoundException {
        ResultSet rst = SQLUtil.execute("SELECT oid FROM `Orders` ORDER BY oid DESC LIMIT 1;");
        return rst.next() ? String.format("OID-%03d", (Integer.parseInt(rst.getString("oid").replace("OID-", "")) + 1)) : "OID-001";
    }

    @Override
    public boolean existOrder(String orderId) throws SQLException, ClassNotFoundException {
        String sql = SQLUtil.execute("SELECT oid FROM `Orders` WHERE oid=?");
        return SQLUtil.execute(sql,orderId);

    }

    @Override
    public boolean saveOrder(OrderDTO dto) throws SQLException, ClassNotFoundException {
        String sql = SQLUtil.execute("INSERT INTO `Orders` (oid, date, customerID) VALUES (?,?,?)");
        return SQLUtil.execute(sql,dto.getOrderId(),dto.getOrderDate(),dto.getCustomerId());

    }*/

}
