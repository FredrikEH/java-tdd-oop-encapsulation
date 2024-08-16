package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CarTest {

    Car car = new Car("red", false, true);

    @Test
    public void testMove(){
        Assertions.assertEquals(5, car.move(5));
    }

    @Test
    public void testMoveNoParameter(){
        Assertions.assertTrue(car.move());
    }
}
