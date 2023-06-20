
  /* Дан массив nums = [3,2,4,3,3,1,5,3,3] и число va1 = 3/
   * Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива.
   * Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного,
   * а остальные - равны ему.
   * [2 4 1 5 3 3 3 3 3]   
   * Работать можно только с одним массивом. */

import java.util.Arrays;

public class Zad2 {
  public static void main(String[] args) {
    int[] array = {3, 2, 4, 3, 3, 1, 5, 3, 3 };
    int va1 = 3;
    int counter = 0;
    for (int i = 0; i < array.length; i++) {
      if (array[i] == va1) {
        counter += 1;
      }
    }
    for (int i = 0; i < array.length - counter; i++) {
      if (array[i] == va1) {
        for (int j = i; j < array.length - 1; j++) {
          array[j] = array[j + 1];
        }
        array[array.length - 1] = va1;
        i--;
      }
    }
    System.out.println(Arrays.toString(array));
  }
}
