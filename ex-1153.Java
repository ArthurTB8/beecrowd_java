import java.io.IOException;
import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) throws IOException {
        Scanner entrada = new Scanner(System.in);
        int N = entrada.nextInt();
        int fat = 1;
        for (int i = 1; i <= N; i++) {
        	fat *= i;
        }
        System.out.println(fat);
    }
	
}
