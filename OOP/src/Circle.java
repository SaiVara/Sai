
public class Circle {

	float Radius;
	float Diametre;
    double Area;
    double Perimeter;
	
	public Circle(float radius, float diametre) {
		this.Radius = radius;
		this.Diametre = diametre;

	}
	public void Area() {
		if(Radius>0) {
		this.Area=3.1416 * Radius *Radius ;
		System.out.println("The Area of given circle is "+this.Area);
	}else {
		System.out.println("Value Error:unable to calculate Area");
	}
	}
	public void Perimeter() {
		this.Perimeter=3.1416 * Diametre;
		System.out.println("The perimeter of given circle is "+this.Perimeter);
	}

	public static void main(String[] args) {
		Circle Ground=new Circle(-50,100);
		Ground.Area();
		Ground.Perimeter();
	}

}
