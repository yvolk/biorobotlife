
package com.yurivolkov.biorobotlife;

import java.util.concurrent.atomic.*;

public class Robot {
    private static final int REPRODUCTIVE_AGE = 2;
    private static final int MONTHS_TO_BUILD_CLONE = 2;

    private static AtomicLong nextId = new AtomicLong(1);

    private long id;
    private long age = - MONTHS_TO_BUILD_CLONE;
    private Robot child = null;

    public Robot() {
        this.id = nextId.getAndIncrement();
    }

    public long getId() {
        return id;
    }

    public long getAge() {
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
        if (age >= REPRODUCTIVE_AGE) {
            if (child == null) {
                child = new Robot();
            }
        }
        return newBorn;
    }
}
