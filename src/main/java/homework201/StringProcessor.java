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

            validateAllowedCharacters(input);

            System.out.print("Введите символ для замены (кроме пробела): ");
            String symbolInput = scanner.nextLine();

            if (symbolInput.isEmpty()) {
                throw new IllegalArgumentException("Ошибка: символ не может быть пустым");
            }

            String symbolForReplace = symbolInput;

            if (symbolForReplace.contains(" ")) {
                throw new IllegalArgumentException("Ошибка: пробел нельзя использовать для замены");
            }

            processString(input, symbolForReplace);

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Произошла непредвиденная ошибка: " + e.getMessage());
        }
    }

    private static void processString(String originalString, String symbolForReplace) {
        String normalizedString = deleteExtraSpaces(originalString);

        String resultString = replaceSymbolWithSpaces(normalizedString, symbolForReplace);

        resultString = deleteExtraSpaces(resultString);

        System.out.println("\nИсходная строка: " + originalString);
        System.out.println("Результат: " + resultString);

        if (resultString.equals(normalizedString)) {
            System.out.println("Сообщение: Строка не изменилась после преобразований");
        }
    }

    private static void validateAllowedCharacters(String str) {
        if (!str.matches("[a-zA-Zа-яА-ЯёЁ.,!?:;\\s]+")) {
            throw new IllegalArgumentException("Ошибка: строка содержит недопустимые символы");
        }
    }

    private static String deleteExtraSpaces(String str) {
        String trimmed = str.trim();
        return trimmed.isEmpty() ? trimmed : trimmed.replaceAll(" +", " ");
    }

    private static String replaceSymbolWithSpaces(String str, String target) {
        return str.replace(target, " ");
    }
}
