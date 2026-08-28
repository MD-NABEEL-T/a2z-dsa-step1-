public class Pattern18 {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 0; i < n; i++) {
            for (char ch = (char)('E' - i); ch <= 'E'; ch++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
}

// REMEMBER for this 
// E-i => result must be an int
// we want a character, so we convert (cast) it back: