package StringHandling;


import java.util.HashMap;

public class Stringarraychecker {

    static int count_pairs(String s1[], String s2[], int n1, int n2) {

        // Map to store the frequencies of all the strings of array s1[] 
        HashMap<String, Integer> mp = new HashMap<>();

        // Update the frequencies 
        for (int i = 0; i < n1; i++) {
            mp.put(s1[i], 0);
        }

        // Update the frequencies 
        for (int i = 0; i < n1; i++) {
            mp.put(s1[i], mp.get(s1[i]) + 1);
        }

        // To store the count of pairs 
        int cnt = 0;

        // For every string of array s2[] 
        for (int i = 0; i < n2; i++) {

            // If current string can make a pair 
            if (mp.get(s2[i]) > 0) {

                // Increment the count of pairs 
                cnt++;

                // Decrement the frequency of the 
                // string as once occurrence has been 
                // used in the current pair 
                mp.put(s2[i], mp.get(s2[i]) - 1);
            }
        }

        // Return the count 
        return cnt;
    }

    // Driver code 
    public static void main(String[] args) {
        String s1[] = {"abc", "def"};
        String s2[] = {"abc", "abc"};
        int n1 = s1.length;
        int n2 = s2.length;

        System.out.println(count_pairs(s1, s2, n1, n2));
    }
}
