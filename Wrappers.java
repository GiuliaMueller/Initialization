package chapter1;
import java.util.HashMap;
public class Wrappers {
	public static void main(String[] args) {
		// Non-Number primitives
		boolean bl = true; 	char c = 'a';
		
		// Numeric primitives
		byte b = 123; 		short s = 123; 		int i = 123; 	long l = 123L;
		float f = 123.450F; double d = 123.456D;
		
		// Java provides Wrapper Classes for all primitive types
		Character cw = new Character(c);	
		Boolean blw = new Boolean(bl);
		
		// Display Number Wrapper's max value
		System.out.println("Byte max value:  " + new Byte(b).MAX_VALUE);	
		System.out.println("Short max value:  " + new Short(s).MAX_VALUE);	 
		System.out.println("Integer max value:  " + new Integer(i).MAX_VALUE);	
		System.out.println("Long max value:  " + new Long(l).MAX_VALUE);
		System.out.println();
		System.out.println("Float max value:  " + new Float(f).MAX_VALUE);	 
		System.out.println("Double max value:  " + new Double(d).MAX_VALUE);	
	}
}
