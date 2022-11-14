package praktikum;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class BurgerParameterizedTest {

    private final float bunPrice;
    private final float ingredientPrice;
    private final Float expectedBurgerPrice;
    Burger burger = new Burger();

    public BurgerParameterizedTest(float bunPrice, float ingredientPrice, float expectedBurgerPrice) {
        this.bunPrice = bunPrice;
        this.ingredientPrice = ingredientPrice;
        this.expectedBurgerPrice = expectedBurgerPrice;
    }

    @Parameterized.Parameters
    public static Object[][] getPriceData() {
        return new Object[][]{
                {200f, 300f, 700f},
                {0, 300f, 300f},
                {200f, 0, 400f},
                {0, 0, 0},
        };
    }

    @Mock
    Bun bun;

    @Before
    public void init() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void getPriceReturnsCorrectPriceValue() {
        Ingredient chiliSauce = new Ingredient(IngredientType.SAUCE, "chili sauce", ingredientPrice);

        burger.setBuns(bun);
        burger.addIngredient(chiliSauce);
        Mockito.when(bun.getPrice()).thenReturn(bunPrice);

        float actualBurgerPrice = burger.getPrice();
        Assert.assertEquals("Incorrect burger price", expectedBurgerPrice, actualBurgerPrice, 0);
    }
}