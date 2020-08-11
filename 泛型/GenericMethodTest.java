public class GenericMethodTest{
    public static < E > void printArray(E[] inputArray){
        for(E element: inputArray){
            System.out.printf( "%s ", element );
        }
        System.out.println();
    }

    public static void main( String args[] ){
        Integer[] intArray = { 1, 2, 3, 6, 8, 10, 12, 11};
        Double[] doubleArray = { 1.1, 2.2, 4.5, 6.9, 12.12, 3.33};
        Character[] CharaArray = { 'A', 'B','C', 'D','E','f'};
        System.out.println( "testNameIs");
        printArray( intArray );
        printArray( doubleArray );
        printArray( CharaArray );
    }
}