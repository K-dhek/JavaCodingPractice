import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(12);
        list.add(13);
        list.add(14);
        list.add(15);

        if(list.contains(10)){
            for (int i : list) {
                System.out.println(i);

            }
        }
    }
}
