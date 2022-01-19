
package za.co.bakery.service;

import java.util.ArrayList;
import za.co.bakery.dbao.ProductViewDAO;
import za.co.bakery.dbao.ProductViewDAOImpl;
import za.co.bakery.domain.Category;
import za.co.bakery.domain.Product;

/**
 *
 * @author StuartLittles
 */
public class ProductViewImpl implements ProductViewService{
    private ProductViewDAO productDao;

    public ProductViewImpl() {
        this.productDao = new ProductViewDAOImpl();
    }
    
    

    @Override
    public ArrayList<Product> getProduct(Category choice) {
       // return productDao;
       return null;
    }
}

