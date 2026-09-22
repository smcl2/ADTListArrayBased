public class ArrayBasedList {
	
	int [] data;
	int numItems;
	
	public ArrayBasedList()
	{
		data = new int[50];
		numItems = 0;
	}
	
	public boolean isEmpty()
	{
		return numItems==0;
	}
	
	public int size()
	{
		return numItems;
	}
	
	public void add(int index,int item)
	{
		if(index < 1 || index > size()+1)
			System.out.println("Index is outside the bounds of the list for index= " + index);
		else
		{
			//lets shift the elements from index to size up by one spot
			for(int loc=size();loc >= index;loc--)
			{
				data[loc+1-1] = data[loc-1];//-1 for mapping between list and array indexes
			}
			data[index-1] = item;
			numItems++;
		}
	}
	public int get(int index)
	{
		if(index < 1 || index > size()+1)
		{
			System.out.println("Index is outside the bounds of the list for index= " + index);
			return -1;
		}
		else
			return data[index-1];
	}
	

}
