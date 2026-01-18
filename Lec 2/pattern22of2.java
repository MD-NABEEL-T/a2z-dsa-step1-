public class pattern22of2{
    public static void main(String[] args) {

        int n = 4;
        int size = 2 * n - 1;

        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {

                for (int layer = 0; layer < n; layer++) {

                    if (i == 1 + layer || i == size - layer ||
                        j == 1 + layer || j == size - layer) {

                        System.out.print((n - layer) + " ");
                        break;
                    }
                }
            }
            System.out.println();
        }
    }
}
