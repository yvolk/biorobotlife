package com.yurivolkov.biorobotlife;

/** Console application 
*   for the BiorobotLife quiz
*/
public class Launcher
{
	public static String printed = "";
	
	public static void main(String... args) {
		long months = Long.parseLong(args[0]);
		Life life = new Life();
		life.live(months);
		printed += "Age: " + life.getAge() 
			+ "; Robots: " + life.getCount();
	}
		
}
