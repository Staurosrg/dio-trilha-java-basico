import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        String nomeCliente = "Rogerio Silva";
        int numero = 1021;
        double saldo = 237.48;
        String agencia = "067-8";

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.print("Por favor digite o número da agencia sem o digito: ");
        String numeroAgencia = scanner.next();
          
        System.out.print("Por favor digite o número da conta: ");
        int numeroConta = scanner.nextInt();

            System.out.println("Olá "+ nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "+ agencia +", conta " + numero + " e seu saldo "+saldo+" já esta disponivel para saque");

    }
}


