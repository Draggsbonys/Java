package Algorithm;
import java.util.ArrayList;
import java.util.List;

public class Binary {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        for (int i = 0; i <= 1024; i++) {
            integerList.add(i);
        }
        System.out.println(integerList.size());
        System.out.println(binarySearch(integerList, 10));
    }

    /*
     * В этом примере мы ищем элемент в отсортированном массиве, используя метод бинарного поиска.
     * Начинаем с того, что устанавливаем левую и правую границы поиска, равные 0 и длине массива минус один соответственно.
     * Затем мы продолжаем делить отрезок поиска пополам до тех пор, пока не найдем искомый элемент или не определим, что элемента в массиве нет.
     */
    public static int binarySearch(List<Integer> list, int target) {
        int left = 0;
        int right = list.size() - 1;

        while (left <= right) {
            int middle = (left + right) / 2;

            if (list.get(middle) == target) {
                return middle;
            } else if (list.get(middle) < target) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        return -1; // элемент не найден
    }
}
