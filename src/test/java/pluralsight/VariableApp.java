package pluralsight;

public class VariableApp {
    public static void main(String[] args) {
        // Declare variables
        String favoriteColor = "Black";
        int classStartYear = 2025;
        char middleInitial = 'G';
        boolean hasPets = false;
        String message = "Keep learning and growing!";

        // Print each variable with descriptive message
        System.out.println("My favorite color is: " + favoriteColor);
        System.out.println("The year I started this class is: " + classStartYear);
        System.out.println("My middle initial is: " + middleInitial);
        System.out.println("Do I have pets? " + (hasPets ? "Yes" : "No"));
        System.out.println("Here is a nice message: " + message);


        // Step 2
        int daysInWeek = 7;
        double coffeePrice = 4.99;
        char favoriteLetter = 'M';
        boolean isRaining = false;

        System.out.println("Step 2 Answers:");
        System.out.println("There are " + daysInWeek + " days in a week.");
        System.out.println("The price of coffee is $" + coffeePrice + ".");
        System.out.println("My favorite letter is '" + favoriteLetter + "'.");
        System.out.println("Is it raining? " + (isRaining ? "Yes, it is." : "No, it isn’t."));


    }
}
