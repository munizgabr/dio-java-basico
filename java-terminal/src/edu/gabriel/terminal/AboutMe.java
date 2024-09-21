package edu.gabriel.terminal;
import java.util.Locale;
import java.util.Scanner;
public class AboutMe {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome:");
        String name = scanner.next();
        System.out.println("Digite seu sobrenome:");
        String surname = scanner.next();
        System.out.println("Digite sua idade:");
        int age = scanner.nextInt();
        System.out.println("Digite seu sexo (M/F):");
        String sex = scanner.next();
        System.out.println("Digite sua altura:");
        double height = scanner.nextDouble();
        System.out.println("Digite seu peso:");
        double weight = scanner.nextDouble();
        System.out.println("Digite sua cidade:");
        String city = scanner.next();

        System.out.println("Olá, meu nome é " + name + " " + surname + ", minha idade é " + age + ", sou do sexo " + sex +", minha altura é " + height + "m, peso " + weight + "Kg e moro em " + city);
    }
}
