//Part 2: Sorting & Searching HashMap
import java.util.Scanner;
import java.util.Map;
import java.util.TreeMap;
import java.util.HashMap;


public class StateCapitals {

    public static void main(String[] args)
    {
        // creates a HashMap to store the state names and capitals
        Map<String, String> state_capitals = new HashMap<String, String>();
        // populates the HashMap
        state_capitals.put("Alabama", "Montgomery");
        state_capitals.put("Alaska", "Juneau");
        state_capitals.put("Arizona", "Phoenix");
        state_capitals.put("Arkansas", "Little Rock");
        state_capitals.put("California", "Sacramento");
        state_capitals.put("Colorado", "Denver");
        state_capitals.put("Connecticut", "Hartford");
        state_capitals.put("Delaware", "Dover");
        state_capitals.put("Florida", "Tallahassee");
        state_capitals.put("Georgia", "Atlanta");
        state_capitals.put("Hawaii", "Honolulu");
        state_capitals.put("Idaho", "Boise");
        state_capitals.put("Illinois", "Springfield");
        state_capitals.put("Indiana", "Indianapolis");
        state_capitals.put("Iowa", "Des Moines");
        state_capitals.put("Kansas", "Topeka");
        state_capitals.put("Kentucky", "Frankfort");
        state_capitals.put("Louisiana", "Baton Rouge");
        state_capitals.put("Maine", "Augusta");
        state_capitals.put("Maryland", "Annapolis");
        state_capitals.put("Massachusetts", "Boston");
        state_capitals.put("Michigan", "Lansing");
        state_capitals.put("Minnesota", "Saint Paul");
        state_capitals.put("Mississippi", "Jackson");
        state_capitals.put("Missouri", "Jefferson City");
        state_capitals.put("Montana", "Helena");
        state_capitals.put("Nebraska", "Lincoln");
        state_capitals.put("Nevada", "Carson City");
        state_capitals.put("New Hampshire", "Concord");
        state_capitals.put("New Jersey", "Trenton");
        state_capitals.put("New Mexico", "Santa Fe");
        state_capitals.put("New York", "Albany");
        state_capitals.put("North Carolina", "Raleigh");
        state_capitals.put("North Dakota", "Bismarck");
        state_capitals.put("Ohio", "Columbus");
        state_capitals.put("Oklahoma", "Oklahoma City");
        state_capitals.put("Oregon", "Salem");
        state_capitals.put("Pennsylvania", "Harrisburg");
        state_capitals.put("Rhode Island", "Providence");
        state_capitals.put("South Carolina", "Columbia");
        state_capitals.put("South Dakota", "Pierre");
        state_capitals.put("Tennessee", "Nashville");
        state_capitals.put("Texas", "Austin");
        state_capitals.put("Utah", "Salt Lake City");
        state_capitals.put("Vermont", "Montpelier");
        state_capitals.put("Virginia", "Richmond");
        state_capitals.put("Washington", "Olympia");
        state_capitals.put("West Virginia", "Charleston");
        state_capitals.put("Wisconsin", "Madison");
        state_capitals.put("Wyoming", "Cheyenne");

        // displays the contents of the HashMap
        System.out.printf("%-30s%30s\n","State","Capital");
        for(String state : state_capitals.keySet())
            System.out.printf("%-30s%30s\n",state,state_capitals.get(state));

        // creates a new map using tree map method to sort the entries of the HashMap
        Map<String,String> state_capitals_sorted = new TreeMap<String, String>();
        // loops to populate the tree map
        for(String state : state_capitals.keySet())
            state_capitals_sorted.put(state, state_capitals.get(state));


        String state;
        Scanner console = new Scanner(System.in);
        // input the state to search
        System.out.print("\nEnter state to search: ");
        state = console.nextLine();

        // checks that the tree map contains the state, then displays the capital of the state. Else displays error message
        if(state_capitals_sorted.containsKey(state))
            System.out.println("Capital of "+state+" is "+state_capitals_sorted.get(state));
        else
            System.out.println("Invalid state: "+state);
    }
}
