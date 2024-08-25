import java.util.*;

public class Example {


    public static void main(String[] args) {


        Vector v = new Vector();

        v.add("1988");
        v.add("Suparno");
        v.add(5.7);
        v.addElement("Ravi");
        v.setElementAt("Dona", 3);
        System.out.println(v);

        System.out.println(v);
        System.out.println(v.lastElement());
        System.out.println(v.removeElement("Ravi"));
        System.out.println(v.capacity());

        Enumeration e = v.elements();
        while (e.hasMoreElements()) {
            System.out.println(e.nextElement());

            String name = "Shalini1";


            LinkedList l1 = new LinkedList(v);
            l1.add(0, name);
            l1.add(1, "Suparno");
            l1.add(2, 1995);
            l1.add(3, 1988);
            System.out.println(l1);
            System.out.println(l1.get(3));
            System.out.println(l1.indexOf("Shalini1"));
            l1.addLast(200);

            System.out.println(l1);


            Stack s = new Stack();
            s.push("Habra");
            s.push("Barasat");
            s.push("Naihati");
            s.push("Bira");
            System.out.println(s);
            System.out.println(s.peek());
            System.out.println(s);

            ArrayList ar = new ArrayList();
            int a = 0;
            int b = 1;

            ar.add(a);
            ar.add(b);
            System.out.println(ar);

            for (int i = 2; i <= 8; i++) {


            }
            System.out.print(ar);


        }

    }
}

