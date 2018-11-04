package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {
        User jarek = new Millenials("Jarek Jarek");
        User darek = new YGeneration("Darek Darek");
        User arek = new ZGeneration("Arek Arek");

        String jarekPrefers = jarek.sharePost();
        System.out.println("Jarek " + jarekPrefers);

        String darekPrefers = darek.sharePost();
        System.out.println("Darek " + darekPrefers);

        String arekPrefers = arek.sharePost();
        System.out.println("Arek " + arekPrefers);

        Assert.assertEquals("preferred communication channel - Facebook",jarekPrefers);
        Assert.assertEquals("preferred communication channel - Snapchat",darekPrefers);
        Assert.assertEquals("preferred communication channel - Twitter",arekPrefers);
        System.out.println();
    }
    @Test
    public void testIndividualSharingStrategy() {
        User jarek = new Millenials("Jarek Jarek");

        String jarekPrefer = jarek.sharePost();
        System.out.println("Jarek " + jarekPrefer);

        jarek.setCommunicationChannel(new TwitterPublisher());
        jarekPrefer = jarek.sharePost();
        System.out.println("Jarek now prefer " + jarekPrefer);

        Assert.assertEquals("preferred communication channel - Twitter", jarekPrefer);
    }
}
