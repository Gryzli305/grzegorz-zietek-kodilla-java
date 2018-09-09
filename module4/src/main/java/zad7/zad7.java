package zad7;

/*
Zadanie: Implementacja algorytmu Euklidesa
Wyzwanie może wydawać się trudne na samym początku, ale jest to naprawdę prosty program. Podzielimy implementację tego programu na konkretne etapy, co pozwoli nam na spojrzenie na nie w prosty i przyjazny sposób.

Aby wykonać poprawnie to zadanie potrzebne będzie wykorzystanie poniższych funkcji języka Java:

while(),
if i else,
System.out.println().
Rozpocznij swój program w edytorze udostępnionym przez Kodillę, aby mieć wszystko gotowe przed implementacją.

Pierwszym krokiem w celu utworzenia programu powinna być deklaracja zmiennych. Wiemy, że algorytm operuje na 2 zmiennych dla których szuka dzielnika, wiemy też, że liczby są liczbami całkowitymi. Stwórz i przypisz im domyślne wartości.
Kolejnym krokiem jest utworzenie pętli while, która będzie trwać do końca znalezienia wspólnego dzielnika 2 zmiennych.
Wewnątrz pętli while należy skorzystać z warunku if i else oraz operatora -=, dzięki któremu wykonuje takie działanie a = a - b, czyli pomniejsza wartość a o wartość b i przypisuje ją do zmiennej a:
a -= b;
Wykonując te trzy kroki i implementując odpowiednio logikę, jesteś w stanie zaimplementować algorytm Euklidesa. Swój kod skompiluj i prześlij do mentora. Powodzenia!
 */
class Euklides {

    public static void main(String[] args) {
        int a = 25;
        int b = 15;

        while ( a != b) {
            if (a > b) {
                a -= b;
            }  else {
                b -= a;
            }
        }
        System.out.println("Największy wspólny dzielnik to: " + a);
    }
}