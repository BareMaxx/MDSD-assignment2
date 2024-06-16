package math_expression;
public class Test29 {
	public int x;
	public int y;
	
	private External external;
	
	public Test29(External external) {
		this.external = external;
	}
	
	public void compute() {
		x = external.pow(4,2);
		y = (external.pow(4,2) - 2);
	}
	
	public interface External {
		public int pow(int a,int b);
	}	
	
}
