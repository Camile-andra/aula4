import java.util.Scanner;
public class Nota {
    public static void main(String[] arg){
        Scanner s = new Scanner(System.in);
        System.out.print("Digite a nota do aluno: ");
        float nota = s.nextFloat();
        if (nota>=7){
            System.out.println("parabens, ele passou!!!!!! ebaaaaa");
        }else if(nota>=6 && nota<= 6.9 ){
            System.out.println("Paxou raspando vishhhhhhh, vai ter que melhorar");
        }else{
            System.out.println("aaaa poxa vida vai ter que fazer recuperação");
        }
    }
}
