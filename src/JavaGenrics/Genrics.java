package JavaGenrics;

public class Genrics {
private static Genrics PrintArray;
public static void toPrint(Integer[] inputArray) {
	for(int element:inputArray) {
		System.out.printf("%s",element);
		
	}
	System.out.println();
}
public static void toPrint(double[] inputArray) {
	for(double element:inputArray) {
		System.out.printf("%s",element);
		
	}
	System.out.println();
}
public static void toPrint(Character[] inputArray) {
	for(char element: inputArray) {
		System.out.printf("%s",element);
		
	}
	System.out.println();
}
public static void main(String[]args) {
	Integer[] intArray = {1,2,3,4,5} ;
	double[] doubleArray = {1.1,2.2,3.3,4.4};
	char[] charArray = {'H','E','L','L','O'};
	PrintArray.toPrint(intArray);
	PrintArray.toPrint(doubleArray);

	
	
	
}


}
