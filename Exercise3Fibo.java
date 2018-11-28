public class Exercise3Fibo {

    public static void main(String[] args) {

        int n = 10, p1 = 0, p2 = 1;

        System.out.print("First " + n + " terms: ");

        for (int i = 1; i <= n; ++i) {
            System.out.print(p1 + " + ");

            int sum = p1 + p2;
            p1 = p2;
            p2 = sum;
        }
    }
}
