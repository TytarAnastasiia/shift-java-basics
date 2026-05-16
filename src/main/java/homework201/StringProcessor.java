package homework201;

import java.util.Scanner;

public class StringProcessor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Введите строку: ");
            String input = scanner.nextLine();

            if (input.length() <= 1) {
                throw new IllegalArgumentException("Ошибка: строка должна быть ненулевой и неединичной длины");
            }

            System.out.print("Введите символ для замены (кроме пробела): ");
            String symbolInput = scanner.nextLine();

            if (symbolInput.isEmpty()) {
                throw new IllegalArgumentException("Ошибка: символ не может быть пустым");
            }

            char searchChar = symbolInput.charAt(0);

            if (searchChar == ' ') {
                throw new IllegalArgumentException("Ошибка: пробел нельзя использовать для замены");
            }

            processString(input, searchChar);

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Произошла непредвиденная ошибка: " + e.getMessage());
        }
    }

    private static void processString(String originalString, char searchChar) {
        try {
            String normalizedString = normalizeSpaces(originalString);

            String resultString = replaceCharWithSpaces(normalizedString, searchChar);

            resultString = normalizeSpaces(resultString);

            System.out.println("\nИсходная строка: " + originalString);
            System.out.println("Результат: " + resultString);

            if (resultString.equals(normalizedString)) {
                System.out.println("Сообщение: Строка не изменилась после преобразований");
            }

        } catch (NullPointerException e) {
            System.out.println("Ошибка: строка не может быть пустой");
        }
    }

    private static String normalizeSpaces(String str) {
        if (str == null) {
            throw new NullPointerException("Строка не может быть пустой");
        }
        String trimmed = str.trim();
        return trimmed.isEmpty() ? "" : trimmed.replaceAll("\\s+", " ");
    }

    private static String replaceCharWithSpaces(String str, char target) {
        if (str == null) {
            throw new NullPointerException("Строка не может быть пустой");
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if (currentChar == target) {
                result.append(' ');
            } else {
                result.append(currentChar);
            }
        }
        return result.toString();
    }
}
