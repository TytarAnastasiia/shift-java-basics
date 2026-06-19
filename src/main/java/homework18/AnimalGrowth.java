package homework18;

public class AnimalGrowth {
    public static void main(String[] args) {

        double boaLengthCm = 380;

        int parrotsCount = 38;    // 38 попугаев
        int monkeysCount = 5;     // 5 мартышек
        int elephantsCount = 2;   // 2 слонёнка

        double parrotLengthCm = boaLengthCm / parrotsCount;
        double monkeyLengthCm = boaLengthCm / monkeysCount;
        double elephantLengthCm = boaLengthCm / elephantsCount;

        double boaLengthM = boaLengthCm / 100;
        double parrotLengthM = parrotLengthCm / 100;
        double monkeyLengthM = monkeyLengthCm / 100;
        double elephantLengthM = elephantLengthCm / 100;

        double totalLength = boaLengthM + parrotLengthM + monkeyLengthM + elephantLengthM;

        // вывод результатов
        System.out.printf("Рост удава: %.2f м%n", boaLengthM);
        System.out.printf("Рост попугая: %.2f м%n", parrotLengthM);
        System.out.printf("Рост мартышки: %.2f м%n", monkeyLengthM);
        System.out.printf("Рост слонёнка: %.2f м%n", elephantLengthM);
        System.out.printf("Суммарный рост всех персонажей: %.2f м%n", totalLength);
    }
}
