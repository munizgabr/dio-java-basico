import java.util.Scanner;;

public class MeasureSystem {
    public static void main(String[] args) {
        System.out.println("Digite uma medida (P, M o G):");
        Scanner scanner = new Scanner(System.in);
        String measure = scanner.next().toUpperCase();
        
        switch (measure) {
            case "P":
                System.out.println("Você selecionou a medida - PEQUENO");
                break;
            case "M":
                System.out.println("Você selecionou a medida - MÉDIO");
            case "G":
                System.out.println("Você selecionou a medida - Grande");
            default:
                System.out.println("Medida inválida");
                break;
        }
    }
}
