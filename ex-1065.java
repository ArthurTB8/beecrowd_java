import java.io.IOException;
import java.util.Scanner;

public class Main {


        public static void main(String[] args) throws IOException {
            Scanner leitor = new Scanner(System.in);
            int a;
            int cont = 0;
            for (int i = 0; i < 5; i++) {
                a = leitor.nextInt();
                if (a % 2 == 0 ) cont++;
            }
            System.out.println(cont + " valores pares");
        }

    }

