package homework202;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileOutputStream;
import java.io.IOException;

public class MultiplicationTableToFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int first = scanner.nextInt();

        System.out.print("Введите второе число: ");
        int second = scanner.nextInt();

        System.out.print("Введите шаг: ");
        int step = scanner.nextInt();

        printMultiplicationTableToFile(first, second, step);

        scanner.close();
    }

    public static void printMultiplicationTableToFile(int start, int end, int step) {

        try (FileOutputStream fos = new FileOutputStream("multiplication_table.txt")) {

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

            StringBuilder result = new StringBuilder();
            result.append("     ");
            for (int colVal : values) {
                result.append(String.format("%6d", colVal));
            }
            result.append(System.lineSeparator());

            result.append("     ");
            for (int i = 0; i < values.size(); i++) {
                result.append("------");
            }
            result.append(System.lineSeparator());

            for (int rowVal : values) {
                result.append(String.format("%4d |", rowVal));
                for (int colVal : values) {
                    result.append(String.format("%6d", rowVal * colVal));
                }
                result.append(System.lineSeparator());
            }

            fos.write(result.toString().getBytes());

            System.out.println("Таблица умножения сохранена в файл multiplication_table.txt");

        } catch (IOException e) {
            System.out.println("Ошибка при записи в файл: " + e.getMessage());
        }
    }
}