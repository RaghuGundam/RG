
public class ArrayVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int stdnos[] = new int[100];
       int j = 0;
     for(int i =100; j<= 99; i++ ){
    	 stdnos[j] = i;   	
    	 
       j++;
	}
     int k =0;
     for(int i =stdnos.length - 1; i >= 0; i-- ){ 
    	 
    	 
    	 System.out.println(stdnos[i]);
    	 if(stdnos[i]%2==0){
    		 k++;
    	 }
     } 
    	 System.out.println("Even numbers from 100 to 199 is:" + k);
     

}
}
