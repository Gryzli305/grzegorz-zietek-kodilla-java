package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BoardTestSuite {

    @Test
    public void testTaskAdd() {

        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);

        board.getDoneList().addTask("Task done");
        board.getInProgressList().addTask("Task in progress");
        board.getToDoList().addTask("Task to do");

        Assert.assertEquals("Task done",board.getDoneList().getTasks().get(0));
        Assert.assertEquals("Task in progress",board.getInProgressList().getTasks().get(0));
        Assert.assertEquals("Task to do",board.getToDoList().getTasks().get(0));

    }
}
