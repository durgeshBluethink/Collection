import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.TreeSet;
import java.util.function.Consumer;

public class Traverse_collection {
    public static void main(String[] args) {
        System.out.println("______________________________________________________________________________________________________________________________");

        ArrayList<String> names=new ArrayList<>();
        names.add("Durgesh");
        names.add("Alok");
        names.add("Alok");
        names.add("Sachin");
        names.add("Nissar");
        names.add(2,"Kumar");

        for (String str:names) {
            System.out.print(str +"\t"+str.length()+"\t");
            StringBuffer s= new StringBuffer(str);
            System.out.println(s.reverse());
        }
        System.out.println();
        System.out.println("______________________________________________________________________________________________________________________________");

        // traverse using Iterator: forward  traversal
        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()){
          String next = iterator.next();
          System.out.println(next);
        }

        System.out.println();
        // Backward traversal of collection liSTIterator
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++____________________");
        ListIterator<String> iterator1 = names.listIterator(names.size());
        while (iterator1.hasPrevious()){
            String previous = iterator1.previous();
            System.out.println(previous);

        }
        System.out.println();
        System.out.println("++++++++++++++++++++++++++++++++++FOR EACH METHOD ++++++++++++++++++++++++++++++____________________");
          // for Each method
        names.forEach(e->{
            System.out.println(e);
        });
       // Consumer
        System.out.println();

        System.out.println("++++++++++++++++++++++++++++SORTING OF ELEMENT BY TREESET++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        TreeSet<String> trset = new TreeSet<>();
        trset.addAll(names);
        trset.forEach(str->{
            System.out.println(str);
        });
    }
}
