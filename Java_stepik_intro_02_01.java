//На вход подаётся строка текста, затем слово. Выведите на печать true, если слово содержится в строке, и false - если не содержится.

import java.util.Scanner; //1. Импортируем сканер (import java.util.Scanner;)
class MyProgram {
   public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   String imput = sc.nextLine(); //2. Объявляем 2 переменные строкового типа (  String x = sc.nextLine(); String y = sc.nextLine();)
   String control = sc.nextLine();
   boolean result = imput.contains(control); //3. вводим boolean су которой есть название (Name) и проверяем содержится ли в первой строке вторая ( boolean Name = x.contains(y);)
   System.out.println(result); //4. Выводим boolean на экран (System.out.println(Name);)
   }
}

//На вход подаётся строка. Выведите её на печать сначала строчными, а затем прописными буквами.
import java.util.Scanner;

class MyProgram {
   public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   String line = sc.nextLine();
   System.out.println(line.toLowerCase());
   System.out.println(line.toUpperCase());
   }
}
//На вход подаётся строка, а затем целое число n > 0. Выведите n- й символ с начала строки. 
import java.util.Scanner;

class MyProgram {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String line = sc.nextLine();
       int number = sc.nextInt();
       char letter = line.charAt(--number);
       System.out.print(letter);
      
   }
}

//На вход подаются две строки текста. Выведите на печать true, если строки совпадают, и false - если нет.
import java.util.Scanner;

class MyProgram {
   public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   String firstWord = sc.nextLine();
   String secondWord = sc.nextLine();
       System.out.println(firstWord.equals(secondWord));
   }
}

//На вход подаются две строки. Объедините их в предложение, а на следующей строке выведите общее количество знаков в предложении.
import java.util.Scanner;

class MyProgram {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
       String firstLine = sc.nextLine();
        String secondLine = sc.nextLine();
        String result = firstLine.concat(" ").concat(secondLine);
        int quantity = result.length();
            System.out.println(result+"\n"+quantity);
    }
}
//На вход подаются два числа. Выведите сначала их сумму, а на следующей строке переведите числа в строковый формат и сложите в строковом формате.
import java.util.Scanner;
class MyProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int firstNumber = sc.nextInt();
        int secondNumber  = sc.nextInt();
        int plus = firstNumber + secondNumber;
        String convert = Integer.toString(firstNumber);
        String convertS = Integer.toString(secondNumber);
        System.out.println(plus + "\n" + convert+convertS);

    }
}
