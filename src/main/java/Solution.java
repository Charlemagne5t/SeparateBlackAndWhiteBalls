class Solution {
    public long minimumSteps(String s) {
        int j = 0;
        long res = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '0') {
                res += i - j;
                j++;
            }
        }

        return res;
    }
}