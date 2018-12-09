package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListDaoTestSuite {

    @Autowired
    private TaskListDao taskListDao;
    private static final String LISTNAME = "Test list one";
    private static final String DESCRIPTION = "DESCRIPTION Test list one";

    @Test
    public void testFindByListName() {
        TaskList taskList = new TaskList(LISTNAME,DESCRIPTION);

        taskListDao.save(taskList);

        String s = taskList.getListName();
        List<TaskList> readTaskList = taskListDao.findByListName(LISTNAME);

        Assert.assertEquals(1,readTaskList.size());

        taskListDao.delete(taskList);
    }
}
