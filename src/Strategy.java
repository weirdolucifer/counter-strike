

import java.util.Random;

abstract class Strategy {

}
class Nearest extends Strategy
{
	Nearest(String check,Terrorists list1,CounterTerrorists list2,int tn,int m,int n)
	{
		if("Terrorists".equals(check))
		{

			int i4=0;

			double x=	list1.Terrorists[tn].getXaxis();
			double y=   list1.Terrorists[tn].getYaxis();
            while(list2.CounterTerrorists[i4].getIsdead()!=0)
            i4++;
            double x1=list2.CounterTerrorists[i4].getXaxis();
			double y1=list2.CounterTerrorists[i4].getYaxis();
			   

			double x2=x1-x;
			double y2=y1-y;
            double min= Math.sqrt((x2*x2)+(y2*y2));		
 			for(int ix1=0;ix1<n;ix1++)
			{
				if(list2.CounterTerrorists[ix1].getIsdead()==0)
				{
				double x11=list2.CounterTerrorists[ix1].getXaxis();
				double y11=list2.CounterTerrorists[ix1].getYaxis();
				x2=x11-x;
				y2=y11-y;
                double d= Math.sqrt((x2*x2)+(y2*y2));
                if(d<min)
                {
                	min=d;
                	x1=x11;
                	y1=y11;
                }


			   }
			}
			list1.Terrorists[tn].setDesxaxis(x1);
			list1.Terrorists[tn].setDesyaxis(y1);
		}
		if("CounterTerrorists".equals(check))
		{
			int i4=0;

			double x=	list2.CounterTerrorists[tn].getXaxis();
			double y=   list2.CounterTerrorists[tn].getYaxis();
            while(list1.Terrorists[i4].getIsdead()!=0)
            i4++;
            double x1=list1.Terrorists[i4].getXaxis();
			double y1=list1.Terrorists[i4].getYaxis();
			   

			double x2=x1-x;
			double y2=y1-y;
            double min= Math.sqrt((x2*x2)+(y2*y2));		
 			for(int ix1=0;ix1<n;ix1++)
			{
				if(list1.Terrorists[ix1].getIsdead()==0)
				{
				double x11=list1.Terrorists[ix1].getXaxis();
				double y11=list1.Terrorists[ix1].getYaxis();
				x2=x11-x;
				y2=y11-y;
                double d= Math.sqrt((x2*x2)+(y2*y2));
                if(d<min)
                {
                	min=d;
                	x1=x11;
                	y1=y11;
                }
                }


			}
			list2.CounterTerrorists[tn].setDesxaxis(x1);
			list2.CounterTerrorists[tn].setDesyaxis(y1);
		}
	}
}
class Random1 extends Strategy
{
    


	Random1(String check,Terrorists list1,CounterTerrorists list2,int tn,int m,int n)
	{
		if("Terrorists".equals(check))
		{
			Random rand = new Random(); 

			int rnd = rand.nextInt(n);
			while(list2.CounterTerrorists[rnd].getIsdead()!=0)
				rnd = new Random().nextInt(n);
			double x1=list2.CounterTerrorists[rnd].getXaxis();
			double y1=list2.CounterTerrorists[rnd].getYaxis();
			list1.Terrorists[tn].setDesxaxis(x1);
			list1.Terrorists[tn].setDesyaxis(y1);
		}
		if("CounterTerrorists".equals(check))
		{
				int rnd = new Random().nextInt(m);
			while(list1.Terrorists[rnd].getIsdead()!=0)
				rnd = new Random().nextInt(m);
			double x1=list1.Terrorists[rnd].getXaxis();
			double y1=list1.Terrorists[rnd].getYaxis();
			list2.CounterTerrorists[tn].setDesxaxis(x1);
			list2.CounterTerrorists[tn].setDesyaxis(y1);
		}
	}
	
}
class Ahead extends Strategy
{
	Ahead(String check,Terrorists list1,CounterTerrorists list2,int tn,int m, int n)
	{
		
		if("Terrorists".equals(check))
		{
			double x1=0,y1=0;
            
            double x=list1.Terrorists[tn].getXaxis();
			double y=list1.Terrorists[tn].getYaxis();
            double theta=Math.atan2(y,x);
			double alpha=Math.atan2(1.73205 , 1.0000);
			
			for(int i=0;i<n;i++)
			{   if(list2.CounterTerrorists[i].getIsdead()==0)
			{
				double px=list2.CounterTerrorists[i].getXaxis();
				double py=list2.CounterTerrorists[i].getYaxis();
				double gamma=Math.atan2((py-y),(px-x));
				if(Math.cos(theta-gamma) > Math.cos(alpha))
				{

					 x1=list2.CounterTerrorists[i].getXaxis();
				    y1=list2.CounterTerrorists[i].getYaxis();
				}
			}

		    }

			list1.Terrorists[tn].setDesxaxis(x1);
			list1.Terrorists[tn].setDesyaxis(y1);
		}
		

		if("CounterTerrorists".equals(check))
		{
			double x1=0,y1=0;
		    double x=list2.CounterTerrorists[tn].getXaxis();
			double y=list2.CounterTerrorists[tn].getYaxis();
            double theta=Math.atan2(y,x);
			double alpha=Math.atan2(1.73205 , 1.0000);
			
			for(int i=0;i<m;i++)
			{   if(list1.Terrorists[i].getIsdead()==0)
			{
				double px=list1.Terrorists[i].getXaxis();
				double py=list1.Terrorists[i].getYaxis();
				double gamma=Math.atan2((py-y),(px-x));
				if(Math.cos(theta-gamma) > Math.cos(alpha))
				{

					x1=list1.Terrorists[i].getXaxis();
				    y1=list1.Terrorists[i].getYaxis();
				}
			}

		    }

			list2.CounterTerrorists[tn].setDesxaxis(x1);
			list2.CounterTerrorists[tn].setDesyaxis(y1);
		}
	}
}
