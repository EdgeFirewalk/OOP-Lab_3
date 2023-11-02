import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();

        List<Integer> list = new ArrayList<>();
        int size = rand.nextInt(5, 25);

        for (int i = 0; i < size; i++) {
            list.add(rand.nextInt(-10, 10));
        }

        // Print out the initial list
        System.out.println(list);

        bubbleSort(list);

        // Print out sorted list
        System.out.println(list);
    }

    public static void bubbleSort(List<Integer> list) {
        int n = list.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (list.get(j) < list.get(j + 1)) {
                    int temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }
    }

}