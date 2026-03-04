public class CalculadoraRecursiva {

    public static void main(String[] args) {
        int num1 = 3;
        int num2 = 2;
        
        int resultado = somar(num1, num2);
        System.out.println("Resultado de " + num1 + " + " + num2 + " = " + resultado);
    }

    public static int somar(int a, int b) {
        if (b == 0) {
            return a;
        }
        
        return somar(a + 1, b - 1);
    }
}