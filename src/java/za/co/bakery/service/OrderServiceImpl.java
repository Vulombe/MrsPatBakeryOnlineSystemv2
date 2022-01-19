
package za.co.bakery.service;

import za.co.bakery.dbao.OrderDAO;
<<<<<<< HEAD
import za.co.bakery.dbao.impl.OrderDAOImpl;
=======
import za.co.bakery.dbao.OrderDAOImpl;
>>>>>>> ebdf52d7c2de03e58c654e3f009d94bc74e1ae0b


public class OrderServiceImpl implements OrderService{
    private OrderDAO orderDAO;
    
    public OrderServiceImpl(){
        this.orderDAO= new OrderDAOImpl();
    }
}
