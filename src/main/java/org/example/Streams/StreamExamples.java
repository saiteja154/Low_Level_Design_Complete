package org.example.Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExamples {

   public static void main(String args[]){
       List<Integer> list1=new ArrayList<>();
       list1.add(4);
       list1.add(7);
       list1.add(9);
       list1.add(1);
       list1.add(3);
       list1.add(90);
       list1.add(40);
       list1.add(70);

       Stream<Integer> st1=list1.stream();
       Stream<Integer> st2= list1.stream();
      // System.out.println(st1);
       //System.out.println(st1.limit(3));
      // System.out.println(st2.limit(3).count());

       //printing.
       //st1.forEach((ele)->{System.out.println(ele);});
       //System.out.println(st1.count());


       //Sort the data in desecnding order of the even elements and print using foreach.
       list1.stream()
               .filter( (n)->(n%2==0) )
               .sorted((a, b)->(b-a))
               .forEach( (x)->{ System.out.println(x);} );
       System.out.println();







       System.out.println("Filter with Map and sorted in DESC order");
       //Sort the data in desecnding order of the even elements and store the data in list..
   List<Integer>result=   list1.stream()
           .filter( (n)->(n%2==0) )
           .sorted((a, b)->(b-a))
            .collect(Collectors.toList());

   for(Integer x:result){
       System.out.println(x);
   }
       System.out.println();








       System.out.println("MAP");

       List<Integer>result1=   list1.stream()
               .filter( (n)->(n%2==0) )
               .map((n)-> (n*n))
               .sorted((a, b)->(b-a))
               .collect(Collectors.toList());

        System.out.println(result1);
        System.out.println();


        // findFirst
       Optional<Integer> result2=   list1.stream()
               .filter( (n)->(n%2==0) )
               .map((n)-> (n*n))
               .sorted((a, b)->(b-a))
               .findFirst();

       if(result2.isPresent()) {
           System.out.println("Here is the final Element"+result2.get());
       }
       else {
           System.out.println("Nothing is left");
       }



       // reduce
            // I want to sum up all elements of the list.
       Integer result4=   list1.stream()
               .filter( (n)->(n%2==0) )
               .map((n)-> (n*n))
               .sorted((a, b)->(b-a))
               .reduce(0,(c,e)->c+e );

       System.out.println("Sum of all elemets after the filter "+result4);
       System.out.println();




       // I want to find minimum element from the final output.
       Integer mn = Integer.MAX_VALUE;
       for(Integer it : list1){
           mn = Math.min(it, mn);
       }


       Integer result5=   list1.stream()
               .filter( (n)->(n%2==0) )
               .map((n)-> (n*n))
               .sorted((a, b)->(b-a))
               .reduce(Integer.MAX_VALUE,(a,b)-> Math.min(a,b) );

        System.out.println("Minimum Value of the element "+result5);





        // Find the Students who's name start's with 'S'.

        List<String> studentNames=new ArrayList<>();
        studentNames.add("Sai");
        studentNames.add("kiran");
       studentNames.add("Pawan Kalyan");
       studentNames.add("Abhilash");
       studentNames.add("Vijay");
       studentNames.add("Surya");

      List<String> studentResult= studentNames.stream().
               filter((n)->(n.charAt(0)=='S'))
               .collect(Collectors.toList());

      System.out.println("Students who's name start with "+ " S "+studentResult);

   }


        /*
            Does the order of applying the stream methods matter??
            The order will definetely affect the performane because the output of current stream method
            will become input of the next

         */

}
