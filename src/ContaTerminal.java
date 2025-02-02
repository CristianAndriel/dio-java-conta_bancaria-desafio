import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        double saldoDoCliente = 234.20;
        String contaDoCliente = "067-8";

        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, digite o número da Agência:");
        String numeroInput = scanner.nextLine();
        int numero = 0;
        
        try {
            numero = Integer.parseInt(numeroInput);
        } catch (NumberFormatException e) {
            System.out.println("Somente números são permitidos para o campo: Agência.");
            return;
        }
        System.out.println("Por favor, digite o seu nome:");
        String nome = scanner.next();
        System.out.println("Olá " + nome + ". Obrigado por criar uma conta em nosso banco, sua agência é: " + numero
                + ", conta " + contaDoCliente + " e seu saldo dê:  R$ " + saldoDoCliente
                + " já está disponível para saque.");
    }
}