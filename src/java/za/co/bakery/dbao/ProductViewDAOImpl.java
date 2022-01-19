package za.co.bakery.dbao;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import za.co.bakery.domain.Category;
import za.co.bakery.domain.Product;

/**
 *
 * @author StuartLittles
 */
public class ProductViewDAOImpl implements ProductViewDAO{
    
    private Connection connect = null;
    
    
    @Override
    public List<Product> getProduct(Category choice) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
