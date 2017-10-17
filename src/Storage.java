import java.util.Scanner;
public class Storage {

	String Player_name;
	String Mechanism,Behaviour,Strategy,Player,GameBasis;
	
	int Energy_level,isdead,hitstatus,killstatus;
	double xaxis,yaxis,angle,speed, desxaxis,desyaxis;
	Storage(){}
	Storage(String Player_name,String Player,String Mechanism,String Behaviour,String Strategy,int Energylevel,double xaxis,double yaxis,double angle,int isdead,int hitstatus,String GameBasis,double speed,int killstatus)
	{
		this.setPlayer_name(Player_name);
		this.setMechanism(Mechanism);
        this.setBehaviour(Behaviour);
		this.setStrategy(Strategy);
		this.setPlayer(Player);
        this.setEnergy_level(Energylevel);
        this.setGameBasis(GameBasis);
        this.setSpeed(speed);
        this.setKillstatus(killstatus);

	}
   
	public int getKillstatus() {
		return killstatus;
	}
	public void setKillstatus(int killstatus) {
		this.killstatus = killstatus;
	}
	public double getDesxaxis() {
		return desxaxis;
	}

	public void setDesxaxis(double desxaxis) {
		this.desxaxis = desxaxis;
	}

	public double getDesyaxis() {
		return desyaxis;
	}

	public void setDesyaxis(double desyaxis) {
		this.desyaxis = desyaxis;
	}

	public String getGameBasis() {
		return GameBasis;
	}

	public void setGameBasis(String gameBasis) {
		GameBasis = gameBasis;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public int getIsdead() {
		return isdead;
	}
	public void setIsdead(int isdead) {
		this.isdead = isdead;
	}

	public int getHitstatus() {
		return hitstatus;
	}

	public void setHitstatus(int hitstatus) {
		this.hitstatus = hitstatus;
	}

	public double getXaxis() {
		return xaxis;
	}

	public void setXaxis(double xaxis) {
		this.xaxis = xaxis;
	}

	public double getYaxis() {
		return yaxis;
	}

	public void setYaxis(double yaxis) {
		this.yaxis = yaxis;
	}

	public double getAngle() {
		return angle;
	}

	public void setAngle(double angle) {
		this.angle = angle;
	}
	
	public int getEnergy_level() {
		return Energy_level;
	}

	public void setEnergy_level(int energy_level) {
		Energy_level = energy_level;
	}

	public String getPlayer() {
		return Player;
	}
	public void setPlayer(String player) {
		Player = player;
	}
	public String getPlayer_name() {
		return Player_name;
	}
	public void setPlayer_name(String player_name) {
		Player_name = player_name;
	}
	public String getMechanism() {
		return Mechanism;
	}
	public void setMechanism(String mechanism) {
		Mechanism = mechanism;
	}
	public String getBehaviour() {
		return Behaviour;
	}
	public void setBehaviour(String behaviour) {
		Behaviour = behaviour;
	}
	public String getStrategy() {
		return Strategy;
	}
	public void setStrategy(String strategy) {
		Strategy = strategy;
	}
	
	
}


	class Node
	{
	    protected int data;
	    protected Node link;
	 
	    /*  Constructor  */
	    public Node()
	    {
	        link = null;
	        data = 0;
	    }    
	    /*  Constructor  */
	    public Node(int d,Node n)
	    {
	        data = d;
	        link = n;
	    }    
	    /*  Function to set link to next Node  */
	    public void setLink(Node n)
	    {
	        link = n;
	    }    
	    /*  Function to set data to current Node  */
	    public void setData(int d)
	    {
	        data = d;
	    }    
	    /*  Function to get link to next node  */
	    public Node getLink()
	    {
	        return link;
	    }    
	    /*  Function to get data from current Node  */
	    public int getData()
	    {
	        return data;
	    }
	}
	 
	/* Class linkedList */
	class linkedList
	{
	    protected Node start;
	    protected Node end ;
	    public int size ;
	 
	    /*  Constructor  */
	    public linkedList()
	    {
	        start = null;
	        end = null;
	        size = 0;
	    }
	    /*  Function to check if list is empty  */
	    public boolean isEmpty()
	    {
	        return start == null;
	    }
	    /*  Function to get size of list  */
	    public int getSize()
	    {
	        return size;
	    }    
	    /*  Function to insert an element at begining  */
	    public void insertAtStart(int val)
	    {
	        Node nptr = new Node(val, null);    
	        size++ ;    
	        if(start == null) 
	        {
	            start = nptr;
	            end = start;
	        }
	        else 
	        {
	            nptr.setLink(start);
	            start = nptr;
	        }
	    }
	    /*  Function to insert an element at end  */
	    public void insertAtEnd(int val)
	    {
	        Node nptr = new Node(val,null);    
	        size++ ;    
	        if(start == null) 
	        {
	            start = nptr;
	            end = start;
	        }
	        else 
	        {
	            end.setLink(nptr);
	            end = nptr;
	        }
	    }
	    /*  Function to insert an element at position  */
	    public void insertAtPos(int val , int pos)
	    {
	        Node nptr = new Node(val, null);                
	        Node ptr = start;
	        pos = pos - 1 ;
	        for (int i = 1; i < size; i++) 
	        {
	            if (i == pos) 
	            {
	                Node tmp = ptr.getLink() ;
	                ptr.setLink(nptr);
	                nptr.setLink(tmp);
	                break;
	            }
	            ptr = ptr.getLink();
	        }
	        size++ ;
	    }
	   
	    public void deleteAtPos(int pos)
	    {        
	        if (pos == 1) 
	        {
	            start = start.getLink();
	            size--; 
	            return ;
	        }
	        if (pos == size) 
	        {
	            Node s = start;
	            Node t = start;
	            while (s != end)
	            {
	                t = s;
	                s = s.getLink();
	            }
	            end = t;
	            end.setLink(null);
	            size --;
	            return;
	        }
	        Node ptr = start;
	        pos = pos - 1 ;
	        for (int i = 1; i < size - 1; i++) 
	        {
	            if (i == pos) 
	            {
	                Node tmp = ptr.getLink();
	                tmp = tmp.getLink();
	                ptr.setLink(tmp);
	                break;
	            }
	            ptr = ptr.getLink();
	        }
	        size-- ;
	    }    
	   
	    public void display()
	    {
	        System.out.print("\nSingly Linked List = ");
	        if (size == 0) 
	        {
	            System.out.print("empty\n");
	            return;
	        }    
	        if (start.getLink() == null) 
	        {
	            System.out.println(start.getData() );
	            return;
	        }
	        Node ptr = start;
	        System.out.print(start.getData()+ "->");
	        ptr = start.getLink();
	        while (ptr.getLink() != null)
	        {
	            System.out.print(ptr.getData()+ "->");
	            ptr = ptr.getLink();
	        }
	        System.out.print(ptr.getData()+ "\n");
	    }
	}
	 
 class SinglyLinkedList
	{    
	    public static void main(String[] args)
	    {             
	        Scanner scan = new Scanner(System.in);
	      
	        linkedList list = new linkedList(); 
	        System.out.println("Singly Linked List Test\n");          
	        char ch;
	     	 do
	        {
	            System.out.println("\nSingly Linked List Operations\n");
	            System.out.println("1. insert at begining");
	            System.out.println("2. insert at end");
	            System.out.println("3. insert at position");
	            System.out.println("4. delete at position");
	            System.out.println("5. check empty");
	            System.out.println("6. get size");            
	            int choice = scan.nextInt();            
	            switch (choice)
	            {
	            case 1 : 
	                System.out.println("Enter integer element to insert");
	                list.insertAtStart( scan.nextInt() );                     
	                break;                          
	            case 2 : 
	                System.out.println("Enter integer element to insert");
	                list.insertAtEnd( scan.nextInt() );                     
	                break;                         
	            case 3 : 
	                System.out.println("Enter integer element to insert");
	                int num = scan.nextInt() ;
	                System.out.println("Enter position");
	                int pos = scan.nextInt() ;
	                if (pos <= 1 || pos > list.getSize() )
	                    System.out.println("Invalid position\n");
	                else
	                    list.insertAtPos(num, pos);
	                break;                                          
	            case 4 : 
	                System.out.println("Enter position");
	                int p = scan.nextInt() ;
	                if (p < 1 || p > list.getSize() )
	                    System.out.println("Invalid position\n");
	                else
	                    list.deleteAtPos(p);
	                break;
	            case 5 : 
	                System.out.println("Empty status = "+ list.isEmpty());
	                break;                   
	            case 6 : 
	                System.out.println("Size = "+ list.getSize() +" \n");
	                break;                         
	             default : 
	                System.out.println("Wrong Entry \n ");
	                break;   
	            }
	            /*  Display List  */ 
	            list.display();
	            System.out.println("\nDo you want to continue (Type y or n) \n");
	            ch = scan.next().charAt(0);                        
	        } while (ch == 'Y'|| ch == 'y');               
	    }
	}


