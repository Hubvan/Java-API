// 3) Реализовать простой калькулятор (+-/*):

import java.util.Scanner;

public class HW03 {
  public static void main(String[] args) {
    System.out.println("Введите два числа: ");

    Scanner read = new Scanner(System.in);
    int num1 = read.nextInt();
    int num2 = read.nextInt();
    int result;
    System.out.println("Какое действие выполнить?");
    char action = read.next().charAt(0);
    switch (action) {
      case '+':
        result = num1 + num2;
        break;
      case '-':
        result = num1 - num2;
        break;
      case '*':
        result = num1 * num2;
        break;
      case '/':
        result = num1 / num2;
        break;

      default:
        return;
    }
    System.out.println("Результат: " + result);

  }
}
