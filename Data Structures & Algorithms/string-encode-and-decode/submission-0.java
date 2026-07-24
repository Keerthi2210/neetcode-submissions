class Solution {

    public String encode(List<String> strs) {
        StringBuilder result = new StringBuilder();

        for(String s : strs){
            result.append(s.length());
            result.append('|');
            result.append(s);
        }
        return result.toString();
    } 


    public List<String> decode(String str) {
        List<String> original = new ArrayList<>();
        int i = 0;
        while(i < str.length()){
            int j = i, length = 0;
            while(str.charAt(j) != '|'){
                length = length * 10 + (str.charAt(j) - '0');
                j = j+1;
            }
            String word = str.substring(j + 1, j + 1 + length);
            original.add(word);
            i = j + 1 + length;
        }
        return original;
    }
}
