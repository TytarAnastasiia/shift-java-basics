package homework18;

public class AnimalGrowth {
    public static void main(String[] args) {

        double boaLengthCm = 380;

        int parrotsCount = 38;    // 38 попугаев
        int monkeysCount = 5;     // 5 мартышек
        int elephantsCount = 2;   // 2 слонёнка

        double parrotHeightCm = boaLengthCm / parrotsCount;
        double monkeyHeightCm = boaLengthCm / monkeysCount;
        double elephantHeightCm = boaLengthCm / elephantsCount;

        double boaLengthM = boaLengthCm / 100;
        double parrotHeightM = parrotHeightCm / 100;
        double monkeyHeightM = monkeyHeightCm / 100;
        double elephantHeightM = elephantHeightCm / 100;

        double totalHeight = boaLengthM + parrotHeightM + monkeyHeightM + elephantHeightM;

        // вывод результатов
        System.out.printf("Рост удава: %.2f м%n", boaLengthM);
        System.out.printf("Рост попугая: %.2f м%n", parrotHeightM);
        System.out.printf("Рост мартышки: %.2f м%n", monkeyHeightM);
        System.out.printf("Рост слонёнка: %.2f м%n", elephantHeightM);
        System.out.printf("Суммарный рост всех персонажей: %.2f м%n", totalHeight);
    }
}
