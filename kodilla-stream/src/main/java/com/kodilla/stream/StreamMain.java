package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.reference.FunctionalCalculator;

public class StreamMain {
    public static void main(String[] args) {
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        System.out.println("decorating text with lamda \n");
        poemBeautifier.beautify("test", (tekst -> "---===" + tekst + "===---"));
        poemBeautifier.beautify("Loading", (tekst -> "|/-\\|*" + tekst + "*|/-\\|"));
        poemBeautifier.beautify("test", (tekst -> "-=-=-=" + tekst + "=-=-=-"));
        poemBeautifier.beautify("Java Master", (tekst -> "******" + tekst.toUpperCase() + "******"));
        poemBeautifier.beautify("TO LOWER CASE", (tekst -> "BBAA " + tekst.toLowerCase() + " AABB"));
        poemBeautifier.beautify("TO LOWER CASE", (tekst -> "******" + tekst.hashCode() + "******"));
    }
}
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
