public class BinaryRecursiveSearch implements Practice03Search
{
	
	public int search(int[] arr, int target)
	{
		return(search(arr, target, 0, arr.length - 1));
	}

	public int search(int[] arr, int target, int low, int high)
	{
		int midIndex = (high + low)/2;
		if(high < low)
			return(-1);
		else if(arr[midIndex] == target)
			return(midIndex);
		else if(arr[midIndex] < target)
			return(search(arr, target, midIndex + 1, high));
		else 
			return(search(arr, target, low, midIndex - 1));
	}

	public String searchName()
	{
		return("binary-recursive");
	}
	
}