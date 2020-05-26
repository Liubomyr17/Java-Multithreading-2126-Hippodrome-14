package com.company;

/*

2113 Hippodrome 14
Add a winner definition.
In the Hippodrome class, we will do two methods:
public Horse getWinner () and public void printWinner ()
The getWinner method should return the horse that has run the longest distance.
The printWinner method displays the name of the winner in the form: Winner is <name>!
Example:
Winner is Lucky!

Requirements:
1. In the Hippodrome class, the getWinner method must be created without parameters.
2. In the Hippodrome class, the printWinner method must be created without parameters.
3. The getWinner method should return the horse that has run the greatest distance.
4. The printWinner method should display the name of the winner on the screen in the format specified in the task condition.
Rosvyazok
Hippodrome (14)
We launch and admire.
Every half second, a new frame is displayed with the situation at the racetrack.
Use the mouse to reduce the size of the console so that only one “frame” is visible and in the same place.
Then you can watch the race live and even comment:
- Start.
- Homer unexpectedly bypasses Lucky.
- Slevin rushes forward.
- Go Lucky!
- 10 bucks on Slevin.
- Looks like Lucky dropped the jockey and relaxed.
- Homer confidently rushing forward.
- Unexpectedly for all, Homer wins. This is the number!

Requirements:
1. Relax and have fun.



 */

import java.util.ArrayList;
import java.util.List;

public class Hippodrome {
    public static Hippodrome game;
    private List<Horse> horses;

    public List<Horse> getHorses() {
        return this.horses;
    }

    public Hippodrome(List<Horse> horses) {
        this.horses = horses;
    }

    public static void main(String[] args) {
        Horse horse1 = new Horse("me", 3, 0);
        Horse horse2 = new Horse("myself", 3, 0);
        Horse horse3 = new Horse("i", 3, 0);
        List<Horse> horses = new ArrayList<Horse>();
        horses.add(horse1);
        horses.add(horse2);
        horses.add(horse3);
        game = new Hippodrome(horses);
        // hyppodrome 11
        game.run();
        }

        public void move() {
        horses.forEach(Horse::move);
        }

        public void print() {
        for (Horse horse : this.horses) {
            horse.print();
        }
        for (int i=0; i<10; i++) {
            System.out.println();
        }
        }
        
        public void run() {
        for (int i=0; i<100; i++) {
            this.move();
            this.print();
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        }
    public Horse getWinner(){
        double maxDistance = 0.0;
        for (Horse horse : this.horses){
            if (horse.getDistance()>maxDistance){
                maxDistance = horse.getDistance();
            }
        }
        Horse horse = null;
        for (Horse hors : this.horses){
            if (hors.getDistance()==maxDistance){
                horse = hors;
                break;
            }

        }
        return horse;
    }

    public void printWinner(){
        Horse horse = getWinner();
        System.out.println("Winner is " + horse.getName() + "!");
    }

}

