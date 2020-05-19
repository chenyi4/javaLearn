public class TestArray2 {
    public static void printArray(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }

    public static void main(String[] args){
        double [] myList = { 1.2, 3.5, 4.5, 5.6, 7.0};
        for(int i = 0; i < myList.length; i++){
            System.out.println(myList[i]);
        }

        double total = 0;
        for(int i = 0; i < myList.length; i++){
            total = total + myList[i];
        }
        System.out.println("Total is "+total);

        double max = myList[0];        
        for(int i = 0; i < myList.length; i++){
            if(myList[i] > max) max = myList[i]; 
        }   
        System.out.println("Max is " + max);

        double [] myTestList = { 1.9, 2.9, 3.4, 3.5 };
        for(double element: myTestList){
            System.out.println(element);
        }

        printArray(new int[] { 3, 1, 2, 6, 4, 2});
    }
}