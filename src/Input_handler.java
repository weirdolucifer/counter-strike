import java.util.*;
public class Input_handler {

	public void  Inputhandler(){
	Scanner q= new Scanner(System.in);
    int no_of_terrorist,no_of_c_terrorist;
    Terrorists list1;
    no_of_terrorist=q.nextInt();
    list1=new Terrorists( no_of_terrorist);
    no_of_c_terrorist= q.nextInt();
    CounterTerrorists list2=new CounterTerrorists( no_of_c_terrorist);
    System.out.println("Mechanism?");
	String Mechanism=q.next();
    System.out.println("Input the coordinates of Bomb");
    double reachx=q.nextDouble();
    double reachy=q.nextDouble();
	Environment ob2 = new  Environment();
	

    System.out.println("Input the Name,Behaviour,Strategy and Energy Level, current position in x axis,current position in y axis,Range of player(angle),gamebasis and Speed of"+no_of_terrorist+"Terrorists");
    for(int i1=0; i1 < no_of_terrorist; i1++)
    {
    	  Storage a=new Storage(q.next(),"Terrorists",Mechanism,q.next(),q.next(),q.nextInt(),q.nextDouble(),q.nextDouble(),q.nextDouble(),0,0,q.next(),q.nextDouble(),0); 
          list1.add(a);
    }
    
    System.out.println("Input the Name,Behaviour,Strategy and Energy Level, current position in x axis,current position in y axis,Range of player(angle),gamebasis and Speed of"+no_of_c_terrorist+"CounterTerrorists");
    for(int i2=0;i2 < no_of_c_terrorist;i2++)
    {
    	  Storage a=new Storage(q.next(),"CounterTerrorists",Mechanism,q.next(),q.next(),q.nextInt(),q.nextDouble(),q.nextDouble(),q.nextDouble(),0,0,q.next(),q.nextDouble(),0);
    	  list2.add(a);
    }

    


    ob2.play(list1,list2,no_of_terrorist,no_of_c_terrorist,reachx,reachy);
		
	}


}
