package zad4;

/*Część 1

Napisz program, który w kolejce ArrayDeque umieści 50 obiektów przechowujących napisy, składające się z litery 'a' powtórzonej losową ilość razy (zakres powtórzeń: 1 - 50).
Wypełnienie obiektu powtórzeniami litery 'a' zrealizuj przy pomocy pętli for.

Część 2

Program z części pierwszej rozbuduj w taki sposób, że przekażesz utworzoną kolejkę do metody Twojej klasy, która dokona rozdzielenia obiektów z kolejki na dwie kolekcje ArrayList.
Jedna z nich będzie przechowywała obiekty o parzystej ilości znaków 'a', a druga o nieparzystej.
*/
import java.util.*;
import java.lang.*;
import java.io.*;

class ReapeatedA{

    public String value;

    public ReapeatedA() {
        String  tempValue = "";
        Random randomGenerator = new Random();
        int reps = randomGenerator.nextInt(50) +1;

        for( int i = 0; i < reps; i++) {
            tempValue += "a";
        }

        this.value = tempValue;
    }

    public String getValue() {
        return value;
    }

}
class Sorting{

    private ArrayList<String> more;
    private ArrayList<String> less;

    public Sorting() {
        this.more = new ArrayList<String>();
        this.less = new ArrayList<String>();
    }

    public void sort(ArrayDeque<ReapeatedA> queue) {
        String polledValue = null;

        while(queue.size() > 0) {
            polledValue = queue.poll().value;
            if(polledValue.length() > 25) {
                more.add(polledValue);
            } else {
                less.add(polledValue);
            }
        }
    }

    public int sizeMore() {
        return more.size();
    }
    public int sizeLess() {
        return less.size();
    }

    public void printMore() {
        for(String moreString :more) {
            System.out.println(moreString);
        }
    }

    public void printLess() {
        for(String lessString :less) {
            System.out.println(lessString);
        }
    }
}
class Kodilla {

    public static void main (String[] args) {
        ArrayDeque<ReapeatedA> queueOfAs = new ArrayDeque<ReapeatedA>();

        for(int i = 0; i<50; i++) {
            queueOfAs.offer(new ReapeatedA());
        }
        Sorting sortingObj = new Sorting();
        sortingObj.sort(queueOfAs);

        System.out.println("Strings larger than 25 (" + sortingObj.sizeMore() + ") String");
        sortingObj.printMore();
        System.out.println("\nStrings smaller than 25 (" + sortingObj.sizeLess() + ") String");
        sortingObj.printLess();
    }
}
