import java.util.Hashtable;

public class demo_hash_table {

    public static void main(String[] args) {

        /**
         *      Hashtable = A data structure that stores unique keys to values ex.<Integer,String>
         *                  Each key/value pair is known as an Entry
         *                  Fast insertion, look up, deletion of key/value pairs
         *                  Not ideal for small data sets, great with large data sets
         *
         *      Hashing = takes a key and computes an integer (formula will vary based on key & data type)
         *                In a Hashtable, we use the hash % capacity to calculate an index number
         *
         *                key.hashCode() % capacity = index
         *
         *      Bucket = an indexed storage location for one or more Entries
         *               can store multiple Entries in case of a collision (linked similarly a LinkedList)
         *
         *      Collision = hash function generates the same index for more than one key
         *                  less collision = more efficiency
         *
         *      Run-time complexity = Best case O(1)
         *                            Worst case O(n)
         */

        Hashtable<String,String> table = new Hashtable<>();
        table.put("100","Spongebob");
        table.put("123","Patrick");
        table.put("321","Sandy");
        table.put("555","SquidWard");
        table.put("777","Gary");

        for(String key : table.keySet()){
            System.out.println(key.hashCode() % 10 + "\t" + key + "\t" + table.get(key));
        }

    }

}
