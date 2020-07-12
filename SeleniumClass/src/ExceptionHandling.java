import java.io.IOException;

public class ExceptionHandling {
	
	int num1=200,num2=0,div;
	
	void division(){
		try{
		div = num1/num2;
		System.out.println(div);
		}catch(Exception e){
			e.printStackTrace();	
		}finally{
			System.out.println("finally used for closing");
		}
		
	}
	
	void show(){
		System.out.println("I am in show method");
	}

	void chkEligibleVoting(int age) throws ThrowExample{
		if(age>18){
			System.out.println("Eligible for vote");
		}else{
			throw new ThrowExample("Not eligible for vote");
		}
		
	}
	public static void main(String[] args) throws InterruptedException, IOException, ThrowExample {
		// TODO Auto-generated method stub
		ExceptionHandling eh = new ExceptionHandling();
		eh.division();
		Thread.sleep(3000);
		//FileInputStream fi = new FileInputStream("");
		eh.show();
		//fi.close();
		eh.chkEligibleVoting(15);
	}

}
