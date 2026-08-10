class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashSet<Integer> seen = new HashSet<>();
        List<List<String>> res = new ArrayList<>();

        for (int i = 0; i < strs.length; i++) {
            if (seen.contains(i)) {
                continue;
            }
            System.out.println(strs[i]);
            HashMap<Character, Integer> chseen = new HashMap<>();
            for (int j = 0; j < strs[i].length(); j++) {
                chseen.put(strs[i].charAt(j), chseen.getOrDefault(strs[i].charAt(j), 0)+1);
            }
            List<String> temp = new ArrayList<>();
            for (int j = i + 1; j < strs.length; j++) {
                if (strs[i].length() != strs[j].length()) {
                    continue;
                }
                HashMap<Character, Integer> check = new HashMap<>();
                for (int k = 0; k < strs[j].length(); k++) {
                    check.put(strs[j].charAt(k), check.getOrDefault(strs[j].charAt(k), 0)+1);
                }
                if (check.equals(chseen)) {
                    seen.add(j);
                    temp.add(strs[j]);
                }
            }
            seen.add(i);
            temp.add(strs[i]);
            res.add(temp);
        }
        return res;
    }
}