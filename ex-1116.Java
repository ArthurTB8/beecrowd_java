import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n = teclado.nextInt();
        for (int i = 0; i < n; i++) {
            int x = teclado.nextInt();
            int y = teclado.nextInt();
           
            if (y == 0) {
                System.out.println("divisao impossivel");
            } else {
                double divisao = (double) x / y;
                System.out.printf("%.1f\n", divisao);
            }
        }
       
    }
}
