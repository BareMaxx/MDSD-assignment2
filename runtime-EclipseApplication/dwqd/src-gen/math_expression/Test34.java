package math_expression;
public class Test34 {
	public int sideA;
	public int sideB;
	public int sideC;
	public int perimeterTriangle;
	public int radius;
	public int perimeterCircle;
	
	private External external;
	
	public Test34(External external) {
		this.external = external;
	}
	
	public void compute() {
		sideA = 3;
		sideB = 4;
		sideC = external.sqrt((external.pow(3,2) + external.pow(4,2)));
		perimeterTriangle = ((3 + 4) + external.sqrt((external.pow(3,2) + external.pow(4,2))));
		radius = 5;
		perimeterCircle = ((2 * 5) * external.pi());
	}
	
	public interface External {
		public int pow(int a,int b);
		public int sqrt(int a);
		public int pi();
	}	
	
}
