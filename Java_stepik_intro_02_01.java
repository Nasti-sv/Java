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





