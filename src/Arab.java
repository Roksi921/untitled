import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Arab {
     static void arab() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //Ввод первого числа
        System.out.println("Enter the first number");
        int s = Integer.parseInt(bufferedReader.readLine());
        //Ввод операции
        String c;
        do {
            System.out.println("Choose operation: " + "* " + "/ " + "+ " + "- ");
            c = bufferedReader.readLine();
        }while (!c.equals("*") && !c.equals("/") && !c.equals("+") && !c.equals("-"));
        //Ввод второго числа
        System.out.println("Enter the second number");
        int s1 = Integer.parseInt(bufferedReader.readLine());

        //Расчёт
        if (c.equals("*")) {
            System.out.println("result" + " " + (s * s1));
        }
        if (c.equals("/")) {
            System.out.println("result" + " " + (s / s1));
        }
        if (c.equals("+")) {
            System.out.println("result" + " " + (s + s1));
        }
        if (c.equals("-")) {
            System.out.println("result" + " " + (s - s1));
        }
    }
}
