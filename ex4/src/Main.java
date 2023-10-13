import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        MyStack<String> stack = new MyStack<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите пять строк:");

        for (int i = 0; i < 5; i++) {
            String input = scanner.nextLine();
            stack.push(input);
        }

        System.out.println("Строки в обратном порядке:");

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}