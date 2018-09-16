package com.kodilla.testing.forum.tdd;

import com.kodilla.testing.ShapeCollector.*;
import org.junit.*;

public class ShapeCollectorTestSuite {
    ShapeCollector testFigure;

    @Before
    public void before() {
        System.out.println("Test Case: begin");
    }
    @After
    public void after() {
        System.out.println("Test Case: end");
    }
    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test Suite: begin");
    }
    @AfterClass
    public static void afterClass() {
        System.out.println("Test Suite: end");
    }

    @Test
    public void testAddFigure() {
        ShapeCollector shapeCollector = new ShapeCollector();

        shapeCollector.addFigure(new Square(4.0));
        shapeCollector.addFigure(new Circle(4.0));
        shapeCollector.addFigure(new Triangle(4.0,5.5));
        Shape shape = shapeCollector.getFigure(0);

        Assert.assertEquals("square", shape.getShapeName());
        Assert.assertEquals(16, shape.getField(), 0.1);
        Assert.assertEquals(3,shapeCollector.getShapesList().size());
    }
    @Test
    public void testRemoveFigure() {
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(new Square(4.0));

        Shape shape = shapeCollector.getFigure(0);
        shapeCollector.removeFigure(shape);

   //     Shape shape = new Square(4.0);
   //     testFigure.removeFigure(shape);
   //     shapeCollector.addFigure(new Square(4.0));
   //     Shape shape = new Square(4.0);
   //     shapeCollector.addFigure(new Square(4.0));
   //     shapeCollector.removeFigure(new Square(4.0));

       Shape shape1 = shapeCollector.removeFigure(shape);  // nie mogę sobie poradzić z usówaniem figury

        Assert.assertEquals(true, shape1);
    //    Assert.assertEquals(true, result);
        Assert.assertEquals(0,shapeCollector.getShapesList().size());
    }
    @Test
    public void TestGetFigure() {
        ShapeCollector shapeCollector = new ShapeCollector();

        shapeCollector.addFigure(new Square(4.0));
        Shape shape = shapeCollector.getFigure(0);

        Assert.assertTrue(shape != null );
    }
    @Test
    public void testShowFigure() {
        ShapeCollector shapeCollector = new ShapeCollector();

        shapeCollector.addFigure(new Square(4.0));
        Shape shape = shapeCollector.getFigure(0);

        Assert.assertEquals("square", shape.getShapeName());
    }
}
