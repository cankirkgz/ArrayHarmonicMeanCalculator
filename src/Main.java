public class Main {
    public static void main(String[] args) {
        int[] list = {15, 6, 8, 12, 7, 9, 3};
        double sum = 0;
        double result;

        for (int j : list) {
            sum += 1.0 / j;
        }

        result = list.length / sum;
        System.out.println("Harmonik ortalama: " + result);
    }
}
