package com.yurivolkov.biorobotlife;
import java.util.*;

public class Life
{
	private long age = 0;
	private Set<Robot> robots = new HashSet<Robot>();

	public Life()
	{
		Robot first = new Robot();
		while(first.getAge()<0){
			first.liveOneMonth();
		}
		robots.add(first);
	}

	public long getAge()
	{
		return age;
	}
	
	public long live(long months)
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
			age++;
		}
		return getCount();
	}
	
	public long getCount() {
		return robots.size();
	}
}
