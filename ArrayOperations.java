import com.sun.jdi.IntegerValue;
import jdk.swing.interop.SwingInterOpUtils;

import java.net.StandardSocketOptions;
import java.util.*;
import java.util.stream.Collectors;

public class ArrayOperations {

    public static void main(String[] args) {
        //List list= Arrays.asList("vishal","Rahul","Geeta","viji");
        /*Scanner sc= new Scanner(System.in);
        ArrayList list= new ArrayList();
        while (sc.hasNext()){
            //String abc=sc.next();
            list.add(sc.next());

        }

        list.stream().map(str->String.valueOf(str).toUpperCase()).forEach(System.out:: println);
 sc.close();*/


        /*int[] numbers = new int[] { 1,2,3,4,5,6,7,8,9,10,11, 14, 15, 12, 17, 18, 16, 19,20 };

        int n= numbers.length + 1;
        int expectedSum=(n*(n+1))/2;
        int actualSum= Arrays.stream(numbers).sum();
        int missingNumber=expectedSum-actualSum;
        System.out.println(missingNumber);*/

List<Integer> list=       Arrays.asList(1,2,3,4,5,6,7,8,9,10,10);

int secondMax= list.stream().sorted(Comparator.reverseOrder()).distinct().skip(1).findFirst().get();
System.out.println(secondMax);
System.out.println("done");


    }
}
