package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> theForumUser = new ArrayList<>();

    public Forum() {
        theForumUser.add(new ForumUser(00,"Bender", 'M', LocalDate.of(2996,5,1),100));
        theForumUser.add(new ForumUser(01,"Fry", 'M', LocalDate.of(1985,11,8),20));
        theForumUser.add(new ForumUser(02,"Leela", 'F', LocalDate.of(2002,6,18),0));
        theForumUser.add(new ForumUser(03,"Amy", 'F', LocalDate.of(2008,3,9),0));
        theForumUser.add(new ForumUser(04,"Tim", 'M', LocalDate.of(2004,12,26),0));
        theForumUser.add(new ForumUser(05,"Loli", 'F', LocalDate.of(1980,1,12),1));
        theForumUser.add(new ForumUser(06,"Farnsworth", 'M', LocalDate.of(1960,7,14),5));
        theForumUser.add(new ForumUser(07,"Ryan", 'M', LocalDate.of(1986,9,30),1));

        /* nie rozumiem dlaczego warość 08 wykracza poza Integer, a np 10 już jest ok?
        theForumUser.add(new ForumUser(08,"Bender", 'M', LocalDate.of(2000,5,3),1));
        */
    }
    public List<ForumUser> getList() {
        return new ArrayList<>(theForumUser);
    }
}
