package za.co.bakery.service;

import java.util.List;
import za.co.bakery.dbao.ProductDAO;
import za.co.bakery.dbao.impl.ProductDAOImpl;
import za.co.bakery.domain.Category;
import za.co.bakery.domain.Ingredient;
import za.co.bakery.domain.Product;
import za.co.bakery.manager.DBPoolManagerBasic;

/**
 *
 * @author Stuart Littles
 */
public class ProductServiceImpl implements ProductService{
    private ProductDAO productDAO;

    public ProductServiceImpl(DBPoolManagerBasic dbpm) {
        this.productDAO = new ProductDAOImpl(dbpm);
    }

    @Override
    public boolean productAdd(String name, String picture, double price, Category category, String warning, String description, int recipeID) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Product> getProducts(String category) {
        String r = category.toUpperCase();
        
        if(r == null || r.isEmpty()){
            r = "0";
        }
        
        if(r.equalsIgnoreCase("0")){
 //           return 
        }
        return productDAO.read(Category.valueOf(r));
    }

    @Override
    public Product getProduct(String productID) {
        int pId = Integer.parseInt(productID);
        
        return productDAO.read(pId);
    }

    @Override
    public Ingredient getIngredient(int ingredientID) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    


    
}
