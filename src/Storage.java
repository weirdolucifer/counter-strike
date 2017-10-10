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




