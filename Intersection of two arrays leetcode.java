class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
         Set<Integer> s = new HashSet<>();
         Set<Integer> nums1s = new HashSet<>();
        for(int i:nums1){
            nums1s.add(i);
        }
        for(int i:nums2){
            if(nums1s.contains(i)){
                s.add(i);
            }
        }      
       
        int[] res = new int[s.size()]; 
        List<Integer> l = new ArrayList<>(s);
       for(int i=0;i<s.size();i++){
        res[i] = l.get(i);
       }
       return res;
    }
}
