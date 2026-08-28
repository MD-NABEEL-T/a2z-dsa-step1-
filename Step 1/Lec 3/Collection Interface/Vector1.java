import java.util.*;
public class Vector1 {
    public static void main(String []args){
        Vector<Integer> ve=new Vector<>();
        ve.add(3);
        System.out.println(ve);
    }
}
// In Java, the Vector class is inherently thread-safe. 
// Synchronized Methods: Every public method (like add(), get(), and remove()) is "synchronized". This means only one thread can execute any of these methods on a specific Vector instance at a time.
// Automatic Locking: The JVM manages a lock on the Vector object. If Thread A is adding an item, Thread B must wait for Thread A to finish before it can read or write to that same list.
// Trade-off: Because it forces locking for every single operation, Vector is generally slower than modern alternatives like ArrayList in single-threaded environments. 