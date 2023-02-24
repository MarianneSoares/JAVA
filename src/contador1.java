import java.util.Scanner;

public class contador1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor de inicio: ");
        int cont = sc.nextInt();

        System.out.println("Digite o valor final: ");
        int fim = sc.nextInt();

        while(cont<=fim){
            System.out.println(cont);

            ++cont;
        }
    }
}
