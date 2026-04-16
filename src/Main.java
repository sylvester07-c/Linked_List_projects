import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

    private  static  void printItenary(LinkedList<String> list){
        String firstVisit = list.getFirst();
        for(String place : list){
            System.out.println("From --> " + firstVisit + " To " + place);
            firstVisit = place;
        }
    }

    private static void addElements(LinkedList<String> list) {
        list.add("Kano");
        list.addLast("Borno");
        list.offer("Abuja");
        list.offerFirst("Lagos");

//        System.out.println(list);
    }

    private static void printItenary1(LinkedList<String> list) {
        System.out.println("Trip starts at " + list.getFirst());
        String previousTown = list.getFirst();
        ListIterator<String> iterator = list.listIterator(1);
        while(iterator.hasNext()) {
            var town = iterator.next();
            System.out.println("--> From " + previousTown + " to " + town);
            previousTown = town;
        }

        System.out.println("Trip ends at " + list.getLast());
    }

    private static void iterator2(LinkedList<String> list){
        ListIterator<String> iterator = list.listIterator();
        while(iterator.hasNext()){
            var town = iterator.next();
//            System.out.println(town);

        }
        while (iterator.hasPrevious()) {
            var place = iterator.previous();
            System.out.println(place);
        }
        System.out.println(list);
    }

    private static void addPlace(LinkedList<Place> list, Place place) {

        if(list.contains(place)){
            System.out.println("Found duplicate: " + place);
            return;
        }

        for(Place p : list){
            if(p.getPlace().equalsIgnoreCase(place.getPlace())){
                System.out.println("Found duplicate: " + place);
                return;
            }
        }

        int matchedIndex = 0;
        for(var listPlace: list){
            if(place.getDistance() < listPlace.getDistance()){
                list.add(matchedIndex, place);
                return;
            }

            matchedIndex++;
        }

        list.add(place);
    }

    private static void printOptions(){
        System.out.println("""
                
               Available actions (select word or letter):
               (M)enu
                   (F)orward
                   (B)ackward
                   (L)ist
               (Q)uit:    
                """);
    }

    private static void forward(LinkedList<Place> list) {
        ListIterator<Place> iterator = list.listIterator();
        while (iterator.hasNext()){
            var place = iterator.next();
            System.out.println(place.toString());
        }
    }

    private static void backward(LinkedList<Place> list) {
        ListIterator<Place> iterator = list.listIterator();
        while(iterator.hasNext()){
            var town = iterator.next();
//            System.out.println(town);

        }
        while (iterator.hasPrevious()) {
            var place = iterator.previous();
            System.out.println(place.toString());
        }
    }

    private static void listOfPlaces(LinkedList<Place> places){
        System.out.println("These are the list of places: ");
        System.out.println(places.toString());
    }

    private static void Backward(LinkedList<Place> list) {
        var iterator = list.listIterator();
        while (iterator.hasPrevious()){
            System.out.println(iterator.previous());
        }
    }

    public static void main(String[] args) {
       LinkedList<Place> places = new LinkedList<>();
       Place place1 = new Place("Syndey", 0);
       Place place2 = new Place("Alice Spring", 2771);
       Place place3 = new Place("Brisbane", 917);
       Place place4 = new Place("Darwin", 3972);
       Place place5 = new Place("Melbourne", 877);
       Place place6 = new Place("Perth", 3923);

       addPlace(places, place1);
       addPlace(places, place2);
       addPlace(places, place3);
       addPlace(places, place4);
       addPlace(places, place5);
       addPlace(places, place6);
       addPlace(places, place6);

       Scanner scanner = new Scanner(System.in);
       boolean flag = true;

       while(flag) {
           printOptions();
           String input = scanner.nextLine();
           switch(input.toUpperCase()){
               case "M" -> {
                   System.out.println("Do you wish to Forward, Backward or Print the list: ");
                   String answer = scanner.nextLine();
                   switch (answer.toUpperCase()) {
                       case  "F" -> forward(places);
                       case  "B" -> backward(places);
                       case  "L" -> listOfPlaces(places);
                       default -> System.out.println("Wrong entry,enter any of the options above!");
                   }
               }

               case "Q" -> {
                   System.out.println("Quiting");
                   flag = false;
               }

               default -> flag = false;
           }
       }

    }
}