import java.util.Scanner;

public class Produto {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("digite o nome do produto: ");
        String nome = s.nextLine();

        System.out.print("digite valor: ");
        double valor = s.nextDouble();

        double newValor = 0;
        String desconto = "";

        // tabela
        if(valor>=50 && valor<200){
             newValor = valor-(valor*0.05);
             desconto = "5%";
        }else if(valor>=200 && valor<=500){
             newValor = valor-(valor*0.06);
             desconto = "6%";
        }else if(valor>=500 && valor<=1000){
            newValor = valor-(valor*0.07);
            desconto = "7%";
        }else if(valor>=1000){
             newValor = valor-(valor*0.08);
             desconto = "8%";
        }else if(valor<=0){
            System.out.println("O valor é invalido");
            desconto = "0%";
        }
        System.out.print("o item "+ nome +" custando "+ valor);
        System.out.println(" teve o desconto de "+desconto+ " passou a ser " + newValor);
    }   
}
