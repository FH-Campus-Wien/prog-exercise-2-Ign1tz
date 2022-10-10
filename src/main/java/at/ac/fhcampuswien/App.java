package at.ac.fhcampuswien;

import java.util.Scanner;

public class App {

    //todo Task 1
    public void largestNumber(){
        System.out.print("Number 1: ");
        Scanner scan = new Scanner(System.in);
        float x = scan.nextFloat(), z = 0;
        int count = 1;

        while(x>0){
            count++;
            if(x>z){
                z = x;
            }

            System.out.print("Number " + count + ": ");
            x = scan.nextFloat();
        }
        if(z<=0){
            System.out.println("No number entered.");
        } else {
            System.out.printf("The largest number is %.2f", z);
            System.out.println();
        }
        // input your solution here
    }

    //todo Task 2
    public void stairs(){
        System.out.print("n: ");
        Scanner scan = new Scanner(System.in);
        int b = scan.nextInt(), z = 0, a = 0;

        if(b>0) {
            for (int x = b; x > 0; x--) {
                a++;
                for (int y = 0; y < a; y++) {
                    z++;
                    System.out.print(z + " ");
                }
                //z = 0;
                System.out.println();
            }
        }else {
            System.out.println("Invalid number!");
        }

        // input your solution here
    }

    //todo Task 3
    public void printPyramid(){
        final int KONST = 6;
        int c = 1, x = 0, d = 1, e = 0;

        while(x<KONST) {
            for (int a = 1; a <= d; a++) {
                for (int b = 1; b <= KONST - c; b++) {
                    System.out.print(" ");
                    //System.out.println(b);
                }
                System.out.print("*");
                c = KONST;
            }
            e++;
            x++;
            c = 1+e;
            d = d + 2;
            System.out.println();
        }
        // input your solution here
    }

    //todo Task 4
    public void printRhombus(){
        Scanner scan4 = new Scanner(System.in);
        System.out.print("h: ");
        int h = scan4.nextInt();
        System.out.print("c: ");
        char c = scan4.next().charAt(0);
        int ascii = c;
        int spaces = 1, count = 1, start = 0, d = 1, e = 0;


        while(count < h){

            if(count < h++/2){
                for(int a = h-1; a>0; a--){
                    System.out.print(" ");
                }
                for(int b = 1; b <= d; b++){
                    char out;
                    System.out.print((char)ascii-e);

                }
                e++;
                d = d+2;
            }
            count++;
        }
        /*for(int a = 1; a < h; a++){
            if(a>(h+1)/2){
                for(int d = spaces; d <= (h+1)/2 - e; d++){
                    System.out.print(" ");
                }
                System.out.print(c);
            }
            for(int b = spaces; b > 0; b--){
                System.out.print(" ");
            }
            System.out.println();
        }*/

        // input your solution here
    }

    //todo Task 5
    public void marks(){
        System.out.print("Mark 1: ");
        Scanner scan = new Scanner(System.in);
        int a = 1, neg = 0, count = 0, x = scan.nextInt();
        double sum = 0, avr = 0;

        while(x != 0){
            if(x<0 || x>5){
                System.out.println("Invalid mark!");
            } else {
                if(x == 5){
                    neg++;
                }
                a++;
                count++;
                sum = x + sum;
            }
            System.out.print("Mark " + a + ": ");
            x = scan.nextInt();
        }
        if(count != 0) {
            avr = sum / count;
        }
        System.out.printf("Average: %,.2f", avr);
        System.out.println();
        System.out.println("Negative marks: "+ neg);
        //Math.;
        // input your solution here
    }

    //todo Task 6
    public void happyNumbers(){
        Scanner scan = new Scanner(System.in);
        System.out.print("n: ");
        int x = scan.nextInt(), a,b,c,d = 0, stop = 0 ;

        while(d != 1){
            a = x % 10;
            b = x / 10 % 10;
            c = x / 100;
            d = a * a + b * b + c * c;
            x = d;
            if(d == 4 && stop >= 1) {
                System.out.println("Sad number!");
                d = 1;
            }else if(d == 1 && stop >= 1) {
                System.out.println("Happy number!");
            }
            stop++;
        }
        // input your solution here
    }

    public static void main(String[] args){
        App exercise2 = new App();

        System.out.println("Task 1: Largest Number");
        exercise2.largestNumber();

        System.out.println("\nTask 2: Stairs");
        exercise2.stairs();

        System.out.println("\nTask 3: Pyramide");
        exercise2.printPyramid();

        System.out.println("\nTask 4: Raute");
        exercise2.printRhombus();

        System.out.println("\nTask 5: Notendurchschnitt");
        exercise2.marks();

        System.out.println("\nTask 6: Fröhliche Zahlen");
        exercise2.happyNumbers();
    }
}