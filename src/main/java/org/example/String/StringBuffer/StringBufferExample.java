package org.example.String.StringBuffer;


/*

Java StringBuffer class is used to create mutable (modifiable) String objects.
The StringBuffer class in Java is the same as String class except it is mutable i.e. it can be changed.

Note: Java StringBuffer class is thread-safe i.e. multiple threads cannot access it simultaneously.
 So it is safe and will result in an order
 */

/*

StringBuffer Methods:
    append(),
    insert(index,String),
    replace(Startindex,endindex,value),
    delete(startIndex,EndIndex);
    reverse();
    capacity();

 */
public class StringBufferExample {

    public static void main(String args[]){

        StringBuffer sb=new StringBuffer("Hello");

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
