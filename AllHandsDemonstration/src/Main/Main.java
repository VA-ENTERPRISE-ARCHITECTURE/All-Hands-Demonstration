package Main;

import java.util.Random;

/*

 * This is just a test class. 

 * The main function will be executed when the Java

 * program is executed either through the client or

 * through the compiled JAR file 

 * The purpose of this class is to show the functionality

 * of Git and GitHub. 

 */


public class Main {

        

        static private String print = "Hello World"; 

        

        public static void main(String[] args) {

                doWork(); 

        }       

        

        private static void doWork() {

                System.out.println("Starting work...");

                Random randomNum = new Random(); 

                int times = randomNum.nextInt(25) + 1; 

                printLine(times); 

        }

        

        private static void printLine(int times) {

                for(int x = 0; x < times; x++) {

                        System.out.println(print + ": " + times);

                }

        }

}

