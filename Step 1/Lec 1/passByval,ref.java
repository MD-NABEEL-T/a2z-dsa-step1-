// For non  primitive
public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        changeArr(arr);
        System.out.println(arr[0]); // becomes 99
    }

    static void changeArr(int[] nums) {
        nums[0] = 99; // this changes original array
    }
}

// For primitive 
public class Main {
    public static void main(String[] args) {
        int a = 10;
        changeValue(a);
        System.out.println(a); // still 10
    }

    static void changeValue(int x) {
        x = 20; // changes ONLY the copy
    }
}
