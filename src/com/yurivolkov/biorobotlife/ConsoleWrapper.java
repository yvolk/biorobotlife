package com.yurivolkov.biorobotlife;

/** 
* Console application for the BiorobotLife quiz
*/
public class ConsoleWrapper
{
    private static final String NEWLINE = "\n";
	public static String printed = "";
    private static long monthsToLive = 0;
	
	public static void main(String[] args) {
	    printed = "";
	    parseArguments(args);
		World world = new World();
		world.live(monthsToLive);
		println("World age: " + world.getWorldAge() 
			+ "; Robots: " + world.getRobotsCount());
	}

    private static void parseArguments(String[] args) {
        if (args != null && args.length > 0) {
            try {
                monthsToLive = Long.parseLong(args[0]);
            } catch (NumberFormatException e) {
                println(e.getMessage());
            }
        } else {
            println("Argument missed: 'Number of months to live'");
        }
    }
		
    private static void println(String message) {
        if (message != null) {
            System.out.println(message);
            printed += message + NEWLINE;
        }
    }
}
