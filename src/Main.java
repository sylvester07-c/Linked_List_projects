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

        System.out.println(list);
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
        }
    }

    private static void printOptions(){
        System.out.println("""
                
               Available actions (select word or letter):
               (M)enu
                   (F)orward
                   (B)ackward
                   (L)ist
               (Q)uit    
                """);
    }

    private static void forward(LinkedList<Place> list) {

    }

    public static void main(String[] args) {
//        LinkedList<String> placesToVist = new LinkedList<String>();
//        addElements(placesToVist);
//        printItenary(placesToVist);
//
//        for(int i = 1; i < placesToVist.size(); i++){
//            System.out.println("From --> " + placesToVist.get((i - 1)) + " To " + placesToVist.get(i));
//        }
//        ArrayList<String> list2 = new ArrayList<>();
//
//        placesToVist.add("Kogi");
//        placesToVist.add("AkwaIbom");
//        printItenary1(placesToVist);

        LinkedList<Place> placesDistance = new LinkedList<Place>();
        Place place1 = new Place("Syndey", 0);
        Place place2 = new Place("Alice Spring", 2771);
        Place place3 = new Place("Brisbane", 917);
        Place place4 = new Place("Darwin", 3972);
        Place place5 = new Place("Melbourne", 877);
        Place place6 = new Place("Perth", 3923);
        placesDistance.add(place1);
        placesDistance.add(place2);
        placesDistance.add(place3);
        placesDistance.add(place4);
        placesDistance.add(place5);
        placesDistance.add(place6);

        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        while(flag) {
            printOptions();
            String input = scanner.nextLine();
            switch (input.toUpperCase()) {
                case "M" -> {
                    System.out.println("Do you wish to Forward, Backward or PrintList");
                    String input1 = scanner.nextLine();
                    switch (input1) {
                        case "F" ->
                    }
                }
            }
        }

    }
}