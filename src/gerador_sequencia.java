public class gerador_sequencia {
     public static void main(String[] args) {
        int n = 5;
        System.out.println("O resultado da sequência de F(" + n + ") é: " + gerador(n));
    }

    public static int gerador(int n) {
        if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 2;
        } else {
            return 2 * gerador(n-1) + 3 * gerador(n - 2);
        }
    }
}
