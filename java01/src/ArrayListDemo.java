import com.sun.security.jgss.GSSUtil;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Iterator;

public class ArrayListDemo {

    public static void main(String[] args) {
        ArrayList al1 = new ArrayList();
        al1.add(100);
        al1.add("Dona");
        al1.add("Biswas");
        System.out.println(al1);





        LinkedList l1 = new LinkedList();

        l1.add("Oni");
        l1.add("Shalini");
        l1.add("Ghosh");

        System.out.println(l1);

        String[] array = (String[]) l1.toArray(new String[l1.size()]);

        for (String s : array) {
            System.out.print(s + " ");


        }

    }
}






