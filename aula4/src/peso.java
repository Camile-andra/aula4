import java.util.Scanner;

public class peso {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("lua ou marte? ");
        String planeta = s.nextLine();
        System.out.println("");
        System.out.print("Digite a massa: ");
        double massa = s.nextInt();
        double peso = 0;
        String local = "";

        if(planeta.equals("marte")){
            peso = (massa/9.81)*1.62;
            local = "em marte";
        }else if(planeta.equals("lua")){
            peso = (massa/9.81)*3.71;
            local = "na lua";
        }
        System.out.format("seu peso "+local+" é "+ peso);
    }
}
