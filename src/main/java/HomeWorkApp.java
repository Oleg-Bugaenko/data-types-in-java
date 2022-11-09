import java.util.Arrays;
import java.util.List;

public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();

        printColor();

        compareNumbers();

        System.out.println(compareValues(10, 15));

        determiningSignNumber(-5);

        System.out.println("Задане число від’ємне? " + findingNegativeNumber(8));

        printingText(3, "Hello");

        System.out.println("Рік є високосним? " + findingLeapYear(2100));
    }


    public static void printThreeWords() {
        System.out.println("Orange\nBanana\nApple");
    }

    public static void printColor() {
        int value = 0;

        if (value <= 0) System.out.println("Червоний");
        if (value > 0 && value <= 100) System.out.println("Жовтий");
        if (value > 100) System.out.println("Зелений");
    }

    public static void compareNumbers() {
        int a = 5; int b = 8;

        if (a >= b) {
            System.out.println("a >= b");
        } else System.out.println("a < b");
    }

    public static boolean compareValues(int a, int b) {
        return ((a+b) >= 10 && (a+b) <= 20);
    }

    public static void determiningSignNumber(int a) {
        System.out.println((a >= 0)? "число додатне": "число від’ємне");
    }

    public static boolean findingNegativeNumber(int a){
        return (a < 0);
    }

    public static void printingText(int number, String text) {
        for (int i = 0; i < number; i++) System.out.println(text);
    }

    public static boolean findingLeapYear(int year) {
        return (year%4 == 0 && ( (year%100 != 0) || (year%400 == 0) ));
    }
}
