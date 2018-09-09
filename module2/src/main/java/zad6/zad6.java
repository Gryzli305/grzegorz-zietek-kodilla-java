package zad6;

/*
2.6. Map i HashMap
Zadanie: mapa uczniów i ocen
Przy użyciu wewnętrznego edytora Kodilli stwórz program z użyciem HashMap, który będzie przechowywał dane uczniów oraz ich ocen.
Program ma wyświetlać średnią arytmetyczną ocen każdego ucznia.
Rozwiązane zadanie wyślij do mentora.
 */
import java.util.*;
import java.lang.*;
import java.io.*;

class Schoolboy {

    private String firstName;
    private String lastName;
    private String klasa;

    public Schoolboy(String firstName, String lastName, String klasa) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.klasa = klasa;
    }

    public boolean equals(Schoolboy e){
        return (this.firstName == e.firstName) && (this.lastName == e.lastName) && (this.klasa == e.klasa);
    }
    public int hashCode(){
        return firstName.hashCode() * lastName.hashCode();
    }
    public String toString(){
        return firstName + " " + lastName + " (" + klasa + ")";
    }
}
class HashMapLoopAndConditions
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Schoolboy student1 = new Schoolboy("Marcin", "Gronowski", "8e");
        Schoolboy student2 = new Schoolboy("Marcin", "Hajducki", "8d");
        Schoolboy student3 = new Schoolboy("Michał", "Zajac", "6a");
        Schoolboy student4 = new Schoolboy("Robert", "Ślotała", "7b");

        HashMap<Schoolboy, List <Double>> ratingAverage = new HashMap<>();

        List<Double> grades1 = Arrays.asList(5.0, 3.5, 2.0, 4.5, 3.0);
        List<Double> grades2 = Arrays.asList(4.5, 4.5, 4.5, 4.5, 5.0, 6.0);
        List<Double> grades3 = Arrays.asList(3.0, 4.0, 5.0, 2.0);
        List<Double> grades4 = Arrays.asList(3.0, 5.0, 3.0, 4.0, 6.0);

        ratingAverage.put(student1, grades1);
        ratingAverage.put(student2, grades2);
        ratingAverage.put(student3, grades3);
        ratingAverage.put(student4, grades4);

        for (Map.Entry<Schoolboy, List<Double>> entry : ratingAverage.entrySet()) {
            Schoolboy nextStudent = entry.getKey();
            List<Double> gradesForNextStudent = entry.getValue();

            double sum = 0.0;

            for(Double singleGrade : gradesForNextStudent ) {
                sum += singleGrade;
            }
            double average = sum / gradesForNextStudent.size();
            System.out.println(" Average student ratings: " + nextStudent + " is: " + average);
        }
    }
}
