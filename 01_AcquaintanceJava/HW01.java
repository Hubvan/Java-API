// 1) Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n):

import java.util.Scanner;

public class HW01 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in, "cp866");
    System.out.print("Введите число: ");
    int number = sc.nextInt();
    sc.close();

    int count = 0;

    for (int i = 1; i <= number; i++) {
      count += i;
    }

    System.out.printf("Треугольное число числа %s", number);
    System.out.printf(" равно %s", count);
  }
}
