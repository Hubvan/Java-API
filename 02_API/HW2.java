
/**
 * 2) Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой 
 * итерации запишите в лог-файл.
 * 1 3 4 2
 * 1 3 2 4
 * 1 2 3 4
 */
public class HW2 {
    public static void main(String[] args) {
        int[] array = new int[] {9, 1, 3, 8, 2, 0};
        int temp;
        for (int i = array.length-1; i >0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j]>array[j+1]){
                    temp = array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
            for (int j2 = 0; j2 < array.length; j2++) {
                System.out.print(array[j2]);
            }
            System.out.println("\n");
        }
    }
}