import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
public class SpeedTest {
    public static void main(String[] args) {
        long start;
        long size = 1000000;
        List<Integer>  alist = new ArrayList<>();
        LinkedList<Integer> llist = new LinkedList<>();
        for (int i = 0; i < size; i++) {
            alist.add(i); llist.add(i);
        }
        start = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            int number = alist.get((int)(Math.random()*size));
        }
        System.out.println("ArrayList get: " + (System.currentTimeMillis()-
                start));
        start = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            int number = llist.get((int)(Math.random()*size));
        }
        System.out.println("LinkedList get: " + (System.currentTimeMillis()-
                start));
        start = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            alist.remove(0);
        }
        System.out.println("ArrayList remove: " + (System.currentTimeMillis()-
                start));
        start = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            llist.remove(0);
        }
        System.out.println("LinkedList remove: " + (System.currentTimeMillis()-
                start));
    }

}