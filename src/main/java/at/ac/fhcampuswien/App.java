package at.ac.fhcampuswien;

import java.util.Scanner;

public class App {

    //todo Task 1
    public void largestNumber(){
        System.out.print("Number 1: ");
        Scanner scan = new Scanner(System.in);
        float input = scan.nextFloat(), largest_num = 0;
        int count = 1;

        while(input>0){
            count++;
            if(input>largest_num){
                largest_num = input;
            }

            System.out.print("Number " + count + ": ");
            input = scan.nextFloat();
        }
        if(largest_num<=0){
            System.out.println("No number entered.");
        } else {
            System.out.printf("The largest number is %.2f", largest_num);
            System.out.println();
        }
        // input your solution here
    }

    //todo Task 2
    public void stairs(){
        // input your solution here
        System.out.print("n: ");
        Scanner scan = new Scanner(System.in);
        int in = scan.nextInt();
        int out = 1, column = 1;
        if(in > 0) {
            for (int line = in; line > 0; line--) {
                for (int count = 0; count < column; count++){
                    System.out.print(out + " ");
                    out++;
                }
                System.out.println();
                column++;
            }
        }else {
            System.out.println("Invalid number!");
        }
    }

    //todo Task 3
    public void printPyramid(){
        final int KONST = 6;
        int line = 1, count = 0, stars = 1, correcting_line = 0;
        while(count < KONST) {
            for (int num_stars = 1; num_stars <= stars; num_stars++) {
                for (int spaces = 1; spaces <= KONST - line; spaces++) {
                    System.out.print(" ");
                }
                System.out.print("*");
                line = KONST;
            }
            correcting_line++;
            count++;
            line = 1 + correcting_line;
            stars = stars + 2;
            System.out.println();
        }
        // input your solution here
    }

    //todo Task 4
    public void printRhombus(){
        Scanner scan4 = new Scanner(System.in);
        System.out.print("h: ");
        final int NUM_INPUT = scan4.nextInt(), LINE_RESET = 1; //resets linenumber to count down;
        System.out.print("c: ");
        final char CHAR_INPUT = scan4.next().charAt(0);
        int line_count = NUM_INPUT, ascii_shift = 0, line = 0;

        if(NUM_INPUT%2 == 0){
            System.out.println("Invalid number!");
        }else {
            while (0 < line_count) {            //Upper pyramid
                    line_count--;
                for (int spaces = 1; spaces <= line_count / 2; spaces++) {
                    System.out.print(" ");
                }
                asciiShift(CHAR_INPUT, ascii_shift, line); //calls on "asciiShift"
                line++;
                ascii_shift = line;
                line_count--;
                System.out.println();
            }
            line = NUM_INPUT / 2;
            line_count = LINE_RESET;
            for (int spaces = NUM_INPUT / 2; spaces > 0; spaces--) {        //Lower Pyramid
                for (int spacees = 1; spacees <= line_count; spacees++) {
                    System.out.print(" ");
                }
                line--;
                ascii_shift = line;
                asciiShift(CHAR_INPUT, ascii_shift, line); //calls on "asciiShift"
                System.out.println();
                line_count++;
            }
        }
        // input your solution here
    }

    private void asciiShift(char char_input, int ascii_shift, int line) { //prints the rhombus
        int out_ascii;
        for (int temp_ascii_shift_up = line; temp_ascii_shift_up > 0; temp_ascii_shift_up--) { //left half
            out_ascii = (int) char_input - ascii_shift; //caluclates ascii value of input
            System.out.print((char) out_ascii);
            ascii_shift--;
        }
        System.out.print(char_input); //middle column
        ascii_shift++;
        for (int temp_ascii_shift_down = line; temp_ascii_shift_down > 0; temp_ascii_shift_down--) { //right half
            out_ascii = (int) char_input - ascii_shift; //caluclates ascii value of input
            System.out.print((char) out_ascii);
            ascii_shift++;
        }
    }

    //todo Task 5
    public void marks(){
        System.out.print("Mark 1: ");
        Scanner scan = new Scanner(System.in);
        int mark_num = 1, neg = 0, count = 0, mark = scan.nextInt();
        double sum = 0, avr = 0;
        
        while(mark != 0){
            if(mark < 0 || mark > 5){
                System.out.println("Invalid mark!");
            } else {
                if(mark == 5){
                    neg++;
                }
                mark_num++;
                count++;
                sum = mark + sum;
            }
            System.out.print("Mark " + mark_num + ": ");
            mark = scan.nextInt();
        }
        if(count != 0) {
            avr = sum / count;
        }
        System.out.printf("Average: %,.2f", avr);
        System.out.println();
        System.out.println("Negative marks: " + neg);
        //Math.;
        // input your solution here
    }

    //todo Task 6
    public void happyNumbers(){
        Scanner scan = new Scanner(System.in);
        System.out.print("n: ");
        int input = scan.nextInt(), char1,char2,char3,new_num = 0;

        while(new_num != 1){
            char1 = input % 10;
            char2 = input / 10 % 10;
            char3 = input / 100;
            new_num = char1 * char1 + char2 * char2 + char3 * char3;
            input = new_num;
            if(new_num == 4 ) {
                System.out.println("Sad number!");
                new_num = 1;
            }else if(new_num == 1 ) {
                System.out.println("Happy number!");
            }
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