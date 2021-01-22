package com.kodilla.testing.shape;

import com.kodilla.testing.shape.Shape;
import com.kodilla.testing.shape.Triangle;
import com.kodilla.testing.shape.Square;
import com.kodilla.testing.shape.Circle;
import org.junit.jupiter.api.*;

public class ShapeCollectorTestSuite {

    @Test
    void testAddFigure() {
        //Given
        Shape circle = new Circle("Circle", 5);
        ShapeCollector add = new ShapeCollector();

        // When
        add.addFigure(circle);

        //Then
        Assertions.assertEquals(1, add.getFiguresQuantity());

    }

    @Test
    void testRemoveShape() {
        //Give
        Shape circle = new Circle("Circle", 6);
        ShapeCollector shape = new ShapeCollector();
        shape.addFigure(circle);

        //When
        boolean result = shape.removeFigure(circle);

        //Then
        Assertions.assertTrue(result);
        Assertions.assertEquals(0, shape.getFiguresQuantity());
    }

    @Test
    void getShape() {
        //Give
        Shape circle = new Circle("Circle", 7);
        ShapeCollector shape = new ShapeCollector();
        shape.addFigure(circle);

        //When
        Shape retrievedShape;
        retrievedShape = shape.getFigure(0);

        //Then
        Assertions.assertEquals(circle, retrievedShape);

    }
}
