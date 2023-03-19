import java.util.Scanner;
import Taks1.*;
import Task2.*;
import Task3.*;
public class Main {
    static void Task1() {
        Place[] places = new Place[4];
        places[0] = new Place("Some place", 100000);
        places[1] = new Region("Kyivskyi", "Kyiv", 234000);
        places[2] = new City("London", 89999992, 30);
        places[3] = new Megapolis("Tokyo", 1323232, 23, 19);
        System.out.println("-------------------");
        System.out.println("Test inheritance :");
        System.out.println("-------------------");
        for (Place place : places) {
            place.Show();
            System.out.println("-------------------");
        }
    }

    static void Task2() {
        Body[] bodies = new Body[4];
        bodies[0] = new Parallelepiped(2.0, 3.0, 4.0);
        bodies[1] = new Ball(10.0);
        bodies[2] = new Parallelepiped(2.0, 3.0, 4.0);
        bodies[3] = new Ball(5.0);
        System.out.println("-------------------");
        System.out.println("Test abstract class:");
        System.out.println("-------------------");
        System.out.println(bodies[0]);
        System.out.println("Parallelepiped Area : " + bodies[0].area());
        System.out.println("Parallelepiped Volume : " + bodies[0].volume());
        System.out.println("-------------------");
        System.out.println(bodies[1]);
        System.out.println("Ball Area : " + bodies[1].volume());
        System.out.println("Ball Volume : " + bodies[1].area());
        System.out.println("-------------------");
        if(bodies[0].equals(bodies[2])){
            System.out.println("Parallelepiped's equals");
        }
        else System.out.println("Parallelepiped's not equals");
        if(bodies[1].equals(bodies[3])){
            System.out.println("Balls equals");
        }
        else System.out.println("Balls not equals");
    }
    static void Task3(){
        BodyT[] bodies = new BodyT[4];
        bodies[0] = new ParallelepipedT(4.0, 5.0, 6.0);
        bodies[1] = new BallT(8.0);
        bodies[2] = new ParallelepipedT(3.0, 4.0, 5.0);
        bodies[3] = new BallT(8.0);
        System.out.println("-------------------");
        System.out.println("Test interface:");
        System.out.println("-------------------");
        System.out.println(bodies[0]);
        System.out.println("Parallelepiped Area : " + bodies[0].area());
        System.out.println("Parallelepiped Volume : " + bodies[0].volume());
        System.out.println("-------------------");
        System.out.println(bodies[1]);
        System.out.println("Ball Area : " + bodies[1].volume());
        System.out.println("Ball Volume : " + bodies[1].area());
        System.out.println("-------------------");
        if(bodies[0].equals(bodies[2])){
            System.out.println("Parallelepiped's equals");
        }
        else System.out.println("Parallelepiped's not equals");
        if(bodies[1].equals(bodies[3])){
            System.out.println("Balls equals");
        }
        else System.out.println("Balls not equals");
    }
    static void printMenu() {
        System.out.println("|--------------------------|");
        System.out.println("|           MENU           |");
        System.out.println("|--------------------------|");
        System.out.println("| Options:                 |");
        System.out.println("|        1. Task1          |");
        System.out.println("|        2. Task2          |");
        System.out.println("|        3. Task3          |");
        System.out.println("|        4. Exit           |");
        System.out.println("|--------------------------|");
    }

    public static void main(String[] args) {
        System.out.println(" Lab 3");
        Scanner in = new Scanner(System.in);
        int ch = 1;
        while (ch != 5) {
            printMenu();
            System.out.print("Select option:");
            ch = in.nextInt();
            switch (ch) {
                case 1 : Task1(); break;
                case 2 : Task2(); break;
                case 3 : Task3(); break;
                case 4 : return;
            }
        }
    }
}
