
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args)  {

        try (Scanner scanner = new Scanner(System.in)) {

        System.out.println("Por favor, digite o número da conta:");
        int numeroConta = scanner.nextInt();

        System.out.println("Por favor, digite o número da agência:");
        String agencia = scanner.next();

        System.out.println("Por favor, digite o nome Cliente:");
        String nomeCliente = scanner.next();

        System.out.println("Por favor, difite o saldo da conta:");
        double saldo = scanner.nextDouble();

        System.out.println(" Ola " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", número da conta " + numeroConta + " e seu daldo " + saldo + " ja está disponível para saque.");


        }
    }
}
