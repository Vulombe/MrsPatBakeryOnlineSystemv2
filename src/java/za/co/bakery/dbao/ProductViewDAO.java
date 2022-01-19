package za.co.bakery.dbao;

import java.util.ArrayList;
import java.util.List;
import za.co.bakery.domain.Category;
import za.co.bakery.domain.Product;

/**
 *
 * @author StuartLittles
 */
public interface ProductViewDAO {
        List<Product> getProduct(Category choice);
}
