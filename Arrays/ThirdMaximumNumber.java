class Solution {
    public int thirdMax(int[] nums) {
       Set<Integer> set = new HashSet<>();
        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        int thirdMax = Integer.MIN_VALUE;
        for (int num : nums) {
            if (!set.contains(num)) {
                if (num > firstMax) {
                    thirdMax = secondMax;
                    secondMax = firstMax;
                    firstMax = num;
                } else if (num > secondMax) {
                    thirdMax = secondMax;
                    secondMax = num;
                } else if (num > thirdMax) {
                    thirdMax = num;
                }
                set.add(num);
            }
        }
        if (set.size() < 3) {
            return firstMax;
        }
        return thirdMax;
    }
}