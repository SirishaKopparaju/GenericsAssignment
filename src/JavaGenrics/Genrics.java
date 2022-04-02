package JavaGenrics;

public class Genrics<T> {
	private T[] inputArray;
	public Genrics(T[] inputArray) {
		this.inputArray=inputArray;
	}
	public void toPrint() {
		Genrics.toPrint(this.inputArray);
	}

public static <E> void toPrint(E[] inputArray) {
	for(E element:inputArray) {
		System.out.printf("%s",element);
		
	}
	System.out.println();
}

public static void main(String[]args) {
	Integer[] intArray = {1,2,3,4,5} ;
	Double[] doubleArray = {1.1,2.2,3.3,4.4};
	Character[] charArray = {'H','E','L','L','O'};
	new Genrics(intArray).toPrint();
	Genrics.toPrint(doubleArray);
	Genrics.toPrint(charArray);


	
}
}
