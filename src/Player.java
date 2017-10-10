
abstract class Player {
        
}
class Agg extends Player
{
	Agg(String check,Terrorists list1,CounterTerrorists list2,int tn)
	{
	if("Terrorists".equals(check))
	{
		int s1=list1.Terrorists[tn].getEnergy_level();
		s1=s1-2;
		list1.Terrorists[tn].setEnergy_level(s1);
		int hit=list1.Terrorists[tn].getHitstatus();
        if(hit==2 || s1==0)
        {
        	list1.Terrorists[tn].setIsdead(1);
        	
        	list1.Terrorists[tn].setEnergy_level(0);
        }
	}
	if("CounterTerrorists".equals(check))
	{
		int s1=list2.CounterTerrorists[tn].getEnergy_level();
		s1=s1-2;
		list2.CounterTerrorists[tn].setEnergy_level(s1);
		int hit=list2.CounterTerrorists[tn].getHitstatus();
        if(hit==2 || s1==0)
        {
        	list2.CounterTerrorists[tn].setIsdead(1);
        	list2.CounterTerrorists[tn].setEnergy_level(0);
        }
	}
	}
}
class Caution extends Player
{
	Caution(String check,Terrorists list1,CounterTerrorists list2,int tn)
	{
	if("Terrorists".equals(check))
	{
		int s1=list1.Terrorists[tn].getEnergy_level();
		s1=s1-1;
		list1.Terrorists[tn].setEnergy_level(s1);
		int hit=list1.Terrorists[tn].getHitstatus();
        if(hit==1 || s1==0)
        {
        	list1.Terrorists[tn].setIsdead(1);

        	list1.Terrorists[tn].setEnergy_level(0);
        }
	}
	if("CounterTerrorists".equals(check))
	{
		int s1=list2.CounterTerrorists[tn].getEnergy_level();
		s1=s1-1;
		list2.CounterTerrorists[tn].setEnergy_level(s1);
		int hit=list2.CounterTerrorists[tn].getHitstatus();
        if(hit==1 || s1==0)
        {
        	list2.CounterTerrorists[tn].setIsdead(1);
        	list2.CounterTerrorists[tn].setEnergy_level(0);
        }
	}
	}
}
class Blind extends Player
{
	Blind(String check,Terrorists list1,CounterTerrorists list2,int tn)
	{
	if("Terrorists".equals(check))
	{
		int s1=list1.Terrorists[tn].getEnergy_level();
		s1=s1-3;
		list1.Terrorists[tn].setEnergy_level(s1);
		int hit=list1.Terrorists[tn].getHitstatus();
        if(hit==5 || s1==0)
        {
        	list1.Terrorists[tn].setIsdead(1);
        	list1.Terrorists[tn].setEnergy_level(0);
        }
	}
	if("CounterTerrorists".equals(check))
	{
		int s1=list2.CounterTerrorists[tn].getEnergy_level();
		s1=s1-3;
		list2.CounterTerrorists[tn].setEnergy_level(s1);
		int hit=list2.CounterTerrorists[tn].getHitstatus();
        if(hit==5 || s1==0)
        {
        	list2.CounterTerrorists[tn].setIsdead(1);
        	list2.CounterTerrorists[tn].setEnergy_level(0);
		
        }
	}
	}
}