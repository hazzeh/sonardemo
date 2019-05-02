package sonardemo;


import java.util.ArrayList;

public class Fibonacci {

    public int[] getFib(int count) {
        ArrayList<Integer> result = new ArrayList<>();
        int n1 = 1;
        int n2 = 1;

        for (int i = 0; i < count; i++) {
            result.add(n1);
            int next = n1 + n2;
            n1 = n2;
            n2 = next;
        }

        return result.stream().mapToInt(i -> i).toArray();
    }
}
