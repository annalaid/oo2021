package com.school;

import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Test;

public class AppTest {
    static Bottle bottle;
    static Barrel barrel;
    static BottleBox bottlebox;
    static BottleBox secondBottlebox;
    static Drink drink;

    @BeforeClass
    public static void init(){
        drink = new Drink("Red wine", 10.0, 0.75);
        bottle = new Bottle(70.0, 80.0, "Glass");
        barrel = new Barrel(10, 100, drink);
        bottlebox = new BottleBox("Paper box", 2.0, 4.0, 6);
        secondBottlebox = new BottleBox("Plasicbox", 20.0, 4.0, 8);
    }
    
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( bottle.capacity == 70.0 );
    }
}
