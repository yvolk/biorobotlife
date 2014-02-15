
package com.yurivolkov.biorobotlife;

import java.util.concurrent.atomic.*;

public class Robot
{
    private static AtomicLong nextId = new AtomicLong();

    private long id;

    private long age = -2;
    private Robot child = null;

    public Robot()
    {
        this.id = nextId.getAndIncrement();
    }

    public long getId() {
        return id;
    }

    public long getAge()
    {
        return age;
    }

    public Robot liveOneMonth() {
        age++;
        Robot newBorn = null;
        if (child != null) {
            child.liveOneMonth();
            if (child.age >= 0) {
                newBorn = child;
                child = null;
            }
        }
        if (age > 1) {
            if (child == null) {
                child = new Robot();
            }
        }
        return newBorn;
    }
}
