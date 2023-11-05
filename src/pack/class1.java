package pack;

public class class1 {

	public static void main(String[] args) {
		class1 moon	= new class1();
		moon.boy(500);
		moon.girl(500);
		moon.baby(200,300);
		moon.old(500, 5.99);
		moon.adult(500, 300, " Nasrin ", 'A');
	}
public int boy(int a) {
System.out.println(a);
return a;	
	
}
public int girl(int a) {
	System.out.println(a);
	return a;
	
}	
public int baby(int a, int b) {
	int c = a+b;
	System.out.println(c);
	return c;
	
}	
public double old(int a, double b) {

	System.out.println(a+b);
	return a+b;
	
}	
public String adult(int a, double b, String c, char d) {
System.out.println(a+b+c+d);
return (a+b+c+d);
}	
}
