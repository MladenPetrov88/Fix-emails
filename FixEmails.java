import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FixEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, String> emails = new LinkedHashMap<>();

        while (!"stop".equals(input)) {
            String name = input;
            String email = scanner.nextLine();
            if (!email.contains(name) && email.endsWith(".bg")) {
                emails.put(name, email);
            }


            input = scanner.nextLine();
        }

        for (Map.Entry<String, String> entry : emails.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

    }
}
