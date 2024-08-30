// Insertion Sort :- 

import java.util.Arrays;

public class InsertionSort {
	public static void main(String[] args) {
		int[] nums = {5,-7,9,2,-4,0};
		System.out.println(Arrays.toString(insertionSort(nums)));
	}
	
	static int[] insertionSort(int[] nums)
	{
		for(int i=0;i<nums.length-1;i++)
		{
			for(int j=i+1;j>0;j--)
			{
				if(nums[j] < nums[j-1])
				{
					int temp = nums[j-1];
					nums[j-1] = nums[j];
					nums[j] = temp;
				}
				else 
				{
					break;
				}
			}
		}
		return nums;
	}
}
