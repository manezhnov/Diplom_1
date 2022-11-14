package praktikum;

import org.junit.Assert;
import org.junit.Test;

public class IngredientTest {

    Ingredient dinosaur = new Ingredient(IngredientType.FILLING, "dinosaur", 200.20f);

    @Test
    public void getIngrediendtPrice() {
        float actualIngredientPrice = dinosaur.getPrice();
        Assert.assertEquals("Error in ingredient price", 200.20f, actualIngredientPrice, 0);
    }

    @Test
    public void getIngredientName() {
        String actualIngredientName = dinosaur.getName();
        Assert.assertEquals("Error in ingredient name", "dinosaur", actualIngredientName);
    }

    @Test
    public void getIngredientType() {
        IngredientType actualIngredientType = dinosaur.getType();
        Assert.assertEquals("Error in ingredient type", IngredientType.FILLING, actualIngredientType);
    }
}