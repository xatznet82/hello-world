package gr.haec.shapes;

	public class Shape {
	
	double area;
	double perimeter;
	String colour;
	
	public Shape(String colour) {
		this.colour=colour;
		System.out.println("����������� ��� �����...");
	}

	double getArea() {
		return area;
	}
	
	double getPerimeter() {
		return perimeter;
	}
	
	String getColour() {
		return colour;
	}
	
	void setArea () { 
		System.out.println(" ��������� �� ������� ��� �� ����� : ");
	}
	
	void setPerimeter () { 
		System.out.println(" ��������� �� ��������� ��� �� ����� : ");
	}
	
	void setColour () { 
		System.out.println(" ��������� �� ����� ��� �� ����� : ");
	}

}
