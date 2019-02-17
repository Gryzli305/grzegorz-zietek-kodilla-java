package com.kodilla.patterns2.observer.homework;

import java.util.*;


public class Student implements Observable {
    private final String surname;
    private final List<Observer> observers;
    private Map<String, String> homeworks;
    private final KodillaCourse name;

    public Student(String surname, KodillaCourse name) {
        this.surname = surname;
        observers = new ArrayList<>();
        homeworks = new LinkedHashMap<>();
        this.name = name;
    }

    public void addHomework(String homeworkNumber, String answer) {
        homeworks.put(homeworkNumber, answer);
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public String getSurname() {
        return surname;
    }

    public Map<String, String> getHomeworks() {
        return homeworks;
    }

    public KodillaCourse getCourseName() {
        return name;
    }
}
