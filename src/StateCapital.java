// Part 1: Sorting Arrays

import java.util.Scanner;

public class StateCapital {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 50 states and their capitals stored in a 2D array
        String[][] statesAndCapitals = getData();

        int count = 0;
        // Repeatedly prompts the user to enter the capital of a state
        for (int i = 0; i< statesAndCapitals.length; i++) {
            System.out.println("What is the capital of "
                    + statesAndCapitals[i][0] + "? ");

            String capital = input.nextLine();

            if (isEqual(statesAndCapitals[i][1], capital)) {
                System.out.println("Your answer is correct!");
                count++;
            }

            else {
                System.out.println("WRONG - The correct answer is  " + statesAndCapitals[i][1]);
            }

            // Displays the total score
            System.out.println("\nThe total correct count is " + count);
        }


    }

    /** isEqual returns true if a is equal to c */
    private static boolean isEqual(String c, String a) {
        if (c.length() != a.length())
            return false;

        for (int i = 0; i < c.length(); i++) {
            if (c.charAt(i) != a.charAt(i))
                return false;
        }
        return true;

    }


    /** getData initializes the array with the 50 states and their capitals */
    private static String[][] getData() {
        String[][] d = {
                {"Alabama", "Montgomery"}, {"Alaska", "Juneau"}, {"Arizona", "Phoenix"},
                {"Arkansas", "Little Rock"}, {"California", "Sacramento"},
                {"Colorado", "Denver"}, {"Connecticut", "Hartford"},
                {"Delaware", "Dover"}, {"Florida", "Tallahassee"},
                {"Georgia", "Atlanta"},{"Hawaii", "Honolulu"}, {"Idaho", "Boise"},
                {"Illinois", "Springfield"}, {"Indiana", "Indianapolis"},
                {"Iowa Des", "Moines"}, {"Kansas", "Topeka"}, {"Kentucky","Frankfort"},
                {"Louisiana", "Baton Rouge"}, {"Maine", "Augusta"},
                {"Maryland", "Annapolis"}, {"Massachusetts", "Boston"},
                {"Michigan", "Lansing"}, {"Minnesota", "Saint Paul"},
                {"Mississippi", "Jackson"}, {"Missouri", "Jefferson City"},
                {"Montana", "Helena"}, {"Nebraska", "Lincoln"},
                {"Nevada   ", "Carson City"}, {"New Hampshire", "Concord"},
                {"New Jersey", "Trenton"}, {"New Mexico", "Santa Fe"},
                {"New York", "Albany"}, {"North Carolina", "Raleigh"},
                {"North Dakota", "Bismarck"},{"Ohio", "Columbus"},
                {"Oklahoma", "Oklahoma City"}, {"Oregon", "Salem"},
                {"Pennsylvania", "Harrisburg"}, {"Rhode Island", "Providence"},
                {"South Carolina", "Columbia"}, {"South Dakota", "Pierre"},
                {"Tennessee", "Nashville"}, {"Texas", "Austin"},
                {"Utah", "Salt Lake City"}, {"Vermont", "Montpelier"},
                {"Virginia", "Richmond"}, {"Washington", "Olympia"},
                {"West Virginia", "Charleston"}, {"Wisconsin", "Madison"},
                {"Wyoming", "Cheyenne"}};
        return d;

    }

}