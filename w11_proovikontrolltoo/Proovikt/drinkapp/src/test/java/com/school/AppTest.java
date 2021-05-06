package com.school;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith( JUnit4.class )
public class AppTest{
    static Bottle bottle;
    static Barrel barrel;
    static BottleBox bottlebox;
    static BottleBox secondBottlebox;
    static Drink drink;

    @Before
    public void init(){
        drink = new Drink( "Red wine", 10.0, 0.75 );
        bottle = new Bottle( 70.0, 80.0, "Glass" );
        barrel = new Barrel( 10, 100, drink );
        bottlebox = new BottleBox( "Paper box", 2.0, 4.0, 6 );
        secondBottlebox = new BottleBox( "Plasicbox", 20.0, 4.0, 8 );
    }

    @Test
    public void shouldAddDrinkToBottle(){
        assertNull( bottle.getDrink() );
        bottle.addDrink( drink );
        assertSame( bottle.getDrink(), drink );
    }

    @Test
    public void shouldAddDrinkFromBarrelToBottle(){
        assertNull(barrel.barrelToBottles(bottle));
        assertEquals(141, barrel.barrelToBottles(bottle).size());;
    }

    @Test
    public void shouldReturnEmptyBottleWeight(){
        assertNull( bottle.getDrink() );
        assertEquals( 35.0, bottle.bottleWeight(), 0.0 );
    }

    @Test
    public void shouldReturnBottleSpecialPriceWithout(){
        assertNull( bottle.getDrink() );
        assertEquals( 80.00, bottle.bottleSpecialPrice(), 0.0 );
    }

    @Test
    public void shouldReturnBottleSpecialPriceWithDrink(){
        bottle.addDrink( drink );
        assertEquals( 80.70, bottle.bottleSpecialPrice(), 0.0 );
    }

    @Test
    public void shouldReturnBottleWeightWithDrink(){
        bottle.addDrink( drink );
        assertEquals( 87.50, bottle.bottleWeight(), 0.0 );
    }

    @Test
    public void shouldNotBeAbleToFillBottleFromBarrel(){
    }

    @Test
    public void shouldBeAbleToFill(){
    }

}