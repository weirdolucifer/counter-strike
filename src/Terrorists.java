

public class  Terrorists
{
	public Storage[]  Terrorists;
	int i=0;
	
	 Terrorists(int size)
	{
		 Terrorists = new Storage[size];
	}
	
	public void add(Storage p)
	{
		 Terrorists[i] = p;
		i++;
	}
	
	
	
	
}