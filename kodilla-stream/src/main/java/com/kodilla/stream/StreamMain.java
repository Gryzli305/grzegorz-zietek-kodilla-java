package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.book.Book;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.person.People;
import com.kodilla.stream.reference.FunctionalCalculator;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.book.BookDirectory;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {

    public static void main(String[] args) {

        Forum Forum = new Forum();
        Map<Integer, ForumUser> theResultStreamForum = Forum.getList().stream()
                .filter(forumUser -> forumUser.getSex()=='M')
                .filter(forumUser -> Period.between(forumUser.getBirthDate(), LocalDate.now()).getYears()>=20)
                .filter(forumUser -> forumUser.getPostsQu() >= 1)
                .collect(Collectors.toMap(ForumUser::getSignatureUser,forumUser -> forumUser));

        theResultStreamForum.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);
    }
}






//            BookDirectory theBookDirectory = new BookDirectory();
//            String theResultStringOfBooks = theBookDirectory.getList().stream()
//                    .filter(book -> book.getYearOfPublication() > 2005)
//                    .map(Book::toString)
//                    .collect(Collectors.joining(",\n", "<<", ">>"));
//
//            System.out.println(theResultStringOfBooks);
//        }
//    }

//            BookDirectory theBookDirectory = new BookDirectory();
//            Map<String,Book> theResultListOfBooks = theBookDirectory.getList().stream()
//                    .filter(book -> book.getYearOfPublication() > 2005)
//                    .collect(Collectors.toMap(Book::getSignature,book -> book));
//
//            System.out.println("# elements: " + theResultListOfBooks.size());
//            theResultListOfBooks.entrySet().stream()
//                    .map(entry -> entry.getKey() + ": " + entry.getValue())
//                    .forEach(System.out::println);
//        }
//    }

//        People.getList().stream()
//                .map(String::toUpperCase)
//                .filter(s -> s.length() > 11)
//                .map(s -> s.substring(0, s.indexOf(' ') + 2) + ".")
//                .filter(s -> s.substring(0, 1).equals("M"))
//                .forEach(System.out::println);
//    }
//}

//        System.out.println("Using Stream to generate even numbers from 1 to 20");
//        NumbersGenerator.generateEven(20);
//
//    }
//}

//        PoemBeautifier poemBeautifier = new PoemBeautifier();
//        System.out.println("decorating text with lamda \n");
//        poemBeautifier.beautify("test", (tekst -> "---===" + tekst + "===---"));
//        poemBeautifier.beautify("Loading", (tekst -> "|/-\\|*" + tekst + "*|/-\\|"));
//        poemBeautifier.beautify("test", (tekst -> "-=-=-=" + tekst + "=-=-=-"));
//        poemBeautifier.beautify("Java Master", (tekst -> "******" + tekst.toUpperCase() + "******"));
//        poemBeautifier.beautify("TO LOWER CASE", (tekst -> "BBAA " + tekst.toLowerCase() + " AABB"));
//        poemBeautifier.beautify("TO LOWER CASE", (tekst -> "******" + tekst.hashCode() + "******"));
//    }
//}

//        ExpressionExecutor expressionExecutor = new ExpressionExecutor();
//
//        System.out.println("Calculating expressions with lambdas");
//        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
//        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
//        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
//        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);
//
//        System.out.println("Calculating expressions with method references");
//        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
//        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
//        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
//        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);
//    }
//}
