package com.pack1;

/*	enum Day {
	    MONDAY, 
	    TUESDAY, 
	    WEDNESDAY, 
	    THURSDAY, 
	    FRIDAY, 
	    SATURDAY, 
	    SUNDAY
	}
*/

public class FirstEnum {
    public static void main(String[] args) {
        // Set the current day
        Day today = Day.FRIDAY;

        // Check if it's the weekend
        if (today == Day.SATURDAY || today == Day.SUNDAY) {
            System.out.println("It's the weekend! Time to relax.");
        } else {
            System.out.println("It's a weekday. Back to work!");
        }

        // Print the position of the day (Monday is 0)
        System.out.println(today + " is at index: " + today.ordinal());
    }
}

enum Day {
    MONDAY, 
    TUESDAY, 
    WEDNESDAY, 
    THURSDAY, 
    FRIDAY, 
    SATURDAY, 
    SUNDAY
}
