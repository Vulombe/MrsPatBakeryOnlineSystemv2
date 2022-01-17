
package za.co.bakery.service;

import za.co.bakery.dbao.OrderDAO;
import za.co.bakery.dbao.OrderDAOImpl;


public class OrderServiceImpl implements OrderService{
    private OrderDAO orderDAO;
    
    public OrderServiceImpl(){
        this.orderDAO= new OrderDAOImpl();
    }
}
