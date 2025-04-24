import java.math.BigDecimal;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Por favor, digite o número da Agência: ");
            String agencia = scanner.next();

            System.out.print("Por favor, digite o número da conta: ");
            int numeroConta = scanner.nextInt();
            scanner.nextLine();
            
            System.out.print("Por favor, digite o nome de usuário: ");
            String nomeCliente = scanner.nextLine();

            System.out.print("Por favor, inserir o saldo da conta: ");
            String saldoString = scanner.next();
            BigDecimal saldo = new BigDecimal(saldoString);

            scanner.close();

            System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", o número da sua conta é " + numeroConta + " e seu saldo de R$ " + saldo + " já está disponível para saque!");


        }
    }
}