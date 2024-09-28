package This;

public class currentMethod {
	
	
void display()
{
System.out.println("this display method Agile labs pvt ltd");
}

void show()
{
display();	
System.out.println("Show methos");
//display();
}


	public static void main(String[] args) {
		currentMethod ab= new currentMethod();
		ab.show();

	}

}
