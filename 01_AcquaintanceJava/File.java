import java.util.Scanner;

public class File {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in, charsetName:"cp866");
    System.out.print(s:"Введите имя: ");
    String name = sc.nextLine();

    //.nextLine() --- Считывает строчку
    //.next() --- считывает элемент
    //.nextInt() --- считывает число
    System.out.printf(format:"Привет, %s", name);
    sc.close();
    
  }
}
