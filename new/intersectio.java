import java.util.*;
public class intersectio{
    public static void main(String []args){
        int arr1[]={1,1,2,2,2,3,4};
        int arr2[]={0,2,2,3,4};
        List<Integer> list=new ArrayList<>();

        int i=0;
        int j=0;
        while(i!=arr1.length-1 || j!=arr2.length-1){
            if(arr1[i]==arr2[j]){
                if(list.isEmpty() || list.get(list.size()-1) != arr1[i]){
                list.add(arr1[i]);
                i++;
                j++;
            }}
            else if(arr1[i]<arr2[j]){
                i++;
            }
            else if(arr1[i]>arr2[j]){
                j++;
            }
        }
        System.out.println(list);
    }
}