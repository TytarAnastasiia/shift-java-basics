package homework19;

import java.util.ArrayList;
import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int first = scanner.nextInt();

        System.out.print("Введите второе число: ");
        int second = scanner.nextInt();

        System.out.print("Введите шаг: ");
        int step = scanner.nextInt();

        printMultiplicationTable(first, second, step);

        scanner.close();
    }

    public static void printMultiplicationTable(int start, int end, int step) {

        boolean isReverse = start > end;

        ArrayList<Integer> values = new ArrayList<>();
        if (isReverse) {
            for (int i = start; i >= end; i += step) {
                values.add(i);
            }
        } else {
            for (int i = start; i <= end; i += step) {
                values.add(i);
            }
        }

        System.out.print("      ");
        for (int colVal : values) {
            System.out.printf("%6d", colVal);
        }
        System.out.println();

        System.out.print("      ");
        for (int i = 0; i < values.size(); i++) {
            System.out.print("------");
        }
        System.out.println();

        for (int rowVal : values) {
            System.out.printf("%4d |", rowVal);
            for (int colVal : values) {
                System.out.printf("%6d", rowVal * colVal);
            }
            System.out.println();
        }
    }
}
