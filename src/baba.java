public class baba {
    public static void main(String[] args) {
        final int a = 5, b = 1;
        for (int x = -a; x <= a; x += 0.01) {
            for (int y = -b; y <= b; y += 0.01) {
                if (x * x + y * y + 3 * x - 3 * Math.sqrt(x * x + y * y) <= 0) {
                    System.out.print("*");
                } else {
                    System.out.print("");
                }
                System.out.println();
            }

        }


    }
}