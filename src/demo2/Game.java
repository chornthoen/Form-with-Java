package demo2;

public class Game {
	private int yournum;
	private  String type;
	private int machinenum;


	public Game() {
		this(3,"one");
		setMachinenum();
	}
	public void setMachinenum() {
	machinenum=0;
	if(getType().equalsIgnoreCase("one")) machinenum=getRandom(0,9);
	if(getType().equalsIgnoreCase("two")) machinenum=getRandom(10,99);
	if(getType().equalsIgnoreCase("three")) machinenum=getRandom(100,999);
		
	}
	private int getRandom(int min,int max) {
		return min+(int)(Math.random()*(max-min+1));
	}
	public int getMachinenum() {
		return machinenum;
	}


	public Game(int yournum, String type) {
		super();
		this.yournum = yournum;
		this.type = type;
		setMachinenum();
	}


	public int getYournum() {
		return yournum;
	}


	public void setYournum(int yournum) {
		this.yournum = yournum;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}
	public boolean play() {
		return getYournum()==getMachinenum();
	}
	public String toString() {
	return getYournum()+":"+getMachinenum()+" : "+	
	(play()? " Win!! ": "Lose!!")+"\n";
		
	}
	

}
