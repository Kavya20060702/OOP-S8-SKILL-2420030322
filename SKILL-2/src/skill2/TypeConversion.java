package skill2;

public class TypeConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        // 1. Implicit Type Conversion (Widening)
		        int intVal = 100;
		        long longVal = intVal;      // int to long
		        float floatVal = longVal;   // long to float

		        System.out.println("Implicit Type Conversion:");
		        System.out.println("int value: " + intVal);
		        System.out.println("Converted to long: " + longVal);
		        System.out.println("Converted to float: " + floatVal);

		        // 2. Explicit Type Conversion (Narrowing)
		        double doubleVal = 99.99;
		        int narrowedInt = (int) doubleVal; // double to int (fraction lost)
		        char charVal = (char) intVal;      // int to char

		        System.out.println("\nExplicit Type Conversion:");
		        System.out.println("double value: " + doubleVal);
		        System.out.println("Converted to int (narrowed): " + narrowedInt);
		        System.out.println("int value converted to char: " + charVal);

		        // 3. Casting float to byte (overflow example)
		        float f = 130.55f;
		        byte b = (byte) f; // overflow may happen

		        System.out.println("\nCasting float to byte:");
		        System.out.println("float value: " + f);
		        System.out.println("Converted to byte (overflow): " + b);
		


	}

}
