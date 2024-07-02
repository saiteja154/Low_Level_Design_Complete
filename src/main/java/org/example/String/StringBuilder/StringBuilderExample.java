package org.example.String.StringBuilder;


/*
Java StringBuilder class is used to create mutable (modifiable) String.
The Java StringBuilder class is same as StringBuffer class except that it is non-synchronized.

    StringBuilder methods:
     append(),
    insert(index,String),
    replace(Startindex,endindex,value),
    delete(startIndex,EndIndex);
    reverse();
    length();
    charAt(index);
    capacity();
 */
public class StringBuilderExample {
    public static void main(String args[]){


        StringBuilder sb=new StringBuilder("Hello");

        sb.append(" Good");
        System.out.println(sb);

        sb.insert(0,"HI, ");
        System.out.println(sb);

        sb.replace(10,14,"Bad");
        System.out.println(sb);


        sb.delete(10,14);
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);
        sb.reverse();


        System.out.println(sb.capacity());
        System.out.println(sb.length());
        System.out.println(sb.charAt(1));

        System.out.println(sb.substring(4,10));
    }
}
