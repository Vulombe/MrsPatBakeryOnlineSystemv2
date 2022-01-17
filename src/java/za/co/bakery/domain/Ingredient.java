
package za.co.bakery.domain;

/**
 *
 * @author StuartLittles
 */
class Ingredient {
    private String name;
    private String nutrient;

    @Override
    public String toString() {
        return name + nutrient;
    }

    public Ingredient(String name, String nutrient) {
        this.name = name;
        this.nutrient = nutrient;
    }

    public String getName() {
        return name;
    }

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
