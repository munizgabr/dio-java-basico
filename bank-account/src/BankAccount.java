import java.util.Scanner;
import java.util.Locale;

public class BankAccount {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Olá, seja muito bem-vindo ao Banco Muniz. Vamos abrir sua conta? Inicie digitando como gostaria de ser chamado(a):");
        String nickname = scan.next();
        
        System.out.println("Certo, " + nickname + ", agora digite o número da conta:");
        int account = scan.nextInt();
        
        System.out.println("Agência:");
        String agency = scan.next();
        
        scan.nextLine();  // Limpa o buffer de entrada
        System.out.println("Agora preciso do seu nome completo, como no seu documento de identificação:");
        String clientName = scan.nextLine();
        
        System.out.println("Qual o saldo inicial?");
        double balance = scan.nextDouble();

        // Saída final formatada com duas casas decimais para o saldo
        System.out.printf("Olá %s, ou melhor, %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.%n", clientName, nickname, agency, account, balance);
    }
}
