public class NumerosImpares {
    public static void main(String[] args) {
        int numero = 1;
        while (numero <= 21) {
            if (numero % 2 != 0) {
                System.out.println(numero);
            }
            numero++;
        }
    }
}