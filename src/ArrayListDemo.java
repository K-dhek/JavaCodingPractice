import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        System.out.println(list.isEmpty());
        list.add(10);
        list.add(12);
        list.add(13);
        list.add(14);
        list.add(15);


            for (Integer i : list) {
                System.out.println(i);
            }

        System.out.println(list.size());
        System.out.println(list.indexOf(13));
        System.out.println(list.remove(1));
        System.out.println(list);

    }
}
