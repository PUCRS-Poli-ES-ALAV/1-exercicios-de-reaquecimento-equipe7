public class inversao_string {
    public static void main(String[] args) {
        String str = "Hello, World!";
        String strInvertida = inverterString(str);
        System.out.println("String original: " + str);
        System.out.println("String invertida: " + strInvertida);
    }

    public static String inverterString(String str) {
        if (str.isEmpty()) {
            return str;
        }
        return inverterString(str.substring(1)) + str.charAt(0);
    }
}