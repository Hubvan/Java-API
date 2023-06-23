/**
   * 1) Дана строка sql-запроса "select * from students WHERE ". Сформируйте часть
   * WHERE
   * этого запроса, используя StringBuilder. Данные для фильтрации приведены ниже
   * в виде json-строки.
   * Если значение null, то параметр не должен попадать в запрос.
   * Пример данной строки {"name":"Ivanov", "country":"Russia", "city":"Moscow",
   * "age":"null"}
   * Вывод: select * from students WHERE name=Ivanov AND country=Russia AND
   * city=Moscow
   */
import java.util.Scanner;

public class HW1 {
  
  public static void main(String[] args) {
    String opening = "select * from students WHERE";
    Scanner iScanner = new Scanner(System.in);
    System.out.printf("Введите строку: ");
    String a = iScanner.nextLine();
    a = a.substring(1, (a.length() - 1));
    iScanner.close();
    String[] firstArr = a.split(",");
    String[] finalarr = new String[firstArr.length];
    for (int i = 0; i < firstArr.length; i++) {
      finalarr[i] = firstArr[i].replace(':', '=').replace('"', ' ');
    }
    for (int i = 0; i < finalarr.length; i++) {
      boolean end = finalarr[i].endsWith("null ");
      if (end == true) {
        continue;
      }
      if (i == 0) {
        System.out.print(opening);
      }
      if (i != 0) {
        System.out.print("AND");
      }
      System.out.print(finalarr[i]);
    }
  }
}
