class Main {
	public static void main(String[] args) {
		int age = 23, tasks = 4000;
        if (age > 21 & tasks > 500) {
            System.out.print("Добро пожаловать!");
        }
	}
}

//На вход подаётся строка, а затем - одна буква. Если строка содержит эту букву или строка длиннее 20 символов, выведите "YES", в противном случае - "NO"./
import java.util.Scanner;
class mySolution{
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String imputLine = sc.nextLine();
       String letter = sc.nextLine();
        if (imputLine.contains(letter) || imputLine.length()>20) {
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
   }
}
       
 //На вход подаются два целых числа.  Выведите на печать true, если их сумма чётна, а произведение - нечётно, и false - в противном случае.
import java.util.Scanner;
class MyProgram {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.print(((x+y) % 2 == 0 && (x*y) % 2 != 0)?"true":"false");
	}
}

//На вход подаются три целых числа. Выведите true, если среди них есть ровно два чётных, и false - если нет.
import java.util.Scanner;
class MyProgram {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(), y = sc.nextInt(), k = sc.nextInt();
        System.out.print((x%2+y%2+k%2==1)?"true":"false");
	}
}

/*Остаток от деления на 2: для четных - 0, для нечетных - 1. По условию, у тебя должно получаться 1, т.к. только одно число нечетное.
остаток от деления нечетного числа на 2 равен 1, от четного = 0. То есть сумма остатков двух четных и одного нечетного чисел всегда равна = 0+0+1 = 1.
Вот это условие и проверяем.*/
