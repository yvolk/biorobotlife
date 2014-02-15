
package com.yurivolkov.biorobotlife;

import java.util.*;

public class World {
    private long worldAge = 0;
    private Set<Robot> robots = new HashSet<Robot>();

    public World() {
        // We have one newborn robot at the beginning of the world (worldAge = 0)
        Robot first = new Robot();
        while (first.getAge() < 0) {
            first.liveOneMonth();
        }
        robots.add(first);
    }

    public long getWorldAge() {
        return worldAge;
    }

    public void live(long months) {
        for (long month = 1; month <= months; month++) {
            Set<Robot> robotsNext = new HashSet<Robot>();
            for (Robot robot : robots) {
                Robot newBorn = robot.liveOneMonth();
                robotsNext.add(robot);
                if (newBorn != null) {
                    robotsNext.add(newBorn);
                }
            }
            robots = robotsNext;
            worldAge++;
        }
    }

    public long getRobotsCount() {
        return robots.size();
    }
}
