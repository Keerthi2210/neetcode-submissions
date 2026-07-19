class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        List<Integer>[] bucket = new List[nums.length + 1];
        HashMap<Integer,Integer> map = new HashMap<>();
       for(int n:nums){
            map.put(n, map.getOrDefault(n,0)+1);
       } 
       for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            int key = entry.getKey();
            int value = entry.getValue();
            if(bucket[value] == null){
                bucket[value] = new ArrayList<>();
            }
            bucket[value].add(key);
       }
       List<Integer> sorted = new ArrayList<>();
       for(int i = bucket.length - 1; i>=0; i--){
            if (bucket[i] != null) {
                for (int key : bucket[i]) {
                    sorted.add(key);
                    if(sorted.size() == k){
                        break;
                    }
                }
            }
       }
       int[] ans = new int[k];
        for(int j = 0; j < k;j++){
            ans[j] = sorted.get(j);
        }
       return ans;
    }
}
