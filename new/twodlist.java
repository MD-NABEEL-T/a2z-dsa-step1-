// here deepToString is not needed because it is used for only for arryas inside an array alright  
import java.util.*;
/**
 * twodlist
 */
public class twodlist {

    public static void main(String []args){
        List<List<Integer>> matrix2d=new ArrayList<>();
        List<Integer> matrix1d=new ArrayList<>();

        matrix1d.add(2);
        matrix1d.add(23);

        matrix2d.add(matrix1d);
        matrix2d.add(matrix1d);
        System.out.println(matrix2d);

    }
}