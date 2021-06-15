package assignment;
import java.util.*;
public class utility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Enter two Numbers");
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
calculator c=new calculator();
System.out.println(a+"+"+b+"="+c.add(a, b));
System.out.println(a+"-"+b+"="+c.sub(a, b));
System.out.println(a+"/"+b+"="+c.divide(a, b));
System.out.println(a+"*"+b+"="+c.multiply(a, b));
System.out.println("Square root of "+a+"="+c.sq(a));
System.out.println("Square root of "+b+"="+c.sq(b));
System.out.println("Percent of "+a+"="+c.per(a));
System.out.println("Percent of "+a+"="+c.per(b));
	}

}
