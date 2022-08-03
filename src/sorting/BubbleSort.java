package sorting;

public class BubbleSort {

    public static void main(String[] args) {

        int[] array = {3, 1, 9, 5, 4};

       sort(array);
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) { // перший відповідає за кількість проходів по масиву
            for (int j = array.length - 1; j > i; j--) { // перебір елементів у кожному проході по масиву
                if(array[j - 1] > array[j]) {
                    int temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
        }

        System.out.println(array);
    }
}
