package leetproblem;

public class MyHashSet {

    private int buckets = 1000;
    private int itemsPerBucket = 1001;
    private boolean[][] table;

    public MyHashSet() {
        table = new boolean[buckets][];
    }

    public int hash(int key) {
//        System.out.println(buckets + "-" + key % buckets);//2 % 1000=2
        return key % buckets;
    }

    public int pos(int key) {
        return key / buckets;
    }

    public void add(int key) {
        int hashkey = hash(key);

        if (table[hashkey] == null) {
            table[hashkey] = new boolean[itemsPerBucket];
        }
        table[hashkey][pos(key)] = true;
    }

    public void remove(int key) {
        int hashkey = hash(key);

        if (table[hashkey] != null) {
            table[hashkey][pos(key)] = false;
        }
    }

    /**
     * Returns true if this set did not already contain the specified element
     *
     * @param key
     * @return
     */
    public boolean contains(int key) {
        int hashkey = hash(key);
        return table[hashkey] != null && table[hashkey][pos(key)];
    }

    public static void main(String[] args) {
        MyHashSet obj = new MyHashSet();
        obj.add(2);
//        obj.remove(1);
        boolean param_3 = obj.contains(2);
        System.out.println(param_3);
    }

}
