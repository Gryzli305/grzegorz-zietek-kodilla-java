package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {

    TaskFactory factory = new TaskFactory();

    @Test
    public void testFactoryDriving() {

        Task driving = factory.makeTask(TaskFactory.DRIVING, "order88", "London", "car");

        Assert.assertEquals("order88", driving.getTaskName());
        Assert.assertFalse(driving.isTaskExecuted());
    }

    @Test
    public void testFactoryPainting() {

        Task painting = factory.makeTask(TaskFactory.PAINTING, "Painting", "green", "wall");

        Assert.assertEquals("Painting", painting.getTaskName());
        Assert.assertTrue(painting.isTaskExecuted());
    }

    @Test
    public void testFactoryShopping() {

        Task shopping = factory.makeTask(TaskFactory.SHOPING, "vegetables", "potatoes", "2.5");

        Assert.assertEquals("vegetables", shopping.getTaskName());
        Assert.assertFalse(shopping.isTaskExecuted());

    }
}
