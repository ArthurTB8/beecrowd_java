import java.io.IOException;
import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) throws IOException {
    	Scanner entrada = new Scanner(System.in);
    	while (true) {
        	int N = entrada.nextInt();
        	int M = entrada.nextInt();
        	int troco = M - N;
        	int[] notas = {2, 5, 10, 20, 50, 100};
        	boolean possivel = false;
        	
        	if (N == 0 && M == 0) break;
        	
    		for (int i = 0; i < 6; i++) {
    			for (int j = 0; j < 6; j++) {
    				if (troco - notas[j] == notas[i]) possivel = true;
    			}
    		}
    		
    		if (possivel) System.out.println("possible");
    		else System.out.println("impossible");
    	}
    }
	
}
