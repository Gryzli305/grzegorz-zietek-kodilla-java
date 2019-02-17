package com.kodilla.patterns2.observer.homework;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KodillaHomeworksTestSuite {

    @Test
    public void testUpdate() {

        Student kowal = new Student("Ted Kowalski", KodillaCourse.Java_Developer);
        Student nowalk = new Student("Jaś Wędrowniczek", KodillaCourse.Java_Developer);
        Student trump = new Student("Daffy Trump", KodillaCourse.Web_Developer);

        Mentor ml = new Mentor("ML");
        Mentor jb = new Mentor("Jack Black");

        kowal.registerObserver(ml);
        nowalk.registerObserver(ml);
        trump.registerObserver(jb);

        kowal.addHomework("1.2", "Interface");
        kowal.addHomework("1.6.", "Object");
        nowalk.addHomework("20.4", "Obserwer");
        trump.addHomework("1.1", "Index.html");

        assertEquals(3, ml.getUpdateCount());
        assertEquals(1, jb.getUpdateCount());
    }
}