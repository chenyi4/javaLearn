public class GetMax {
    public static int max(int num1, int num2){
        int result;
        if(num1 > num2){
            result = num1;
        }else{
            result = num2;
        }
        return result;
    }

    public static void main(String args[]){
        int maxData = max(2, 3);
        System.out.println(maxData);

        printGrade(78.9);
    }

    public static void printGrade(double score){
        if(score >= 90.00 ){
            System.out.println('A');
        }
        else if(score >= 80.00){
            System.out.println('B');
        }
        else if(score >= 70.00){
            System.out.println('C');
        }
        else if(score >= 60.00){
            System.out.println('D');
        }else{
            System.out.println('F');
        }
    }
}