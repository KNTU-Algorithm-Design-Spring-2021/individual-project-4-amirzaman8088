import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int []a = {1,5,2,4,2,7,2,4,3};
        Truck []trucks = new Truck[k];
        for (int i = 0; i < k; i++) {
            trucks[i] = new Truck();
        }
        Arrays.sort(a);
        for (int j : a) {
            addItem(j, trucks);
        }
        System.out.println(Arrays.toString(trucks));
    }
    public static void addItem(int weight, Truck[] trucks) {
        Arrays.stream(trucks).
                min((truck, t1) -> (int) (truck.getWeight() - t1.getWeight())).
                ifPresent(truck -> truck.addWeight(weight));
    }
}
