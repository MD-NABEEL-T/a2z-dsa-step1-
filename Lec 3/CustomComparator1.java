import java.util.*;
public class CustomComparator1 {
    public static void main(String []args){
    List<Integer> li=new ArrayList<>();
    li.add(2);
    li.add(5);
    li.add(1);
    System.out.println(li);

    Collections.sort(li,new Comparator<Integer>(){
        public int compare(Integer num1,Integer num2){

            if(num1<num2){
                return 1;
            }
            else if(num1>num2){
                return -1;
            }
            return 0;
        }
    });
    System.out.println(li);
}
}

// to print the ascending change the 1 to -1 and vice versa