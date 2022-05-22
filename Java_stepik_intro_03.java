//Исправьте ошибки в коде таким образом, чтобы код выводил на печать слово "YES" (без кавычек), если значение переменной х равно 5.
class Example {
	public static void main(String[] args) {
		int x = 5;
        if (x == 5) {
            System.out.println("YES");
        }

        }	
}
/*Два индийских программиста, Махатма и Джавахарлал, решили выяснить, кто из них быстрее пишет код. Напишите программу, которая поможет им выяснить это.
На вход подаются два целых числа в одной строке через пробел. Если первое число больше второго, необходимо вывести на печать "Махатма", если второе - 
"Джавахарлал". Гарантируется, что числа больше нуля и различны.*/
import java.util.Scanner;
class MyProg {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int firstNumber = sc.nextInt();
        int secondNumber = sc.nextInt();
        if (firstNumber > secondNumber) {
            System.out.println("Махатма");
            }else{
            System.out.println("Джавахарлал");
        }
	}
}
/*Два индийских программиста, Махатма и Джавахарлал, решили выяснить, чей код длиннее. Напишите программу, которая поможет им выяснить это. 
На вход подаются две строки текста. Если первая строка длиннее второй, необходимо вывести на печать "Махатма", если наоборот - "Джавахарлал".
Гарантируется, что строки имеют разную длину.*/
import java.util.Scanner;
class MyProg {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
            String a = sc.nextLine();
            int x = a.length();
            String b = sc.nextLine();
            int h = b.length();
        if  (x > h) {
            System.out.println("Махатма");
        }else{
            System.out.println("Джавахарлал");
        }
	}
}

/*На первой строке подаётся пароль, хранящийся в базе данных, на второй - пароль, введённый пользователем.
Выведите на печать фразу "Access is granted", если пользователь ввёл верный пароль, и "Access is denied" - если нет. */
import java.util.Scanner;
class MyProg {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String databasePassword = sc.next();
        String password = sc.next();
               if (databasePassword.equals(password)) {
                   System.out.println("Access is granted");
               }else{
                   System.out.println("Access is denied");
               }
	}
}
//Выведите на печать наибольшее из трёх целых чисел.
import java.util.Scanner;
class MyProg {
	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a>b){
            System.out.println(a);
        }else if (b>c) {
            System.out.println(b);
        }else{
            System.out.println(c);
        }
	}
}
/* В 1997 году во время боксёрского боя за звание чемпиона мира Майк Тайсон откусил ухо Эвандеру Холифилду (не целиком). 
Рефери нужно определить, как поступить. Если откушенный кусок уха меньше норматива, бой продолжится.
Если нет - Майк Тайсон должен быть дисквалифицирован, и чемпионом становится Холифилд.
На вход подаются два числа -  масса откушенного куска уха и норматив. Выведите "Бой продолжается!" или "Холифилд - чемпион!" в зависимости от выполнения условия.*/
import java.util.Scanner;
class MyProg {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
            double piece = sc.nextDouble();
            double rule = sc.nextDouble();
        if (piece<rule) {
            System.out.println("Бой продолжается!");
        }else{
            System.out.println("Холифилд - чемпион!");
        }
        
	}
}
//На вход подаётся целое число n. Выведите "YES", если можно построить правильный многогранник из правильных плоских n-угольников, в противном случае - "NO".
import java.util.Scanner;
class MyProg {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number>=3 && number<=5){
        System.out.println("YES");
        }else{
        System.out.println("NO");
        }
	}
}
