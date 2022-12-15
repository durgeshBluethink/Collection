import java.util.HashMap;

public class Map_collection {
    public static void main(String[] args) {
        HashMap<String,Integer> hasname = new HashMap<>();
        //adding element
        hasname.put("Durgesh",809012);
        hasname.put("alok", 6789);
        hasname.put("niss",123);
        hasname.put("Sachin",890);
        hasname.put("Durgesh",809012);

        System.out.println();
        // ceack for size of variable
       System.out.println(hasname.size());

        System.out.println(hasname+" ");

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++=");

        hasname.forEach((key,value)->{
            System.out.print(key+" ");
            System.out.print("=> ");
            System.out.println(value);
        });

    }
}
