biorobotlife
============

A solution of a small programming quiz wrapped into Android application. 
It emulates robots reproduction. Each robot starts creating its clone (child) whan it is 2 or months age. It takes 2 months to create the clone. A newborn clone appears to the World as 0 months old. After this the "father" robot immideately starts creating another clone...

Initially the application was developed on an Android device, so it has a wrapper activity showing results.

The same code may be launched as Java console application. 
For Eclipse: Create separate "Runtime configuration" (Run "ConsoleWrapper.java" as "Java Application" and then customize the Runtime Configuration):
- "Main" tab: Set com.yurivolkov.biorobotlife.ConsoleWrapper as a Main class
- "Arguments" tab: Set this argument (for 50 months of life): 50
- "JRE" tab: Select "JavaSE" 1.5 or above as an "Execution environment"
- "Classpath" tab: Remove Android from classpath

Now you may launch the same code both as Android application and as Java console application
