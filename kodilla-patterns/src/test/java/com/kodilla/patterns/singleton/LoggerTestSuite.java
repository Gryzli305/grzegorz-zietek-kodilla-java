package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {

    @Test
    public void testGetLastLog() {
        String log = "28.10.2018";
        String log2 = "29.10.2018";

        Logger.getInstance().log(log);
        Logger.getInstance().log(log2);

        Assert.assertEquals(log2, Logger.getInstance().getLastLog());
    }
}
