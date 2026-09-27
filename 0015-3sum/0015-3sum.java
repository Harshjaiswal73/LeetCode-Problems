class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        Arrays.sort(nums);

        Set<List<Integer>> result = new HashSet<>();

        int n = nums.length;

        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<n; i++){
             map.put(nums[i], i);
        }
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                int target = -(nums[i] + nums[j]);
                if (map.containsKey(target) && map.get(target) > j) {
                    result.add(Arrays.asList(nums[i], nums[j], target));
                }
            }
        }
        return new ArrayList<>(result);
    }
}