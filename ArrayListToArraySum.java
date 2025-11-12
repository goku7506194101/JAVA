import java.util.ArrayList;

public class ArrayListToArraySum {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        Integer[] array = list.toArray(new Integer[0]);
        int sum = 0;
        System.out.println("Array contents:");
        for (int num : array) {
            System.out.println(num);
            sum += num;
        }
        System.out.println("Sum of numbers: " + sum);
    }
    
}
