package Tasks;

public class Ifstatement {
    public static void main(String[] args) {
        // Simple if statement, takes condition/expression with boolean value
        if(true){
            System.out.println("true statement");

        }
        if(false){
            System.out.println("skipped statement");
        
        }
        //if condition fails, goes to else block/scope
        int num1=10, num2=20;
        if (num1>num2){
            System.out.println("num1 is greater");    
        }else{
            System.out.println("num2 is greater");
        }
        //if else if 
        int iNum1=10,iNum2=10;
        if(iNum1==iNum2){
            System.out.println("equal number");

        }else if (iNum1>iNum2){
            System.out.println("iNum is greater");

        }else{
            System.out.println("Inum2 is greater");
        }

        // note that else should be at the last of the statement
        // if Else If ladder, more that one else if 
        if (iNum1<0){
            System.out.println("iNum1 is negative");
        }else if (iNum2<0){
            System.out.println("inum2 is negative");
        }else if(iNum1==iNum2){
            System.out.println("Equal number");
        }else if (iNum1<iNum2){
            System.out.println("inum1 is less");
        }else{
            System.out.println("Default execution if all fails");
        }
        

        //note that else is not mandatory and can be skipped
        //Question
        int q1=10,q2=10;
        if (q1>=q2){
            System.out.println("1st statement");
        }else if (q1==q2){
            System.out.println("2nd statement");

        }else{
            System.out.println("3rd statement");
        }

        //nested if statement
        int nNum1=-10,nNum2=20;
        if (nNum1<0){
            if(nNum1>nNum2){
                System.out.println("nNum1 is negative and greater");
            }else{
                System.out.println("nNum1 is negative and lesser");
            }
        }else {
            if (nNum1>nNum2){
                System.out.println("nNum1 is positive and greater");
            }else{
                System.out.println("nNUm1 is positive and lesser");
            }
        }
        /*Task
         * Given the value below, add the total and take the average
         * if any of the marking is less than 35, print "Fail"
         * if average is less than 60, print "3rd div"
         * if average is less than 70, print "2nd div"
         * if average is greater than or equal to 80, print "distinction"
         */
        int math =38,science=60,english=35;
        //make total variable and average variable
        int total=math+science+english;
        int average=total/3;

        if (math<35 | science<35 | english<35){
            System.out.println("Fail");
        }else if (average<60){
            System.out.println("3rd div");
        }else if (average<70){
            System.out.println("2nd div");
        }else if(average>=80){
            System.out.println("distinction");
        }
        
    }
    
}
