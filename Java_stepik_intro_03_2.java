class Main {
	public static void main(String[] args) {
		int age = 23, tasks = 4000;
        if (age > 21 & tasks > 500) {
            System.out.print("Добро пожаловать!");
        }
	}
}

//На вход подаётся строка, а затем - одна буква. Если строка содержит эту букву или строка длиннее 20 символов, выведите "YES", в противном случае - "NO".
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
       
 //
