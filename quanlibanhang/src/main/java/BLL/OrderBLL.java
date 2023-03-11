package BLL;

import DAL.OrderDAL;
import DTO.Order;
import java.util.List;

public class OrderBLL {
    private final OrderDAL orderDAL = new OrderDAL();

    /*
    public List<Order> getAllOrders() {
        return orderDAL.getAllOrders();
    }

    public Order getOrderById(int orderId) {
        return orderDAL.getOrderById(orderId);
    }

    public boolean insertOrder(Order order) {
        return orderDAL.insertOrder(order);
    }

    public boolean updateOrder(Order order) {
        return orderDAL.updateOrder(order);
    }

    public boolean deleteOrder(int orderId) {
        return orderDAL.deleteOrder(orderId);
    }
    */
}
