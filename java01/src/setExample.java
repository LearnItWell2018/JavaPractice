import java.util.*;

public class setExample {


    public static void main(String[]args){

        HashSet hs = new HashSet();
        hs.add(1995);
        hs.add("Shalini");
        hs.add("Oni");
        hs.add(2012);
        hs.add(2014);
        System.out.println(hs);

        Iterator itr = hs.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());

            ArrayList a = new ArrayList(hs);
            a.add("Ram");
            a.add("Shyam");
            a.add("Jadhu");
            a.add("Madhu");
            System.out.println(a);

           // a.addAll(hs);
           // System.out.println(a);

            TreeSet ts = new TreeSet();
            //ts.add(40);
            //ts.add(60);
            //ts.add(90);
           // ts.add(50);
            ts.add("Akash");
            ts.add("Dodo");
            ts.add("Cannie");
            ts.add("Dona");
            ts.add("Suparno");

            System.out.println(ts);

            Map m= new HashMap();
            m.put(101,"ac");
            m.put(102,"Bc");
            m.put(103,"cc");
            m.put(104,"Dc");
            System.out.println(m);
            System.out.println(m.containsKey(103));
            System.out.println(m.get(104));
            System.out.println(m.size());

            HashMap<Integer,String> hm = new HashMap();
            hm.put(10,"Rani");
            hm.put(11,"Kajal");
            hm.put(12,"Preeti");
            hm.put(13,"Riya");
            System.out.println(hm);

            for (Map.Entry me: hm.entrySet()){
                System.out.println(me.getKey() + " ->"+ me.getValue());

                TreeMap map = new TreeMap();
                map.put(106,"Amit");
                map.put(105, "Sumit");
                map.put(109,"Amal");
                map.put(103,"Kamal");
                System.out.println(map);
                map.ceilingEntry(103);
                System.out.println(map.ceilingEntry(103));
                System.out.println(map.containsKey(105));
                System.out.println(map.get(106));
                System.out.println(map.ceilingKey(106));
                System.out.println(map.firstEntry());
                System.out.println(map.entrySet());
                System.out.println(map.floorEntry(105));
                System.out.println(map.descendingKeySet());

                Hashtable table = new Hashtable();
                table.put(110,"Mon");
                table.put(112,"Tue");
                table.put(114,"Wed");
                table.put(115,"Thurs");
                System.out.println(table);
                System.out.println(table.hashCode());
                System.out.println(table.clone());
               // System.out.println(table.computeIfAbsent());




            }


        }
    }


}
