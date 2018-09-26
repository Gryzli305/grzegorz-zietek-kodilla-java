package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {
    private final int signatureUser;
    private final String userName;
    private final char sex;
    final LocalDate birthDate;
    private final int postsQu;

    public ForumUser(final int signatureUser, final String userName, final char sex, final LocalDate birthDate, final int postsQu) {
        this.signatureUser = signatureUser;
        this.userName = userName;
        this.sex = sex;
        this.birthDate = birthDate;
        this.postsQu = postsQu;
    }

    public int getSignatureUser() {
        return signatureUser;
    }

    public String getUserName() {
        return userName;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int getPostsQu() {
        return postsQu;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "signatureUser=" + signatureUser +
                ", userName='" + userName + '\'' +
                ", sex=" + sex +
                ", birthDate=" + birthDate +
                ", postsQu=" + postsQu +
                '}';
    }
}
