public class soma_recursiva {

    public static void main(String[] args) {
        int num1 = 33;
        int num2 = 22;
        
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