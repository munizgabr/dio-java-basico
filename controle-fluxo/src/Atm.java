import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {
        double balance = 1000.50;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saldo:"+balance);
        System.out.println("Digite o valor do saque:");
        double amount = scanner.nextDouble();
        if(amount < balance){
            balance = balance - amount;
            System.out.println("Saque realizado com sucesso! Novo saldo:"+balance);
        }else{
            System.out.println("Saldo insuficiente");
        }

    }    
}
