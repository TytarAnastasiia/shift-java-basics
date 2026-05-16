package homework202;

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

            java.util.ArrayList<Integer> values = new java.util.ArrayList<>();
            if (isReverse) {
                for (int i = start; i >= end; i += step) {
                    values.add(i);
                }
            } else {
                for (int i = start; i <= end; i += step) {
                    values.add(i);
                }
            }

            java.util.ArrayList<String> lines = new java.util.ArrayList<>();

            StringBuilder headerRow = new StringBuilder("     ");
            for (int colVal : values) {
                headerRow.append(String.format("%6d", colVal));
            }
            lines.add(headerRow.toString());

            StringBuilder separatorRow = new StringBuilder("     ");
            for (int i = 0; i < values.size(); i++) {
                separatorRow.append("------");
            }
            lines.add(separatorRow.toString());

            for (int rowVal : values) {
                StringBuilder row = new StringBuilder(String.format("%4d |", rowVal));
                for (int colVal : values) {
                    row.append(String.format("%6d", rowVal * colVal));
                }
                lines.add(row.toString());
            }

            for (String line : lines) {
                fos.write(line.getBytes());
                fos.write(System.lineSeparator().getBytes());
            }

            System.out.println("Таблица умножения сохранена в файл multiplication_table.txt");

        } catch (IOException e) {
            System.out.println("Ошибка при записи в файл: " + e.getMessage());
        }
    }
}