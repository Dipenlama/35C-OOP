package Tasks;

public class SwitchCase {
    public static void main(String [] args){
        char value='a';
        int numVal=10;
        switch (value) {
            case 'a':
            //nested switch
            switch (numVal) {
                case 10:
                    System.out.println("10");
                    break;
            
                default:
                    System.out.println("Default");
                    break;
            }
                System.out.println("apple");
                break;
            case 'b':
                System.out.println("Ball");
                break;
            case 'c':
                System.out.println("cat");
                break;
            case 'd':
                System.out.println("Dog");
                break;
            default:
                System.out.println("No word found");
                break;
        }

        /*Task
         * Consider the variable week in int
         * if tha value is 
         * 0 - print sunday
         * 1 - print monday
         * 2 - print tuesday
         * 3 - print wednesday
         * 4 - print thursday
         * 5 - print friday
         * 6 - print saturday
         * if the value is other than these print invalid week
         */
        int weekday=3;
        //check the weekday in switch
        switch (weekday) {
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
            default:
                System.out.println("invalid int");
                break;
        }
        
    }
    
}
