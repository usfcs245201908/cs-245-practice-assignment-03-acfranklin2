public class LinearSearch implements Practice03Search
{
	public int search(int[] arr, int target)
	{
		for(int n = 0; n < arr.length; n++)
			if(arr[n] == target)
				return(n);
		return(-1);
	}

	public String searchName()
	{
		return("linear");
	}

}