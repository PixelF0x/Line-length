import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Введите текст:" );
        String quantity = input.next();

        System.out.print("Длина строки "+" - " );
        System.out.println(quantity.length());
    }
}
