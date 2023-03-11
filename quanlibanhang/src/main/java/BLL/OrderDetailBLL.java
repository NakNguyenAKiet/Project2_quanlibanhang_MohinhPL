package BLL;

import DAL.OrderDetailDAL;
import DTO.OrderDetail;
import java.util.List;

public class OrderDetailBLL {
    private final OrderDetailDAL orderDetailDAL = new OrderDetailDAL();

    /*
    public List<OrderDetail> getOrderDetailsByOrderId(int orderId) {
        return orderDetailDAL.getOrderDetailsByOrderId(orderId);
    }

    public List<OrderDetail> getOrderDetailsByVegetableId(int vegetableId) {
        return orderDetailDAL.getOrderDetailsByVegetableId(vegetableId);
    }

    public boolean insertOrderDetail(OrderDetail orderDetail) {
        return orderDetailDAL.insertOrderDetail(orderDetail);
    }

    public boolean updateOrderDetail(OrderDetail orderDetail) {
        return orderDetailDAL.updateOrderDetail(orderDetail);
    }

    public boolean deleteOrderDetail(int orderId, int vegetableId) {
        return orderDetailDAL.deleteOrderDetail(orderId, vegetableId);
    }
    */
}
