import java.util.Scanner;

public class ScanName {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите имя ");
        String String = s.nextLine();
        System.out.println(s);

        System.out.println("Введите фамилию ");
        String String1 = s.nextLine();
        System.out.println(s);

        System.out.println("Введите возраст ");
        int x = s.nextInt();
        System.out.println();
    }

}