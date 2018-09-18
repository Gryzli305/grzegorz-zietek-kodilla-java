package com.kodilla.testing.forum.statistics;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ForumStatisticsTestSuite {

    private Statistics statisticsMock;
    private ForumStatistics forumStatistics;

    @Before
    public void beforeTest() {
        statisticsMock = mock(Statistics.class);

        List<String> listMock = new ArrayList<>();
        for (int i = 0; i < 10; i++ ) {
            listMock.add("User");
        }
        when(statisticsMock.usersNames()).thenReturn(listMock);
        when(statisticsMock.postsCount()).thenReturn(30);
        when(statisticsMock.commentsCount()).thenReturn(50);
        forumStatistics = new ForumStatistics();
     }
     @Test
    public void testCalculateAdvStatisticsWithZeroPosts() {
        // Given
        when(statisticsMock.postsCount()).thenReturn(0);
        // When
         forumStatistics.calculateAdvStatistics(statisticsMock);
         // Then
         assertEquals(0,forumStatistics.getPosts());
         assertEquals(0, forumStatistics.getPostsAvgUser(),0.1);
         assertEquals(0, forumStatistics.getCommentsAvgPerPost(),0.1);
     }
     @Test
    public void testCalculateAdvStatisticsWithThousandPosts() {
        //Given
         when(statisticsMock.postsCount()).thenReturn(1000);
         //When
         forumStatistics.calculateAdvStatistics(statisticsMock);
         //Then
         assertEquals(1000,forumStatistics.getPosts());
         assertEquals(100,forumStatistics.getPostsAvgUser(),0.01);
         assertEquals(0.05,forumStatistics.getCommentsAvgPerPost(),0.01);
     }
     @Test
    public void testCalculateAdvStatisticsWithZeroComments() {
        //given
        when(statisticsMock.commentsCount()).thenReturn(0);
        //when
         forumStatistics.calculateAdvStatistics(statisticsMock);
         //then
         assertEquals(0,forumStatistics.getComments());
         assertEquals(0,forumStatistics.getCommentsAvgPerUser(),0.01);
         assertEquals(0,forumStatistics.getCommentsAvgPerPost(),0.01 );
    }
    @Test
    public void testCalculateAdvStatisticsLessCommentsThanPosts() {
        //given
        when(statisticsMock.commentsCount()).thenReturn(10);
        when(statisticsMock.postsCount()).thenReturn(20);

        assertTrue(statisticsMock.commentsCount()<statisticsMock.postsCount());
    }
    @Test
    public void testCalculateAdvStatisticsMoreCommentsThanPosts() {
        //given
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //then
        assertTrue(forumStatistics.getComments()>forumStatistics.getPosts());
//        assertEquals(10,forumStatistics.getUser());
//        assertEquals(30,forumStatistics.getPosts());
//        assertEquals(50,forumStatistics.getComments());
//        assertEquals(3,forumStatistics.getPostsAvgUser(),0.01);
//        assertEquals(1.66,forumStatistics.getCommentsAvgPerPost(),0.01);
//        assertEquals(5,forumStatistics.getCommentsAvgPerUser(),0.01);
    }
    @Test
    public void testCalculateAdvStatisticsWithZeroUsers() {
        // given
        List<String>listMock = new ArrayList<>();
        when(statisticsMock.usersNames()).thenReturn(listMock);
        //when
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //then
        assertEquals(0,forumStatistics.getUser());
        assertEquals(0,forumStatistics.getPostsAvgUser(),0.01);
        assertEquals(0,forumStatistics.getCommentsAvgPerUser(),0.01);
    }
    @Test
    public void testCalculateAdvStatisticsWithHundredUsers() {
        //Given
        List<String> listMock = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            listMock.add("User");
        }
        when(statisticsMock.usersNames()).thenReturn(listMock);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(100, forumStatistics.getUser());
        assertEquals(0.3, forumStatistics.getPostsAvgUser(), 0.01);
        assertEquals(0.5, forumStatistics.getCommentsAvgPerUser(), 0.01);
    }
}




























