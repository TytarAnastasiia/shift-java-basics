package homework18;

public class LogicalOperationTable {
    public static void main(String[] args) {

        System.out.printf("%-8s %-8s %-10s %-10s %-10s %-8s%n",
                "P", "Q", "P AND Q", "P OR Q", "P XOR Q", "NOT P");

        // строки таблицы
        System.out.printf("%-8s %-8s %-10s %-10s %-10s %-8s%n",
                false, false, (false && false), (false || false), (false ^ false), (!false));

        System.out.printf("%-8s %-8s %-10s %-10s %-10s %-8s%n",
                true, false, (true && false), (true || false), (true ^ false), (!true));

        System.out.printf("%-8s %-8s %-10s %-10s %-10s %-8s%n",
                false, true, (false && true), (false || true), (false ^ true), (!false));

        System.out.printf("%-8s %-8s %-10s %-10s %-10s %-8s%n",
                true, true, (true && true), (true || true), (true ^ true), (!true));
    }
}