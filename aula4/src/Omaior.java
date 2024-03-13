import java.util.Scanner;

public class Omaior {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Digite o primeiro numero: ");
        int num1 = s.nextInt();

        System.out.print("Digite o segundo numero: ");
        int num2 = s.nextInt();

        System.out.print("Digite o terceiro numero: ");
        int num3 = s.nextInt();

        String maior = "";
        int maiorV = 0;

        if (num1> num2 && num1>num3){
            maior = "o Primeiro numero é maior que os outros";
            maiorV = num1;
        }else if (num2> num1 && num2>num3){
            maior = "o segundo numero é maior que os outros";
            maiorV = num2;
        }else if (num3> num1 && num3>num2){
            maior = "o terceiro numero é maior que os outros";
            maiorV = num3;
        }
        System.out.println(maior);
        System.out.println(maiorV);
    }
}
