package This;

public class CurrentClass {
	int i;
	void setvlue(int i)
	{
		this.i=i;
	}
void show() 
{
System.out.println(i);	
	}
public static void main(String[] args) {
		CurrentClass abc= new CurrentClass();
       abc.show();
       abc.setvlue(10);
}

}
