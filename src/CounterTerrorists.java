
public class CounterTerrorists {

	
		public Storage[]  CounterTerrorists;
		int i=0;
		
		CounterTerrorists(int size)
		{
			CounterTerrorists = new Storage[size];
		}
		
		public void add(Storage p)
		{
			CounterTerrorists[i] = p;
			i++;
		}
		
	


}
