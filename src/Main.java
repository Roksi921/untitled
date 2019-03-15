import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //Выбор расчёта арабскими или римскими цифрами
        String c;
        do {
            System.out.println("Enter 1 to calculate in Arabic numerals or 2 to calculate in Roman numerals");
            c = bufferedReader.readLine();
        }while (!c.equals("1") && !c.equals("2"));

        if(c.equals("1")) {
            Arab.arab();
        }else {
            Rome.rome();
        }
    }
}