package bo.Custom;

import model.OrderDetailDTO;

import java.time.LocalDate;
import java.util.List;

public interface PurchaseOrderBO {
    public boolean purchaseOrder(String orderId, LocalDate orderDate, String customerId, List<OrderDetailDTO> orderDetails);
    }
