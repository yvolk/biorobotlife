package com.yurivolkov.biorobotlife;
import java.util.*;

public class World
{
	private long worldAge = 0;
	private Set<Robot> robots = new HashSet<Robot>();

	public World()
	{
	    // One newborn robot at the beginning (worldAge = 0) 
		Robot first = new Robot();
		while(first.getAge()<0){
			first.liveOneMonth();
		}
		robots.add(first);
	}

	public long getWorldAge()
	{
		return worldAge;
	}
	
	public void live(long months)
	{
		for (long month = 1; month <= months; month++){
			Set<Robot> robots2 = new HashSet<Robot>();
			for(Robot robot : robots) {
				Robot newBorn = robot.liveOneMonth();
				robots2.add(robot);
				if (newBorn != null ) {
					robots2.add(newBorn);
				}
			}
			robots = robots2;
			worldAge++;
		}
	}
	
	public long getRobotsCount() {
		return robots.size();
	}
}
