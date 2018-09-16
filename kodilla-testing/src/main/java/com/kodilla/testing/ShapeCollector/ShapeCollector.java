package com.kodilla.testing.ShapeCollector;
/*
Celem zadania jest przetestowanie klasy, którą musisz napisać, o nazwie — powiedzmy — ShapeCollector, przy następujących założeniach:

Klasa ta przechowuje figury geometryczne w kolekcji ArrayList. Figury są następujące: kwadrat, koło, trójkąt (oczywiście użyj angielskich nazw klas).
Wszystkie figury implementują interfejs Shape, który musisz przygotować. Zawiera on dwie metody:
jedna zwraca nazwę figury ("square", "triangle" oraz "circle"),
a druga zwraca obliczone pole powierzchni tej figury.
Klasy figur implementują interfejs Shape.
Klasa ShapeCollector ma trzy metody:
jedną dodającą figurę do kolekcji,
drugą usuwającą figurę z kolekcji,
trzecią pobierającą z kolekcji figurę z pozycji n listy.
Aby przygotować rozwiązanie zadania:

W katalogu src/main/java utwórz pakiet com.kodilla.testing.shape.
W stworzonym pakiecie utwórz interfejs Shape, zawierający dwie metody: getShapeName() oraz getField().
Utwórz klasy reprezentujące poszczególne figury — posiadające już właściwe implementacje metod interfejsu.
Utwórz klasę ShapeCollector z metodami: addFigure(Shape shape), removeFigure(Shape shape), getFigure(int n) oraz showFigures().
W katalogu src/test/java utwórz pakiet com.kodilla.testing.shape.
Stwórz w tym pakiecie klasę testową (zbiór testów) ShapeCollectorTestSuite.
Napisz testy sprawdzające metody klasy ShapeCollector.
Zadanie wykonaj zgodnie z podejściem TDD: najpierw napisz testy (wyślij klasę z testami jako snippet do Mentora poprzez czat przed dalszym wykonywaniem zadania), a dopiero potem uzupełnij implementację metod klasy ShapeCollector.

Końcowe rozwiązanie zadania prześlij do repozytorium GitHub. Link do repozytorium wklej poniżej i wyślij do mentora. Powodzenia!
 */
import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {

    private List<Shape> shapesList = new ArrayList<>();
    public List<Shape> getShapesList() {
        return shapesList;
    }
    public void addFigure(Shape shape) {
        shapesList.add(shape);
    }
    public boolean removeFigure(Shape shape) {
         boolean result = false;
        if (shapesList.contains(shape)) {
            shapesList.remove(shape);
            result = true;
        }
        return result;
    }
    public Shape getFigure(int n) {
        Shape shape = shapesList.get(n);
        return shape;
    }
    public void showFigures() {
        for (Shape shape  : shapesList) {
            System.out.println(shape.getShapeName());
        }
    }
}

