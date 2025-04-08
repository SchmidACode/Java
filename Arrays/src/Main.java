import java.util.*;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random(0);
        Scanner kb = new Scanner(System.in);
        /*System.out.print("Введите размер массива: ");
        int n = 5;  //kb.nextInt();

        int[] arr = new int[n];
        for(int i=0; i<arr.length; i++)
        {
            arr[i] = rand.nextInt(0,100);
        }
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i] + "\t");
        }

        System.out.println();
        System.out.println("Сумма элементов массива: " + IntStream.of(arr).sum());
        System.out.println("Среднее арифметическое:  " + IntStream.of(arr).average().getAsDouble());
        System.out.println("Минимальное значение:    " + IntStream.of(arr).min().getAsInt());
        System.out.println("Максимальное значение:   " + IntStream.of(arr).max().getAsInt());

        arr = IntStream.of(arr).sorted().toArray();
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i] + "\t");
        }
        */
        /*sort(T[] a, Comparator<? super T> c);
        Arrays.sort(arr, Collections.reverseOrder());
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i] + "\t");
        }*/

        System.out.print("Введите количество строк: ");
        int rows = 3;//kb.nextInt();
        System.out.println("Введите количество столбцов: ");
        int cols = 4;//kb.nextInt();
        int[][] arr = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = rand.nextInt(100);
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
//        System.out.println("Сумма элементов массива: " + IntStream.of(arr.).sum());
//        System.out.println(Arrays.toString(Arrays.stream(arr).flatMapToInt(Arrays::stream).toArray()));
        int[] flatten = Arrays.stream(arr)
                .flatMapToInt(Arrays::stream)
                .toArray();
        System.out.println("Сумма элементов массива: " + IntStream.of(flatten).sum());
        System.out.println("Среднее-арифметическое : " + IntStream.of(flatten).average().getAsDouble());
        System.out.println("Минимальное значение :   " + IntStream.of(flatten).min().getAsInt());
        System.out.println("Максимальное значение:   " + IntStream.of(flatten).max().getAsInt());

        //Arrays.sort(arr, Comparator.comparingInt(a -> a[0]));
        Arrays.sort(arr, (a,b)->a[0]-b[0]);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}