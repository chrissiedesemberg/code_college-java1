package Chapter_12;

public class SelfTest {

    enum Tools {
        SCREWDRIVER, WRENCH, HAMMER, PLIERS
    }

    enum TrafficLightColor {
        RED("Red", 12000), GREEN("Green", 10000),YELLOW("Yellow", 2000);

        private final String color;
        private final Integer getDelay;

        TrafficLightColor(String color, Integer delay) {
            this.color = color;
            this.getDelay = delay;
        }

        public String getColor() {
            return color;
        }
        public Integer getDelay() {
            return getDelay;
        }
    }



    public static void main(String[] args) {

//            1. Enumeration constants are said to be selftyped.
//                What does this mean?
        // That they are constants and “self” refers to the enclosing enumeration

//            2. What class do all enumerations automatically inherit?
        //java.lang.Enum

//            3. Given the following enumeration, write a program that uses values( )
//            to show a list of the constants and their ordinal values.
                    //        enum Tools {
                    //            SCREWDRIVER, WRENCH, HAMMER, PLIERS
                    //        }
                    Tools allTools[] = Tools.values();
                    for (Tools t : allTools) {
                        System.out.println(t);}
                        System.out.println();
                        System.out.println();

//            4. The traffic light simulation developed in Try This 121 can be improved with a few
//            simple changes that take advantage of an enumeration’s class features.
//            In the version  shown, the duration of each color was controlled by the
//            TrafficLightSimulator class by hardcoding these values into the run( ) method.
//            Change this so that the duration of each color is stored by the constants in the
//            TrafficLightColor enumeration. To do this, you will need to add a constructor, a
//            private instance variable, and a method called getDelay( ). After making these changes,
//            what improvements do you see? On your own, can you think of other improvements?
//            (Hint: Try using ordinal values to switch light colors rather than relying on a
//            switch statement.)

                        TrafficLightSimulator t1 = new TrafficLightSimulator(TrafficLightColor.GREEN);
                        Thread thrd = new Thread(t1);
                        thrd.start();

                        System.out.println("for loop next:");
                        for (int i = 0; i <= 3; i++) {
                            System.out.println(t1.getColour());
                            t1.waitForChange();
                        }
        System.out.println("Now out of loop");
                        t1.cancel();

//            5. Define boxing and unboxing. How does autoboxing/unboxing affect these actions?
                    //--> The process of encapsulating a value within an object is called boxing
                    // --> The process of extracting a value from a type wrapper is called unboxing.
//            6. Change the following fragment so that it uses autoboxing.
        // Double val = Double.valueOf(123.0);
                Double val = 123.0;
//            7. In your own words, what does static import do?
                    // -->  A static import allows you to use all the static instances and methods
        //          of a class / interface in the class you are importing it to
//            8. What does this statement do?
        // import static java.lang.Integer.parseInt;
                    // -->  You are importing all static methods and members from the Integer class
//            9. Is static import designed for specialcase situations, or is it good practice to bring
//            all static members of all classes into view?
                // --> It is meant for special cases, it will name clash if you import all
        //  10. An annotation is syntactically based on a/an -> interface <--.
//            11. What is a marker annotation?
                // -->Annotations that don’t have parameters.
//            12. An annotation can be applied only to methods. True or False?
                // --> False - any declaration van have an annotation
    }


    static class TrafficLightSimulator implements Runnable {


        private TrafficLightColor tlc;
        private boolean stop = false;
        private boolean changed = false;
        private static int ordinalNumber;

        public static int getOrdinalNumber() {
            return ordinalNumber;
        }

        TrafficLightSimulator(TrafficLightColor init) {
            tlc = init;
        }

        TrafficLightSimulator() {
            tlc = TrafficLightColor.RED;
        }


        @Override
        synchronized public void run() {
            while (!stop) {
                try {
                   Thread.sleep(tlc.getDelay());
                } catch (InterruptedException exc) {
                    System.out.println(exc);
                }
                changeColor();
            }
        }

        synchronized void changeColor() {
            switch(tlc) {
                case RED:
                    tlc = TrafficLightColor.GREEN;
                    break;
                case YELLOW:
                    tlc = TrafficLightColor.RED;
                    break;
                case GREEN:
                    tlc = TrafficLightColor.YELLOW;
                    break;
            }
            changed = true;
            notify();
        }

        synchronized void waitForChange() {
            try{
                while(!changed)
                    wait();
                changed = false;
                System.out.println("Changed now marked as False");
            } catch (InterruptedException ie) {
                System.out.println(ie);
            }
        }
        synchronized TrafficLightColor getColour() {
            return tlc;
        }
        synchronized void cancel() {
            System.out.println("Now cancelling");
            stop = true;
        }


    }






}