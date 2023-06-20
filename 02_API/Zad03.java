// Напишите метод, который сжимант строку.
// Пример: вход aaaabbbaaaabbbcdd.
// Ответ: a4b3cd2
// stroka = "123"
// stroka = "123"

// 123 == 123 - проверяет ссылки(чисел и чар)

// stroka1.equals(stroka2)

public class Zad03 {
  private static String StrComposer(String str) {
    String stroka = "";
    char c = str.charAt(0);
    Integer count = 1;
    for (int i = 1; i < str.length(); i++) {
      if (str.charAt(i) == c) {
        count ++;
      }
      else {
        stroka +=  "" + c + count;
        c = str.charAt(i);
        count = 1;
      }
    }
    return stroka + c + count;
  }
  public static void main(String[] args) {
    String stroka = "aaaabbbaaaabbbcdd";
    String newStroka = StrComposer(stroka);
    System.out.println(newStroka);
  }
}
