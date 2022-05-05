package scheduler;

import java.util.Scanner;

/*
 * Objective: Create a weekly scheduling application.
 * 
 * You may create any additional enums, classes, methods or variables needed
 * to accomplish the requirements below:
 * 
 * - You should use an array filled with enums for the days of the week and each
 *   enum should contain a LinkedList of events that includes a time and what is 
 *   happening at the event.
 * 
 * - The user should be able to to interact with your application through the
 *   console and have the option to add events, view events or remove events by
 *   day.
 *   
 * - Each day's events should be sorted by chronological order.
 *  4
 * - If the user tries to add an event on the same day and time as another event
 *   throw a SchedulingConflictException(created by you) that tells the user
 *   they tried to double book a time slot.
 *   
 * - Make sure any enums or classes you create have properly encapsulated member
 *   variables.
 */
public class Scheduler {

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
    	LinkedList<Enum> event=new LinkedList<Enum>();
    	
    	
    	
    	Monday[] events=new Monday[6];
    	for(int i =0; i<events.length;i++) {
    		if(i==0) {
    		events[i]=Monday.Monday;
    		}
    		if(i==1) {
        		events[i]=Monday.Tuesday;

    		}
    		else	if(i==2) {
        		events[i]=Monday.Wednesday;

    		}
    		else	if(i==3) {
        		events[i]=Monday.Thursday;

    		}
    		else if(i==4) {
        		events[i]=Monday.Friday;

    		}
    	}
    	
    	
    	System.out.print("What do you want to do? Type add to add an event, Type remove to remove an event.");
        String name = scan.next();
        if(name.equalsIgnoreCase("Add")) {
        	System.out.println("Type which day (Weekdays only)");
        	 String day = scan.next();
        	 if(day.equalsIgnoreCase("Monday")) {
        		 System.out.println("What time");
        		 String dime= scan.next();
        		 int time= Integer.parseInt(dime);
        	 }
        }
    	
    }
}
