import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int conta;
        String ag, cliente;
        double saldo;

        System.out.println("Informe o seu nome: ");
        cliente = sc.next();
        System.out.println("Informe o numero da sua agencia: ");
        ag = sc.next();
        System.out.println("Informe o numero da sua conta ");
        conta = sc.nextInt();
        System.out.println("Informe seu saldo: ");
        saldo = sc.nextDouble();

        System.out.println("Olá " + cliente + " obrigado por abrir sua conta em nosso banco, sua agência é: " + ag
                + " e sua conta é: " + conta
                + ". Seu saldo é: $" + saldo + " e já está disponível para saque.");

    sc.close();
    }
}