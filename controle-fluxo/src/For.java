public class For {
    public static void main(String[] args) {
        for(int carneirinho = 1; carneirinho <= 20; carneirinho++){
            System.out.println("O valor de carneirinho é: " + carneirinho);
        }

        //For em arrays
        String alunos [] = {"Gabriel", "Helena", "Lohane"};

        for(int x = 0; x < alunos.length; x++){
            System.out.printf("O aluno na posião %d é: %s \n", x, alunos[x]);
        }
    }
}
