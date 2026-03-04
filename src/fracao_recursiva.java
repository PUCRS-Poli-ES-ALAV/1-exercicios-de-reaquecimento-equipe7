public class fracao_recursiva {
    public static void main(String[] args) {
        int n = 5;
        double resultado = calcularFracao(n);
        System.out.println("O resultado da fração é: " + resultado);
    }

    public static double calcularFracao(int n) {
        if (n == 0) {
            return 0;
        } else {
            return (double) 1 / n + calcularFracao(n - 1);
        }
    }
}