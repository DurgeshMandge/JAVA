public class Main {

    public static int minOperations(String s) {
        int n = s.length();
        int[] freq = new int[26]; // Frequency array for each character
        for (int i = 0; i < n; i++) {
            freq[s.charAt(i) - 'a']++;
        }
        int minOps = Integer.MAX_VALUE;
        // Iterate through each character
        for (int i = 0; i < 26; i++) {
            if (freq[i] == 1) { // Character occurs only once
                return 0; // No need to perform swaps
            } else if (freq[i] > 1) { // Character occurs more than once
                int cnt = 0;
                int last = -1;
                for (int j = 0; j < n; j++) {
                    if (s.charAt(j) == 'a' + i) {
                        if (last != -1 && j != last + 1) {
                            cnt++; // Increment count if not contiguous
                        }
                        last = j;
                    }
                }
                minOps = Math.min(minOps, cnt);
            }
        }
        return minOps == Integer.MAX_VALUE ? 0 : minOps;
    }

    public static void main(String[] args) {
        String s = "ppssppss";
        System.out.println("Minimum number of operations: " + minOperations(s));
    }
}
