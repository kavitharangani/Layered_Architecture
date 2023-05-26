package bo.Custom.Impl;

import bo.Custom.ItemBO;
import dao.Custom.Impl.ItemDAOImpl;
import dao.Custom.ItemDAO;
import model.ItemDTO;

import java.sql.SQLException;
import java.util.ArrayList;

public class ItemBOImpl implements ItemBO {
    public ArrayList<ItemDTO> getAllItem() throws SQLException, ClassNotFoundException {
        ItemDAO itemDAO =new ItemDAOImpl();
        return itemDAO.getAll();
    }

    public boolean saveItem(ItemDTO dto) throws SQLException, ClassNotFoundException {
        ItemDAO itemDAO =new ItemDAOImpl();
        return itemDAO.save(dto);
    }
    public boolean deleteItem(String id) throws SQLException, ClassNotFoundException {
        ItemDAO itemDAO =new ItemDAOImpl();
        return itemDAO.delete(id);
    }
    public boolean updateItem(String id) throws SQLException, ClassNotFoundException {
        ItemDAO itemDAO =new ItemDAOImpl();
        return itemDAO.delete(id);
    }
    public boolean existItem(String id) throws SQLException, ClassNotFoundException {
        ItemDAO itemDAO =new ItemDAOImpl();
        return itemDAO.exist(id);
    }
    public String generateNewCode() throws SQLException, ClassNotFoundException {
        ItemDAO itemDAO =new ItemDAOImpl();
        return itemDAO.generateNewCode();
    }

    public ItemDTO searchItem(String id) throws SQLException, ClassNotFoundException {
        ItemDAO itemDAO =new ItemDAOImpl();
        return itemDAO.search(id);
    }
}
