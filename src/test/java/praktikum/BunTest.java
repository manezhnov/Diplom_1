package praktikum;

import org.junit.Assert;
import org.junit.Test;

public class BunTest {

    @Test
    public void getBunName() {
        Bun bun = new Bun("white bun", 200);
        String actualBunName = bun.getName();
        Assert.assertEquals("The correct bun name is not displayed", "white bun", actualBunName);
    }

    @Test
    public void getBunPrice() {
        Bun bun = new Bun("white bun", 200.20f);
        float actualBunPrice = bun.getPrice();
        Assert.assertEquals("The correct bun price is not displayed", 200.20f, actualBunPrice, 0);
    }
}