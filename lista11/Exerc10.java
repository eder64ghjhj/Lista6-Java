package lista11;

public class Exerc10 {
	  public static void main(String[] args) {
	        int contadorPrimos = 0;

	        for (int num = 2; num <= 100; num++) {
	            if (ehPrimo(num)) {
	                contadorPrimos++;
	            }
	        }

	        System.out.println("Quantidade de números primos entre 1 e 100: " + contadorPrimos);
	    }

	   
	    public static boolean ehPrimo(int n) {
	        if (n <= 1) return false;
	    
	        int limite = (int) Math.sqrt(n);
	        for (int i = 2; i <= limite; i++) {
	            if (n % i == 0) return false;
	        }
	        return true;
	    }
}
