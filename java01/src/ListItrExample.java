import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListItrExample {


    public static void main(String[] args) {

        List l = new ArrayList();
        l.add(200);
        l.add("Oni");
        l.add("gh");
        System.out.println(l);

        ListIterator itr = l.listIterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        while (itr.hasPrevious()) {
            System.out.println(itr.previous());
        }
        //l.remove("Oni");
       // System.out.println(l);

        itr.set("1995");
        System.out.println(l);

        itr.add("Biswas");
        System.out.println(l);





    }
}

