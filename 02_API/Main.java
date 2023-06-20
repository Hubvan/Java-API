public class Main {
  /** Работа со StrinfBuilder */
  public static void main(String[] args) {
    String stroka = "djkbkjlbnf";
    StringBuilder sb = new StringBuilder();
    sb.append('a');
    sb.append(stroka).append("S");
    System.out.println(sb.toString());
  }
}