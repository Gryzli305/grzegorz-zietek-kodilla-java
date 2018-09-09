package zad3;

/*
W tym zadaniu przypomnimy sobie HashMapy.

Napisz program, który przekopiuje wszystkie wartości z HashMapy myFavoriteColors i myFriendsFavoriteColors do HashMapy ourFavoriteColors:

Map <Integer,String> myFavoriteColors = new HashMap <Integer,String> ();
Map <Integer,String> myFriendsFavoriteColors = new HashMap <Integer,String> ();

myFavoriteColors.put(1, "Red");
myFavoriteColors.put(2, "Green");
myFavoriteColors.put(3, "Black");
System.out.println("Values in first map: " + myFavoriteColors);
myFriendsFavoriteColors.put(4, "White");
myFriendsFavoriteColors.put(5, "Blue");
myFriendsFavoriteColors.put(6, "Orange");
System.out.println("Values in second map: " + myFriendsFavoriteColors);

Map <Integer,String> ourFavoriteColors = new HashMap <Integer,String> ();
 */
import java.util.HashMap;
import java.util.Map;

class Hash {

    public static void main (String[] args) {

        Map<Integer, String> myFavoriteColors = new HashMap<Integer, String>();
        Map<Integer, String> myFriendsFavoriteColors = new HashMap<Integer, String>();

        myFavoriteColors.put(1, "Red");
        myFavoriteColors.put(2, "Green");
        myFavoriteColors.put(3, "Black");
        System.out.println("Values in first map: " + myFavoriteColors);



        myFriendsFavoriteColors.put(4, "White");
        myFriendsFavoriteColors.put(5, "Blue");
        myFriendsFavoriteColors.put(6, "Orange");
        System.out.println("Values in second map: " + myFriendsFavoriteColors);

        Map<Integer, String> ourFavoriteColors = new HashMap<Integer, String>();

        for(Map.Entry<Integer, String> singleColor : myFavoriteColors.entrySet()) {
            ourFavoriteColors.put(singleColor.getKey(),singleColor.getValue());
        }
        for(Map.Entry<Integer, String> singleColor : myFriendsFavoriteColors.entrySet()) {
            ourFavoriteColors.put(singleColor.getKey(),singleColor.getValue());
        }

        System.out.println("Values in third map: " + ourFavoriteColors);
    }
}