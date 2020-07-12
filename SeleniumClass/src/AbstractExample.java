
abstract public class AbstractExample {

	abstract void prepaidMobile();
	abstract void postpaidMobile();
}


class Impl extends AbstractExample{

	@Override
	void prepaidMobile() {
		System.out.println("Prepay mobile to avoid disconnection");
		
	}

	@Override
	void postpaidMobile() {
		System.out.println("Postpay mobile to avoid disconnection");
		
	}
	
	
	
}