
public class SectionAssignment2{

	public static void main(String[] args) {
		int a, b=1, c=1;
		a=0;
		
		System.out.print("1 1 ");
		while(a<10000) {
			a=b+c;
			System.out.print(a+ " ");
			b=c;
			c=a;
		}
	}
}
