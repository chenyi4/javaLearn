public class ForArr {
    public static void PrintArray(int [] array){
        for(int i = 0; i < array.length; i++){
            System.out.println("====="+array[i]+"======"+"\n");
        }
    }
    
    public static void Tstd(){
        int size = 10;
        double [] myList = new double[size];
        myList[0] = 2.5;
        System.out.println("=="+myList[0]+"\n");
    }

    public static void main(String args[]){
        double [] myList = {1.9, 2.9, 3.4, 3.5};
        double x = 0;
        for(int i = 0; i < myList.length; i++){
            x = x + myList[i];
        }
        System.out.println("Total is "+x);

        double max = 0;
        for(int i = 0; i < myList.length; i++){
            if(max < myList[i]){
                max = myList[i];
            }
        }
        System.out.println("Max is " + max);

        System.out.println("for Arr methos");

        for(double element: myList){
            System.out.println("==+++++=="+element);
        }

        System.out.println("\n");
        PrintArray(new int[]{11, 13, 12, 26, 24, 22, 5});
        Tstd();

    }
}