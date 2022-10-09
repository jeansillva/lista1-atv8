import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Requisito 1: Pergunte quanto ganha por hora e o número de horas tranalhadas.
        Scanner sc = new Scanner(System.in);
        System.out.print("Entre com o seu valor/hora: ");
        int valor_hora = sc.nextInt();
        System.out.println("");
        System.out.print("Entre com a quantidade de horas trabalhadas no mês: ");
        int horas_mes = sc.nextInt();
        sc.close();

        // Requisito 2: Calcular o total do salário
        int salario_mes = valor_hora * horas_mes;
        System.out.print("Seu salário nesse mês será de: " + salario_mes);

    }
}
