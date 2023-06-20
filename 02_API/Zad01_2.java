public class Zad01_2 {
  public static void main(String[] args) {
    int N = 10000;
    char a = 'a';
    char b = 'b';

    String strOut = method01_strBldr(N, a, b);
    System.out.println(strOut);
  }
  
  private static String method01_strBldr(int N, char a, char b) {
    StringBuilder str1 = new StringBuilder();
    for (int i = 0; i < N/2; i++) {
      str1.append(a).append(b);
    }
    return str1.toString()
  }
}
