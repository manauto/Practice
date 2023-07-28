package DataType;

public class Numericandnondecimal {
	
	public static void main(String [] args) {

	//Primitive data type
	
	//1.Byte Data type----> 1 Byte -128 to 127
	
	//Syntax--Data type VariableName=Value;
	
	//1.Must not begin with a digit.
	//2.Should not be a keyword.
	//3.white space is not allowed.
		
		byte b=50;
		byte b1=127;
		//byte b2=130;  //Not allowed  max value
		
		System.out.println("Byte Data type----"+b);
		System.out.println("Byte Data type max limit----"+b1);
		
		byte b2=-46;
		byte b3=-128;
		
		//byte b4=-129; not allowed
		
		System.out.println("Byte Data type-----"+b2);
		System.out.println("Byte data type min limit----"+b3);
		
		//2.short data type -2 byte -16 bits (-32768 to 32767)
		
		//syntax-datatype variable name=value;
		
		short S1=150;
		short S2=2000;
		short S3=32767;//Max limit
		//short S4=32768;//Not allowed
		
		System.out.println("Short data type----"+S1);
		System.out.println("short data type----"+S2);
		System.out.println("short data type max limit---"+S3);
	
		
		//3. int data type 4 byte--->32 bits-2147483648 to 2147483647
		
		//syntax-datatype variable name=value;
		
		int i1=120;
		int i2=32678;
		int i3=2147483647; // max limit
	//  int i4=2147483648; //not  

		System.out.println("int data type---"+i1);
		System.out.println("int data type---"+i2);
		System.out.println("int data type---"+i3);
		System.out.println();
		System.out.println("*********************");
		
		int i4=-2848444;
		int i5=-2147483648;//min limit
		//int i6=-2147483649;// not allowed
		
		System.out.println("int data type---------"+i4);//
		System.out.println("int data type min limit---"+i5);
		
		//4.long data type-8 byte-64 bit
		
		//syntax-Data type variablename=value;
		
		long L1=2147483646555l;
		long L2= 9223372036854775807l;//max limit
		//long L3=9223372036854775808l;//not allowed
		
		System.out.println("long data type----"+L1);
		System.out.println("long data type-----"+L2);
		
		long L4=-23456789;
		long L5=-9223372036854775808l;
		
		System.out.println("long data type-----"+L4);
		System.out.println("long data type------"+L5);
		
	}
}
		
		
