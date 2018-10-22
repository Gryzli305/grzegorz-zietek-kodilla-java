package addProject;

import java.util.Arrays;

public class Tab {

    public static void main(String[] args) {

        int []tablica = {8,3,7,2,5,1};
        int temp;
        int mini;
        int max;
        System.out.println("przed sortowaniem: " + Arrays.toString(tablica));

        for (int i = 0 ; i < tablica.length; i++) {
            mini = i;
            for(int j = i; j < tablica.length; j++) {
                if (tablica[j]< tablica[mini]) {
                    mini = j;
                }
            }
            temp = tablica[i];
            tablica[i] = tablica[mini];
            tablica[mini] = temp;
                }

        System.out.println("po sortowaniu rosnąco: " + Arrays.toString(tablica));

        for (int i = 0 ; i < tablica.length; i++) {
            max = i;
            for (int j = i; j < tablica.length; j++) {
                if (tablica[j]> tablica[max]) {
                    max = j;
                }
            }
            temp = tablica[i];
            tablica[i] = tablica[max];
            tablica[max] = temp;

        }
        System.out.println("malejąco :" + Arrays.toString(tablica));
        }

    }

