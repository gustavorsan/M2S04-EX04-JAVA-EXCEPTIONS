import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       int idade = 0;
       Scanner scanner = new Scanner(System.in);



       try {
           System.out.println("Digite a idade");
           idade = scanner.nextInt();
           if (idade < 1){
               throw new Exception("Idade invalida");
           }
           System.out.println("Olá, você tem "+idade+" anos de idade!");
       }catch (Exception ex){
           System.out.println(ex.getMessage());
       }


    }
}