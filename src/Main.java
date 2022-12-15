import java.util.*;

public class Main {
    public static void main(String[] args) {

        // create collection and
        // 1st type is safe type of collection
        System.out.println("______________________________________________________________________________________________________________________________");

        ArrayList<String>names=new ArrayList<>();
        names.add("durgesh");
        names.add("alok");
        names.add("alok");
        names.add("Sachin");
        names.add("Nissar");
        names.add(2,"kumar");

//        names.add(837246);
        System.out.println("Names: "+names);
        System.out.println(names.get(0));
        System.out.println(names.get(1));

        for (String s : Arrays.asList(" Names: " + names.isEmpty(), "Size: " + names.size(),"Add new variable: " + names.set(1,"ram  "), "Size: " + names.remove(4),"Size: " + names.size(), "Names: " + names)) {
            System.out.print(s+" ");
        }
        System.out.println();
        System.out.println("______________________________________________________________________________________________________________________________");
        // 2nd type is safe type of collection
//        LinkedList list = new LinkedList();
        ArrayList list = new ArrayList();
        list.add("Durgesh");
        list.add("Alok");
        list.add("Alok");
        list.add(809);
        list.add(true);
        list.add(90.1313);
        System.out.println("List: "+list);
        System.out.println(list.get(0));
        System.out.println(list.get(3));

     // Vector

        System.out.println("______________________________________________________________________________________________________________________________");
        Vector<String> vector = new Vector<>();
        //  add all value one variable to another variable
        vector.addAll(names);

        // Check Size of variable size method
        System.out.println("Size: "+vector.size());

        // this method use for specific value remove in variable
        vector.remove("alok");

        // check for value is available or not
        System.out.println(" Vector: "+vector.contains("durgesh"));

        // Check for  in Variable  to value is available or not
        System.out.println(" Vector: "+vector.isEmpty());
        // check for in  variable values is available or not
        System.out.println("Size: "+vector.size());
        //print values of my variable
        System.out.println("Vector: "+vector);
      /// this is my all values condition check;

        for (String s : Arrays.asList(" Vector: " + vector.isEmpty(), "Size: " + vector.size(), "Vector: " + vector)) {
            System.out.print(s+" ");
        }


        System.out.println();
        System.out.println("______________________________________________________________________________________________________________________________");
        HashSet<Double> name= new HashSet<>();
        name.add(13.89);
        name.add(23.3);
        name.add(89.1);
        name.add(789.1313);
        System.out.println(name);
        //System.out.println(name.get(""));


        System.out.println("______________________________________________________________________________________________________________________________");

        TreeSet<Double> nameSet= new TreeSet<>();

        nameSet.addAll(name);
        System.out.println(nameSet);



    }
}