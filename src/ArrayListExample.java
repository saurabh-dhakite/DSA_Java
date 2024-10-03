import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(10);

        list.add(34);
        list.add(34);
        list.add(3423);
        list.add(34);
        list.add(34);
        list.add(34);
        list.add(34);
        list.add(34);

        System.out.println(list);
        list.set(2, 90);
        System.out.println(list);

    }
}
