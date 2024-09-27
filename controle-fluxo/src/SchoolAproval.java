public class SchoolAproval {
    public static void main(String[] args) {
        double grade = 6.5;
        
        // if(grade >= 7){
        //     System.out.println("Você foi aprovado!");
        // }else if(grade >=5 && grade < 7){
        //     System.out.println("Você está de recuperacão");
        // }else{
        //     System.out.println("Você reprovou!");
        // }

        //Operador ternário
        String result = grade >= 7 ? "Aprovado!" : grade >=5 && grade < 7 ? "Recuperacão" : "Reprovado!";
        System.out.println(result);
    }   
}
