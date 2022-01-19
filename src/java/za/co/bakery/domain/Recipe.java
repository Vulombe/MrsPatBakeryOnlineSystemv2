
package za.co.bakery.domain;

import java.util.ArrayList;

/**
 *
 * @author StuartLittle
 */
<<<<<<< HEAD
public class Recipe {
=======
class Recipe {
>>>>>>> ebdf52d7c2de03e58c654e3f009d94bc74e1ae0b
    private String steps;
    private ArrayList<IngredientItem> ingredients;
    private String recipeName;

    public Recipe(String steps, ArrayList<IngredientItem> ingredients, String recipeName) {
        this.steps = steps;
        this.ingredients = ingredients;
        this.recipeName = recipeName;
    }
    
    public String getRecipeName() {
        return recipeName;
    }

    public void setRecipeName(String recipeName) {
        this.recipeName = recipeName;
    }
   

    public String getSteps() {
        return steps;
    }

    public void setSteps(String steps) {
        this.steps = steps;
    }

    public ArrayList<IngredientItem> getIngredients() {
        return ingredients;
    }

    public void setIngredients(ArrayList<IngredientItem> ingredients) {
        this.ingredients = ingredients;
    }

    @Override
    public String toString() {
        return recipeName;
    }
    
}
