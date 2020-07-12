
public class ThisKey {
	int a,b;
	
	void input(int a, int b)
	{
	this.a = a;
	this.b = b;
	display();
	}

	void display()
	{
		System.out.println(a);
		System.out.println(b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisKey sample = new ThisKey();
		sample.input(250,100);
		sample.display();
	}

}
