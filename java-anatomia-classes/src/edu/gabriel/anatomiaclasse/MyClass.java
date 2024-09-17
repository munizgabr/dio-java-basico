package edu.gabriel.anatomiaclasse;
public class MyClass {
    public static void main(String[] args) {
        //Usin types
        // String myName = "Gabriel Muniz";
        // int age = 26;
        // double height = 1.80;
        // boolean isMarried = true;

        String name = "Gabriel";
        String surname = "Muniz";

        String fullName = fullName(name, surname);

        System.out.println(fullName);
    }
    //Methods
    public static String fullName(String name, String surname){
        return "Method result -> " + name.concat(" ").concat(surname);
    }
}
