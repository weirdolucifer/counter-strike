public class Environment {
	
	  public static void SortbyEnergylevel(Terrorists list1,CounterTerrorists list2,int m, int n)
	{
		  Storage temp = new Storage();
		   
            for(int i=0;i<m;i++)
            { 

             for(int j=i+1;j<m;j++)
             {

            	if(list1.Terrorists[j].getEnergy_level()>list1.Terrorists[i].getEnergy_level())
            	{
            		temp=list1.Terrorists[i];
            		list1.Terrorists[i]=list1.Terrorists[j];
            		list1.Terrorists[j]=temp;
            	}

            }
            }
            
            
            for(int i=0;i<n;i++)
            { 

             for(int j=i+1;j<n;j++)
             {

            	if(list2.CounterTerrorists[j].getEnergy_level()>list2.CounterTerrorists[i].getEnergy_level())
            	{
            		temp=list2.CounterTerrorists[i];
            		list2.CounterTerrorists[i]=list2.CounterTerrorists[j];
            		list2.CounterTerrorists[j]=temp;
            	}

            }
            }
	}

	 


	  public static void SortbySuccess(Terrorists list1,CounterTerrorists list2,int m, int n)
		{
			  Storage temp = new Storage();
			   
	            for(int i=0;i<m;i++)
	            { 

	             for(int j=i+1;j<m;j++)
	             {

	            	if(list1.Terrorists[j].getKillstatus()>list1.Terrorists[i].getKillstatus())
	            	{
	            		temp=list1.Terrorists[i];
	            		list1.Terrorists[i]=list1.Terrorists[j];
	            		list1.Terrorists[j]=temp;
	            	}

	            }
	            }
	            
	            
	            for(int i=0;i<n;i++)
	            { 

	             for(int j=i+1;j<n;j++)
	             {

	            	if(list2.CounterTerrorists[j].getKillstatus()>list2.CounterTerrorists[i].getKillstatus())
	            	{
	            		temp=list2.CounterTerrorists[i];
	            		list2.CounterTerrorists[i]=list2.CounterTerrorists[j];
	            		list2.CounterTerrorists[j]=temp;
	            	}

	            }
	            }
		}







	public static void AImove(double x,double y,double speed,double gx,double gy,Terrorists list1,CounterTerrorists list2,int flag,int tn)
	{
		double lx=gx-x;
		double ly=gy-y;
		double ux=Math.sqrt(gx-x);
		double uy=Math.sqrt(gy-y);
		lx=lx/ux;
		ly=ly/uy;
		lx=speed*lx;
		ly=speed*ly;
		if(flag==0)
		{
		list1.Terrorists[tn].setXaxis(x+lx);
		list1.Terrorists[tn].setYaxis(y+ly);
		if(list1.Terrorists[tn].getBehaviour().equals("AggressivePlayers"))
		{
    	Player a3= new Agg("Terrorists",list1,list2,tn);
		}
		if(list1.Terrorists[tn].getBehaviour().equals("CautionsPlayers"))
		{
    	Player a3= new Caution("Terrorists",list1,list2,tn);
		}
		if(list1.Terrorists[tn].getBehaviour().equals("BlindPlayers"))
		{
    	Player a3= new Blind("Terrorists",list1,list2,tn);
		}
		}
		
		if(flag==1)
		{
		list2.CounterTerrorists[tn].setXaxis(x+lx);
		list2.CounterTerrorists[tn].setYaxis(y+ly);
		if(list2.CounterTerrorists[tn].getBehaviour().equals("AggressivePlayers"))
		{
    	Player a3= new Agg("CounterTerrorists",list1,list2,tn);
		}
		if(list2.CounterTerrorists[tn].getBehaviour().equals("CautionsPlayers"))
		{
    	Player a3= new Caution("CounterTerrorists",list1,list2,tn);
		}
		if(list2.CounterTerrorists[tn].getBehaviour().equals("BlindPlayers"))
		{
    	Player a3= new Blind("CounterTerrorists",list1,list2,tn);
		}	
		}
	}
	public static void site(double x,double y,Terrorists list1,CounterTerrorists list2,int m,int n,int flag,int tn)
	{
		if(flag==0)
		{
			double alpha=list1.Terrorists[tn].getAngle();
			double theta=Math.atan2(y,x);
			for(int i=0;i<n;i++)
			{   if(list2.CounterTerrorists[i].getIsdead()==0)
			{
				double px=list2.CounterTerrorists[i].getXaxis();
				double py=list2.CounterTerrorists[i].getYaxis();
				double gamma=Math.atan2((py-y),(px-x));
				if(Math.cos(theta-gamma) > Math.cos(alpha))
				{
					int hit=list2.CounterTerrorists[i].getHitstatus();
				    hit++;
				    list2.CounterTerrorists[i].setHitstatus(hit);
				    int kill=list1.Terrorists[tn].getKillstatus();
				    kill++;
				    list1.Terrorists[tn].setKillstatus(kill);
				    break;
				}
			}
			}
		}
		if(flag==1)
		{
			double alpha=list2.CounterTerrorists[tn].getAngle();
			double theta=Math.atan2(y,x);
			for(int i=0;i<m;i++)
			{   if(list1.Terrorists[i].getIsdead()==0)
			{
				double px=list1.Terrorists[i].getXaxis();
				double py=list1.Terrorists[i].getYaxis();
				double gamma=Math.atan2((py-y),(px-x));
				if(Math.cos(theta-gamma) > Math.cos(alpha))
				{
					int hit=list1.Terrorists[i].getHitstatus();
				    hit++;
				    list1.Terrorists[i].setHitstatus(hit);
				    int kill=list2.CounterTerrorists[tn].getKillstatus();
				    kill++;
				    list2.CounterTerrorists[tn].setKillstatus(kill);
				    break;
				}
			}
			}
			
		}
	}
	
    public static void play(Terrorists list1,CounterTerrorists list2,int m,int n,double reachx,double reachy)
    {
    	int tn=0;
    	int ctn=0;
    	if(m>n)
    	System.out.println("Terrorists Won this Match");
    	else 
    		System.out.println("CounterTerrorists Won this Match");
    	while(true)
    	{
    	if(list1.Terrorists[tn].getGameBasis().equals("Energylevel"))
    		
    	SortbyEnergylevel(list1,list2,m,n);
    	if(list1.Terrorists[tn].getGameBasis().equals("Success"))
    	SortbySuccess(list1,list2,m,n);
    	if(list1.Terrorists[tn].getStrategy().equals("Nearest"))	
    	{
    	    Strategy a4= new Nearest("Terrorists",list1,list2,tn,m,n);	
    	}
    	if(list1.Terrorists[tn].getStrategy().equals("Random"))	
    	{
    		Strategy a4= new Random1("Terrorists",list1,list2,tn,m,n);	
    	}
    	if(list1.Terrorists[tn].getStrategy().equals("Ahead"))	
    	{
    		Strategy a4= new Ahead("Terrorists",list1,list2,tn,m,n);	
    	}
    	if(list1.Terrorists[tn].getStrategy().equals("Bomb"))	
    	{
    		list1.Terrorists[tn].setDesxaxis(reachx);
    		list1.Terrorists[tn].setDesyaxis(reachy);
    	}
    	site(list1.Terrorists[tn].getXaxis(),list1.Terrorists[tn].getYaxis(),list1,list2,m,n,0,tn);
    	AImove(list1.Terrorists[tn].getXaxis(),list1.Terrorists[tn].getYaxis(),list1.Terrorists[tn].getSpeed(),list1.Terrorists[tn].getDesxaxis(),list1.Terrorists[tn].getDesyaxis(),list1,list2,0,tn);
    	tn++;
    	
    	
    	if(list2.CounterTerrorists[ctn].getGameBasis().equals("Energylevel"))
    		
        	SortbyEnergylevel(list1,list2,m,n);
        	if(list2.CounterTerrorists[ctn].getGameBasis().equals("Success"))
        	SortbySuccess(list1,list2,m,n);
    	if(list2.CounterTerrorists[ctn].getStrategy().equals("Nearest"))	
    	{
    	    Strategy a4= new Nearest("CounterTerrorists",list1,list2,ctn,m,n);	
    	}
    	if(list2.CounterTerrorists[ctn].getStrategy().equals("Random"))	
    	{
    		Strategy a4= new Random1("CounterTerrorists",list1,list2,ctn,m,n);	
    	}
    	if(list2.CounterTerrorists[ctn].getStrategy().equals("Ahead"))	
    	{
    		Strategy a4= new Ahead("CounterTerrorists",list1,list2,ctn,m,n);	
    	}
    	
    	site(list2.CounterTerrorists[ctn].getXaxis(),list2.CounterTerrorists[ctn].getYaxis(),list1,list2,m,n,0,ctn);
    	AImove(list2.CounterTerrorists[ctn].getXaxis(),list2.CounterTerrorists[ctn].getYaxis(),list2.CounterTerrorists[ctn].getSpeed(),list2.CounterTerrorists[ctn].getDesxaxis(),list2.CounterTerrorists[ctn].getDesyaxis(),list1,list2,0,ctn);
    	ctn++;
    	if(tn==m) tn=0;
    	if(ctn==n) ctn=0;
    	
    	
    	int flag1=0;
    	for(int ix=0;ix<m;ix++)
    	{
    		if(list1.Terrorists[ix].getIsdead()==0)
    		{
    			flag1=1;
    			break;
    		}
    	}
    	int flag2=0;
    	for(int ix=0;ix<n;ix++)
    	{
    		if(list2.CounterTerrorists[ix].getIsdead()==0)
    		{
    			flag2=1;
    			break;
    		}
    	}
    	if(flag1==0)
    	{
    		System.out.println("Terrorists Won this Match");
    		break;
    	}
    	if(flag2==0)
    	{
    		System.out.println("CounterTerrorists Won this Match");
    		break;
    	}
    	}
    	
    }
	
}

	
	
	

