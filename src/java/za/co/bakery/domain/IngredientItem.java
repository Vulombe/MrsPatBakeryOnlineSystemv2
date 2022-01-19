
package za.co.bakery.domain;

/**
 *
 * @author StuartLittles
 */
<<<<<<< HEAD
public class IngredientItem{
=======
class IngredientItem{
>>>>>>> ebdf52d7c2de03e58c654e3f009d94bc74e1ae0b
    private int qty;
    private Ingredient ingredient;

    public Ingredient getIngredient() {
        return ingredient;
    }

    public void setIngredient(Ingredient ingredient) {
        this.ingredient = ingredient;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public IngredientItem(int qty) {
        this.qty = qty;
        
    }

    @Override
    public String toString() {
        return ingredient.getName() + qty;
    }
    
}
