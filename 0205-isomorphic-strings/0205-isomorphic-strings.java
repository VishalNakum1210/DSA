class Solution {
    public boolean isIsomorphic(String s, String t) {
        char[] s1 = new char[256];
        char[] s2 = new char[256];

        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            char b = t.charAt(i);

            if (s1[a] == '\u0000' && s2[b] == '\u0000') {
                s1[a] = b;
                s2[b] = a;
            }
            else if (s1[a] != b || s2[b] != a) {
                return false;
            }
        }
        return true;
    }
}