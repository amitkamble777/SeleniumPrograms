package OPPS;

class name{
	void name()
	{
		System.out.println("Employee Name");
	}
}

class city extends name {
	void city()
	{
		System.out.println("Loacation is banglore");
	}
}

public class Singlelevel {

	public static void main(String[] args) {
		city location= new city();
		location.name();
		location.city();

	}

}
