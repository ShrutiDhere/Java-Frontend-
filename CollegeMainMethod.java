// using public access specifier


package Access_Specifier;

public class CollegeMainMethod {

	public static void main(String[] args) {
		
		
		college c=new college();
		System.out.println("college name is = " + (c.name="pratibha"));
		System.out.println("College city is = " + (c.city="pune"));
		
		c.course();
	}
}
