import java.util.Scanner;
public class Test {
    public  static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Hi" + name + "!");
        System.out.println("How high do you want to count?");
        int countLimit = scanner.nextInt();
        System.out.println("counting from 1 to " + countLimit + ":");
        for (int i = 1; i <= countLimit; i++) {
            System.out.println(i);
        }
        scanner.close();
    }
}
