package tudelft.numfinder;

public class NumFinder {
    private int smallest;
    private int largest;

    public void find(int[] nums) {
        if (nums.length > 0){
            smallest = nums[0];
            largest = nums[0];

            for(int n : nums) {

                if(n < smallest)
                    smallest = n;
                else if (n > largest)
                    largest = n;
            }
        }
    }

    public int getSmallest () {
        return smallest;
    }

    public int getLargest () {
        return largest;
    }
}
