import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class Testing {
    Drink wine = new Drink("Rosé", 5.0, 1.9);
    Bottle firstBottle = new Bottle(0.7, 0.1, "Glass bottle", wine);

    @Test
    public void testinTheBottle() {
        firstBottle.addDrink(wine);
        assertEquals(0.2, firstBottle.bottleWeight());
    }

}