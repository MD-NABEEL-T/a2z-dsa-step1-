import java.util.TreeSet;

/**
 * unionoftwosortedarr
 */
public class unionoftwosortedarr {

    public static void main(String []args){
        int arr1[]={1,2,2,4,5};
        int arr2[]={2,3,3,4,4,6};
        TreeSet<Integer> set=new TreeSet<>();
        for(int i=0;i<arr1.length;i++){
            set.add(arr1[i]);
        }
        for(int i=0;i<arr2.length;i++){
            set.add(arr2[i]);
        }
        System.out.println(set);
    }
}




// Two pointer approach 
    // public static void main(String[] args) {
    //     int[] arr1={1,1,2,2,2,3,4};
    //     int[] arr2={0,0,2,2,3,4,5,6,7,7};
    //     List<Integer> list=new ArrayList<>();
    //     int i=0;
    //     int j=0;
    //     // int min=0;
    //     while(i<arr1.length && j<arr2.length){
    //         if(arr1[i]<=arr2[j]){
    //             if(list.contains(arr1[i])!=true){
    //             list.add(arr1[i]);}
    //             i++;
    //         }
    //         else if(arr2[j]<=arr1[i]){
    //             if(list.contains(arr2[j])!=true){
    //             list.add(arr2[j]);}
    //             j++;
    //         }
    //     }
    //     while(i<arr1.length){
    //             if(list.contains(arr1[i])!=true){
    //             list.add(arr1[i]);}
    //             i++;
    //     }
    //     while(j<arr2.length){
    //         if(list.contains(arr2[j])!=true){
    //             list.add(arr2[j]);}
    //             j++;
    //     }
    //     System.out.println(list);
    // }
