import java.util.Arrays;

public class SelectionSort {
	public static void main(String[] args) {
		int[] nums = {5,-27,94,2,-24,0};
		System.out.println(Arrays.toString(selectionSort(nums)));
	}
	
	static int[] selectionSort(int[] nums)
	{
		int startIndex = 0;
		
		for(int i=startIndex;i<nums.length;i++)
		{
			int lastIndex = nums.length-i-1;
			System.out.println("Last Index Value :-" + nums[lastIndex]);
			int maxValueIndex = getmaxValueIndex(nums,startIndex,lastIndex);
			System.out.println("Max Value :- "+ nums[maxValueIndex]);
			if(nums[maxValueIndex] > nums[lastIndex])
			{
				int temp = nums[lastIndex];
				nums[lastIndex] = nums[maxValueIndex];
				nums[maxValueIndex] = temp;
			}
		}
		return nums;
	}

	static int getmaxValueIndex(int[] nums, int startIndex, int lastIndex) 
	{
		int maxValueIndex = startIndex;
		for(int i=startIndex;i<lastIndex;i++)
		{
			if(nums[maxValueIndex] < nums[i])
			{
				maxValueIndex = i;
			}
		}
		return maxValueIndex;
	}
}
