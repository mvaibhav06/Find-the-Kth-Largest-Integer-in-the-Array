import java.math.BigInteger;
class KthLargestNumber {
    public String kthLargestNumber(String[] nums, int k) {
        BigInteger[] temp = new BigInteger[nums.length];
        for(int i=0; i<nums.length; i++){
            temp[i] = new BigInteger(nums[i]);
        }
        Arrays.sort(temp);
        return ""+temp[temp.length-k];
    }
}
