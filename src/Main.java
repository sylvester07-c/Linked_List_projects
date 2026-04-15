import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

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
    public static void main(String[] args) {
        LinkedList<String> placesToVist = new LinkedList<String>();
        addElements(placesToVist);
        printItenary(placesToVist);

        for(int i = 1; i < placesToVist.size(); i++){
            System.out.println("From --> " + placesToVist.get((i - 1)) + " To " + placesToVist.get(i));
        }
        ArrayList<String> list2 = new ArrayList<>();

        placesToVist.add("Kogi");
        placesToVist.add("AkwaIbom");
        printItenary1(placesToVist);
    }
}