
public class CalcArea {

	public static void main(String[] args) {
		int a;
		int b;
		a=5;
		b=5;
		int areaRectangle;
		int areaTriangle;
		DoAreaCalc result=new DoAreaCalc();
		areaRectangle=result.Rectangle(a, b);
		areaTriangle=result.Triangle(a, b);
		
		System.out.println("Retangle" + areaRectangle);
		System.out.println("Retangle" + areaTriangle);		
	}

}
