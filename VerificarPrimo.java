public class VerificarPrimo {

    public static void main(String[] args) {
        testarPrimo(7);
        testarPrimo(10);
        testarPrimo(1);
        testarPrimo(2);
        testarPrimo(17);
        testarPrimo(97); 
        testarPrimo(99); 
    }

    public static void testarPrimo(int numero) {
        if (ehPrimo(numero)) {
            System.out.println(numero + " é um número primo.");
        } else {
            System.out.println(numero + " NÃO é um número primo.");
        }
    }

    public static boolean ehPrimo(int numero) {
        
        if (numero <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(numero); i++) {
            
            if (numero % i == 0) {
                return false;
            }
        }

        return true;
    }
}