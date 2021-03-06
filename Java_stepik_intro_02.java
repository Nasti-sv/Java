//1. Объявите не-статический метод с названием hello. Этот метод не должен ничего принимать, делать или возвращать.
void hello()

//2.Как вывести текст на печать в Java?
System.out.println()

//3. Напишите программу, которая выводит на печать строку "Welcome to Java!". Используйте метод println.
class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Java!");

    }
}

//4.Заполните пропуски и выведите на печать строку Hello, World!
  class Main {
    public static void main(String[] args) {

    System.out.println("Hello, World!");

    }

}

//5.Как правильно задать однострочный комментарий?
// перед началом комментария

//6. Как правильно оформить комментарий в Java?
/*Поставить // в начале однострочного комментария, конец комментария обозначать не нужно
Поместить комментарий между /* и */
//Поместить комментарий между /** и */

//1. Какой тип переменной нужно использовать, чтобы хранить данные о количестве человек в группе?
int

//2. Доработайте программу так, чтобы она выводила на печать имя, возраст и рост. 
class Man {
    public static void main(String[] args) {
        String name = "Ivan";
        int age = 25;
        double height = 1.85;
        System.out.println(name);
        System.out.println(age);
        System.out.println(height);
    }
}

//3.Присвойте переменной myVar значение 3.1415 и выведите на печать.
class Main {
    public static void main(String[] args) {
        double myVar = 3.1415;
        System.out.print(myVar);
  }
}

//4.Напишите программу, выводящую на печать фразу "Я программирую на Java" (без кавычек).
class Main {
    public static void main(String[] args) {
        System.out.println("Я программирую на Java");      
    }
}

/*5.Напишите программу, которая присваивает трем переменным значения 100, 200 и 300.
Выведите на печать значения переменных в столбик, а затем в строку через пробел.*/
class Main {
    public static void main(String[] args) {
        int y = 100, r = 200, t = 300;
        System.out.print(y+"\n"+r+"\n"+t+"\n");
        System.out.println(y+" "+r+" "+t);
    }
}
    
/6.*Создайте четыре переменных разного типа и выведите их на печать, каждое на новой строке. Присвойте переменным значения:
1)  202
2)  3.1415
3)  Java
4) 5  < 10
Выведите значения переменных столбиком в этом же порядке.*/
class Main {
    public static void main(String[] args) {
        int y = 2021;
        double t = 3.1415;
        String j = "Java";
        boolean a = true;
    System.out.println(y+"\n"+t+"\n"+j+"\n"+a);
    }
}

/*7.Доработайте программу так, чтобы она считывала строку, а затем выводила эту же строку на печать.
Примечание. В этой задаче, как и в большинстве других, есть скрытые тесты с другими значениями ввода. Код не должен быть привязан к конкретным данным.*/
import java.util.Scanner;

class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        System.out.println(st);

   }
}

//useful link for next task https://javarush.ru/groups/posts/klass-scanner
//Напишите программу, которая считывает имя пользователя и затем приветствует его.
    import java.util.Scanner;

class MySolution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        System.out.println("Привет,"+" "+st);
    }
}

//Напишите программу, которая считывает строку, а затем выводит эту же строку на печать 3 раза в столбик.
import java.util.Scanner;

    class MySolution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        System.out.println(st);
        System.out.println(st);
        System.out.println(st);
        
    }
}

//Напишите программу, которая считывает строку, а затем выводит эту же строку на печать 2 раза в первой строке через пробел, а затем ещё два раза в столбик.
import java.util.Scanner;

class MySolution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        System.out.println(st+" "+st);
        System.out.println(st);
        System.out.println(st);
    }
}

/*Напишите программу, которая считывает целое число t - температуру воздуха, и выводит фразу:
Температура воздуха сегодня: t градусов.*/
import java.util.Scanner;

class MySolution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int st = sc.nextInt();
        System.out.println("Температура воздуха сегодня:"+" "+st+" "+"градусов.");
    }
}
//Напишите программу, которая принимает три числа - год, месяц и день и выводит на печать фразу:DD:MM:YYYY.
import java.util.Scanner;

class MySolution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String y = sc.nextLine();
        String m = sc.nextLine();
        String d = sc.nextLine();
        System.out.println(d+":"+m+":"+y);
    }
}
//last
import java.util.Scanner;

class MyProgram {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String name = sc.nextLine();
    String helper = sc.nextLine();
    String number = sc.nextLine();
    System.out.println("Привет,"+" "+name+","+" "+"это твой помощник"+" "+helper+"."+"\n"+"У тебя"+" "+number+" "+"новых писем.");
    }
}

//Закончите программу таким образом, чтобы она выводила на печать целое число 5. Переменную можно назвать myVar
class MyNumber {
    public static void main(String[] args) {
        int myVar = 5;
        System.out.print(myVar);
   }
}

//Завершите программу, которая выводит на печать сумму чисел 2 и 4. Переменную вывода можно назвать myVar.
class MyNumber {
    public static void main(String[] args) {
        int x = 2; int y = 4;
        int myVar = x + y;
        System.out.print(myVar);
   }
}
//Напишите программу, которая получает два целых числа и выводит их сумму.
import java.util.Scanner;

class MyNumber {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int numberFirst = sc.nextInt();
    int numberSecond = sc.nextInt();
    System.out.println(numberFirst+numberSecond);
   }
}

//На вход подаются два положительных действительных числа - стороны прямоугольника. Посчитайте его площадь и периметр и выведите на отдельных строках.
import java.util.Scanner;

class MyNumber {
    public static void main(String[] args) {
     Scanner sc= new Scanner(System.in);
     double a = sc.nextDouble();
     double b = sc.nextDouble();
     double s = a*b;
     double p = (a+b)*2;
     System.out.println(s+"\n"+p);
        
     
   }
}

/*На вход подаётся число x  Посчитайте значение функции \large y = 5x^{2} + 2x + 11y=5x 
  и выведите на печать.*/
import java.util.Scanner;

class MyNumber {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double x = sc.nextDouble();
    System.out.println((5*(x*x))+(2*x)+11);
   }
}

//На вход подаётся целое число n. Выведите в одной строке через пробел само число, его квадрат и куб.
import java.util.Scanner;

class MyNumber {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    System.out.println(x+" "+(x*x)+" "+(x*x*x));
    }
}
//На вход подаётся три числа. Выведите на одной строке их среднее арифметическое.
import java.util.Scanner;

class MyNumber {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double a = sc.nextDouble();
    double b = sc.nextDouble();
    double c = sc.nextDouble();
    System.out.println((a+b+c)/3);
   }
}

//Завершите программу таким образом, чтобы она выводила на печать остаток от деления 41 на 7. Переменную вывода можно назвать myVar.
class MyNumber {
    public static void main(String[] args) {
        int x = 41; int y = 7;
        int myVar = x%y;
        System.out.print(myVar);
   }
}

//На вход подаётся целое число. Найдите его последнюю цифру.
import java.util.Scanner;

class MyNumber {
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int number = sc.nextInt();
    int myVar = Math.abs(number) % 10;
        System.out.print(myVar);
   }
}

/*ООО "Круче Гугла" нанимает Java-разработчиков. Месячный бюджет на зарплату разработчиков - X, зарплата одного разработчика - Y. Выведите на печать 
в одной строке через пробел, какое максимальное количество
разработчиков компания сможет нанять, и какое количество денег из ежемесячного бюджета останется неиспользованным.*/

import java.util.Scanner;

class MyNumber {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int salary = sc.nextInt();
    int quantity = sc.nextInt();
    int employees = salary/quantity;
    int rest = salary%quantity;
        System.out.println(employees+" "+rest);

   }
}

//Реализуйте простые домашние часы. 
import java.util.Scanner;

class MyNumber {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
     int days = x % 86400;
        int h = days/3600;
        int m = (days % 3600)/60;
        int s = days - (h*3600) - (m*60);
       
        System.out.format("%02d"+":"+"%02d"+":"+"%02d",h,m,s);
   }
}

//Измените программу таким образом, чтобы она выводила на печать число 11.
class myNumber {
    public static void main(String[] args) {
        int x = 10;
        System.out.println(++x);
   }
}

//We have task/ What will be the answer?
class MyNumber {
    public static void main(String[] args) {
        int x = 1, y = 5, z = 0;
        --y;
        x = 4 + y++;
        z += x--;
        x = y + z;      
        System.out.print(++x);
   }
}
/*1) y = 4
2)х = 4+4=8 (только после того, как мы переходим к следующей строчке, "y" увеличивается на 1)
3)z= 8+0=8 (+= это будет так z= z+x) (и после того как мы переходим к следующей строчке, "х" уменьшается на 1)
4)x=5+8=13 (у=5 из-за 2 строчки) 
5) ++х сразу прибавляем +1 и выводится ваш ответ = 14*/

//На вход подаётся натуральное число n. Выведите на печать числа n - 1, n, n + 1 в одну строку, через пробел (см. образец).
import java.util.Scanner;

class MyNumber {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int u = sc.nextInt();
    int g = --u;
    int l = ++u;
    int k = ++u;
System.out.println(g+" "+l+" "+k);
    }
}

//На вход подаётся строка. Выведите её длину.
import java.util.Scanner;

class MyProgram {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String u = sc.nextLine();
    int x = u.length();
    System.out.println(x); 
   }
}

/*На вход подаётся строка текста. Выведите её первый и последний элемент в одну строку через пробел.
Оставлю ссылку в которой есть прекрасный пример того, как определить  последний символ в строке 
http://study-java.ru/uroki-java/rabota-so-strokami-v-java-osnovnye-metody-klassa-string/ */

import java.util.Scanner; //1.импортируем сканер.
class MyProgram {
   public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   String imput = sc.nextLine(); //2.создаем ввод строки.
   char letter_0 = imput.charAt(0); //3.получаем элемент строки по его индексу charAt();
   int last = imput.length()-1; //4.узнаем длину строки(т.к. она может быть длиннее чем в примере) через str.length();
   char letter_last = imput.charAt(last); //5.получаем элемент строки по индексу ссылаясь на length();
   System.out.println(letter_0+" "+letter_last); //6.выводим.
   }
}


