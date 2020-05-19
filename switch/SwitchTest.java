public class SwitchTest {
    public static void main(String args[]){
        char grade = 'A';

        switch(grade)
        {
            case 'A':
                System.out.println("aaa"); 
                break;
            case 'B':
                System.out.println("absn");
                break; 
            default :
                System.out.println("优秀"); 
        }
        
        System.out.println("you grade is " + grade); 
    }
}