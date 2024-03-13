import java.util.Scanner;

public class Cafe {
    public static void main(String[] args) {
        String senha = "movidoACafe";
        Scanner s = new Scanner(System.in);
        String digitado = s.nextLine();

        if(digitado.equals(senha)){
            System.out.println("acesso permitido!!!!");
        }else{
            System.out.println("acesso negado >:(");
        }
    }
}
