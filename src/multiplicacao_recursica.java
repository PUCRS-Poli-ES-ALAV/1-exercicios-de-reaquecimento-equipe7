public class multiplicacao_recursica {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        int resultado = multiplicacao(a, b);
        System.out.println("O resultado da multiplicação é: " + resultado);
    }

    public static int multiplicacao(int a, int b) {
        if (b == 0) {
            return 0;
        } else {
            return a + multiplicacao(a, b - 1);
        }
    }
}