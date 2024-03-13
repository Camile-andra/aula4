import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        int num1, num2, resto;
        Scanner teclado = new Scanner(System.in);

        num1 = teclado.nextInt();
        num2 = teclado.nextInt();
        resto = num1%num2;

        if(resto == 0){
            System.out.format("O numero %d eh divisivel por %d", num1, num2);
        }else if(resto > 0){
            System.out.println("O numero nao é divisivel");
        }
    }
}
