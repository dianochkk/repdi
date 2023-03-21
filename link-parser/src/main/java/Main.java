import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LinkParser parser = new GitHubParser();
        parser.setNext(new StackOverflow());

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Ссылка: ");
            String url = scanner.nextLine();

            if (url.isEmpty()) {
                break;
            }

            String result = parser.parse(url);
            if (result != null) {
                System.out.println("Вывод: " + result);
            } else {
                System.out.println("Введенная ссылка не соответствует формату");
            }
        }
    }
}