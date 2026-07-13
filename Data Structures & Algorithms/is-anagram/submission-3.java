class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> map1 = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();
        for(char a: s.toCharArray()){
            map1.put(a, map1.getOrDefault(a,0)+1);
        }
        for(char b : t.toCharArray()){
            map2.put(b, map2.getOrDefault(b,0)+1);
        }
        return map1.equals(map2);
    }
}
