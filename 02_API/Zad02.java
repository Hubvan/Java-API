// Напишите метод, который сжимант строку.
// Пример: вход aaaabbbaaaabbbcdd.
// Ответ: a4b3cd2
// stroka = "123"
// stroka = "123"

// 123 == 123 - проверяет ссылки(чисел и чар)

// stroka1.equals(stroka2)

import static java.lang.Thread.sleep;

public class Zad02 {

  public static void main(String[] args) throws InterruptedException {
    long m1 = System.currentTimeMillis();
  

    String strIn = "aaaabbbccrccddfdddm";System.out.println(strIn);
    System.out.println(strIn);

    String strOut = method02_arch(strIn);

    System.out.println(strOut);

    sleep(500);
    long m2 = System.currentTimeMillis();
    System.out.println("время исполнения: " + (m2 - m1 - 500));
  }

  private static String method02_arch(String str1) { // На вход в метод принимается строка
    
    String strRslt = "";
    char curntChr = str1.charAt(0); // Первый символ строки помещаем в curntChr
    int qnt = 1;                    // Помещаем количество букв в qnt

    for (int i = 1; i < str1.length(); i++) { // В цикле пробегаем всю длину строки str1
      if (str1.charAt(i) == curntChr) { // Каждую букву из строки сравниваем с запомненной изначальной
        qnt++;                          // Если они совпадают увеличиваем счётчик на единицу
      } else {                          // В противном случае 
        strRslt += String.valueOf(curntChr) + (qnt > 1 ? qnt : ""); // Как только буква перескачила в результирующую строку 
        //генерируем последовательность : рассматриваемый символ + обрезаем valueOf единицу + количество этих отсчитанных символов
        curntChr = str1.charAt(i); // Переназначаем отслеживаемый символ
        qnt = 1; //Сбрасываем счётчик на единицу
      }
    }
    strRslt += String.valueOf(curntChr) + (qnt > 1 ? qnt : ""); // Добавляем в строку показатели по последнему символу строки

    return strRslt; // Возвращаем результат
  }
}