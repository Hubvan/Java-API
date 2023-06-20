
/** Дано чётное число N (>0) и символы c1 и c2/
   * Написать метод, который вернет строку длины N, которая
   * состоит из чередующихся символов c1 и c2, начиная с c1.
  */
public class Zad01 {    
    public static void main(String[] args) {
      int number = 40;
      char c1 = 'a';
      char c2 = 'b';
      metod(c1, c2, number);
    }

    public static void metod(char c1, char c2, int number) {
      StringBuilder sb = new StringBuilder(); 
      for (int i = 0; i < number/2; i++) {
        sb.append(c1).append(c2);
      }
      System.out.println(sb);
    }
}
