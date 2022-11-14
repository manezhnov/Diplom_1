package praktikum;

import org.junit.Assert;
import org.junit.Test;

public class BurgerTest {


    Burger burger = new Burger();
    Database database = new Database();
    Ingredient ingredient = new Ingredient(
            database.availableIngredients().get(2).type,
            database.availableIngredients().get(2).name,
            database.availableIngredients().get(2).price);
    Bun bun = new Bun(
            database.availableBuns().get(1).name,
            database.availableBuns().get(1).price);

    @Test
    public void setBun() {

        burger.setBuns(bun);
        Assert.assertNotNull("Burger bun not selected", bun);
    }

    @Test
    public void addIngredient() {
        burger.addIngredient(ingredient);
        Assert.assertEquals("Burger ingredient not selected", burger.ingredients.get(0), ingredient);
    }

    @Test
    public void removeIngredient() {
        burger.addIngredient(ingredient);
        burger.removeIngredient(0);
        var isIngredientsEmpty = burger.ingredients.isEmpty();
        Assert.assertTrue("Burger ingredient not removed", isIngredientsEmpty);
    }

    @Test
    public void moveIngredient() {
        burger.addIngredient(ingredient);
        burger.addIngredient(ingredient);
        burger.moveIngredient(1, 0);
        Assert.assertEquals("Burger ingredient not moved", burger.ingredients.get(0), ingredient);
    }

}