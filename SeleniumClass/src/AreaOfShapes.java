public class AreaOfShapes {

	
	int radius,length,breadth,height,area;
	void display(){
		System.out.println("Area :" +area);		

	}

}

class Circle extends AreaOfShapes {
	void display(){
		System.out.println("radius :" +radius);		

	}
	void inputParam(){
	radius = 100;
	area = (radius*radius);
	super.display();
	
	}
	
}
class Traingle extends AreaOfShapes {
	void inputParam(){
	length = 100;
	breadth = 10;
	area = (length*breadth);
	display();
	}
	
}
