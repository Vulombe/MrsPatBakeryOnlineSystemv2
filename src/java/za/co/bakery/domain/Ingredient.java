
package za.co.bakery.domain;

/**
 *
 * @author StuartLittles
 */
<<<<<<< HEAD
public class Ingredient {
    private int ingredientID;
=======
class Ingredient {
>>>>>>> ebdf52d7c2de03e58c654e3f009d94bc74e1ae0b
    private String name;
    private String nutrient;

    @Override
    public String toString() {
        return name + nutrient;
    }

<<<<<<< HEAD
    public Ingredient(String name, String nutrient, int ingredientID) {
=======
    public Ingredient(String name, String nutrient) {
>>>>>>> ebdf52d7c2de03e58c654e3f009d94bc74e1ae0b
        this.name = name;
        this.nutrient = nutrient;
    }

    public String getName() {
        return name;
    }
<<<<<<< HEAD
    
    public int getIngredientID() {
        return ingredientID;
    }

    public void setIngredientID(int ingredientID) {
        this.ingredientID = ingredientID;
    }
=======

>>>>>>> ebdf52d7c2de03e58c654e3f009d94bc74e1ae0b
    public void setName(String name) {
        this.name = name;
    }

    public String getNutrient() {
        return nutrient;
    }

    public void setNutrient(String nutrient) {
        this.nutrient = nutrient;
    }
    
}
