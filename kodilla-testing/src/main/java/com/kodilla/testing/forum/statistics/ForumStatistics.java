package com.kodilla.testing.forum.statistics;



public class ForumStatistics {

    private int user;
    private int posts;
    private int comments;
    private double postsAvgUser;
    private double commentsAvgPerUser;
    private double commentsAvgPerPost;

    public int getUser() {
        return user;
    }

    public int getPosts() {
        return posts;
    }

    public int getComments() {
        return comments;
    }

    public double getPostsAvgUser() {
        return postsAvgUser;
    }

    public double getCommentsAvgPerUser() {
        return commentsAvgPerUser;
    }

    public double getCommentsAvgPerPost() {
        return commentsAvgPerPost;
    }
    public void calculateAdvStatistics(Statistics statistics){
        user = statistics.usersNames().size();
        posts = statistics.postsCount();
        comments = statistics.commentsCount();
        postsAvgUser = calculatePostsAvgPerUser();
        commentsAvgPerUser = calculateCommentsAvgPerUser();
        commentsAvgPerPost = calculateCommentsAvgPerPost();
    }

    private double calculatePostsAvgPerUser() {
        if (user>0) {
            return (double) posts/user;
        } else {
            return 0;
        }
    }
    private double calculateCommentsAvgPerUser() {
        if (user>0) {
            return (double) comments/user;
        } else {
            return 0;
        }
    }
    private double calculateCommentsAvgPerPost() {
        if (posts>0) {
            return (double) comments/posts;
        } else {
            return 0;
        }
    }
    public void showStatistics() {
        System.out.println("Forum statistic");
        System.out.println("User quantity: " + user);
        System.out.println("Posts quantity: " + posts);
        System.out.println("Comments quantity: " + comments);
        System.out.println("Posts average per user" + postsAvgUser);
        System.out.println("Comments average per user" + commentsAvgPerUser);
        System.out.println("Comments average per post" + commentsAvgPerPost);
    }
}
