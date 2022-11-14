package praktikum;

import org.junit.Assert;
import org.junit.Test;

public class IngredientTypeTest {
    @Test
    public void IsIngredientTypeContainsSauce() {
        Assert.assertEquals("The SAUCE is not found the ingredient types", "SAUCE", IngredientType.SAUCE.name());
    }

    @Test
    public void IsIngredientTypeContainsFilling() {
        Assert.assertEquals("The FILLING is not found the ingredient types", "FILLING", IngredientType.FILLING.name());
    }
}