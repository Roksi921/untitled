import java.io.*;

public class Rome {
     public  static void rome() throws IOException{
         BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
         //Ввод первого числа
         System.out.println("Enter the first number");
         String q = bufferedReader.readLine();
         //Ввод операции
        String c;
         do {
             System.out.println("Choose operation: " + "* " + "/ " + "+ " + "- ");
             c = bufferedReader.readLine();
         }while (!c.equals("*") && !c.equals("/") && !c.equals("+") && !c.equals("-"));
         //Ввод второго числа
         System.out.println("Enter the second number");
         String q1 = bufferedReader.readLine();
         //Расчёт
         if (c.equals("*")) {
             System.out.println("result" + " " + toRome(parseInt(q) * parseInt1(q1)));
         }
         if (c.equals("/")) {
             System.out.println("result" + " " + toRome(parseInt(q) / parseInt1(q1)));
         }
         if (c.equals("+")) {
             System.out.println("result" + " " + toRome(parseInt(q) + parseInt1(q1)));
         }
         if (c.equals("-")) {
             System.out.println("result" + " " + toRome(parseInt(q) - parseInt1(q1)));
         }
    }
    //Перевод результата из арабских цифр в римские
    public static String toRome(int n) {
        String[] Rome = {  "C", "XC", "L",  "X", "IX", "V", "I" };
        int[] arab = {  100,  90,  50,   10,    9,   5,   1 };
        String finalRome = "";

        for (int i = 0; i < arab.length; i ++) {
            int currentNum = n /arab[i];
            if (currentNum==0) {
                continue;
            }

            for (int j = 0; j < currentNum; j++) {
                finalRome +=Rome[i];
            }

            n = n%arab[i];
        }
        return finalRome;
    }
    //Преобразование первого числа
    public static int parseInt(String w) {
        int s = 1;

        if (w.equals("I")) {
            s = Integer.parseInt("1");
        }
        if (w.equals("II")) {
            s = Integer.parseInt("2");
        }
        if (w.equals("III")) {
            s = Integer.parseInt("3");
        }
        if (w.equals("IV")) {
            s = Integer.parseInt("4");
        }
        if (w.equals("V")) {
            s = Integer.parseInt("5");
        }
        if (w.equals("VI")) {
            s = Integer.parseInt("6");
        }
        if (w.equals("VII")) {
            s = Integer.parseInt("7");
        }
        if (w.equals("VIII")) {
            s = Integer.parseInt("8");
        }
        if (w.equals("IX")) {
            s = Integer.parseInt("9");
        }
        if (w.equals("X")) {
            s = Integer.parseInt("10");
        }
        return s;
    }
    //Преобразование второго числа
    public static int parseInt1(String q1) {
        int s = 1;

        if (q1.equals("I")) {
            s = Integer.parseInt("1");
        }
        if (q1.equals("II")) {
            s = Integer.parseInt("2");
        }
        if (q1.equals("III")) {
            s = Integer.parseInt("3");
        }
        if (q1.equals("IV")) {
            s = Integer.parseInt("4");
        }
        if (q1.equals("V")) {
            s = Integer.parseInt("5");
        }
        if (q1.equals("VI")) {
            s = Integer.parseInt("6");
        }
        if (q1.equals("VII")) {
            s = Integer.parseInt("7");
        }
        if (q1.equals("VIII")) {
            s = Integer.parseInt("8");
        }
        if (q1.equals("IX")) {
            s = Integer.parseInt("9");
        }
        if (q1.equals("X")) {
            s = Integer.parseInt("10");
        }
        return s;
    }
}
