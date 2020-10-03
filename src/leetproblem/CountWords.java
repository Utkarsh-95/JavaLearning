package leetproblem;


public class CountWords {

    static void countEachChar(String str) {
        int counter[] = new int[256];

        int len = str.length();

        /* This array holds the occurrence of each char, For example
	 * ASCII value of A is 65 so if A is found twice then 
	 * counter[65] would have the value 2, here 65 is the ASCII value
	 * of A
         */
        for (int i = 0; i < len; i++) {
            counter[str.charAt(i)]++;
        }

        // We are creating another array with the size of String
        char array[] = new char[str.length()];
        for (int i = 0; i < len; i++) {
            array[i] = str.charAt(i);
            int flag = 0;
            for (int j = 0; j <= i; j++) {

                /* If a char is found in String then set the flag 
		 * so that we can print the occurrence
                 */
                if (str.charAt(i) == array[j]) {
                    flag+=1;
                }
            }

            if (flag == 1 && counter[str.charAt(i)] > 1) {
                System.out.println("Occurrence of " + str.charAt(i) + " = " + counter[str.charAt(i)]);
            }
        }
    }

    public static void main(String[] args) {
        String str = "schools";
        countEachChar(str);
    }
}
