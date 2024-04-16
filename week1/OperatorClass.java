package week1;

public class OperatorClass {
    public static void main(String[] args) {
        //Arithmetic Operation
        int a=10,b=20;
        int sum=a+b; //here + is an arithmetic Operation
        System.out.println("the sum is "+sum);

        System.out.println("the difference is "+ (a-b));
        System.out.println("the multiplication is"+(a*b));
        System.out.println("the division is "+(a/b));
        System.out.println("the modulo is "+ (a%b));

        //Assignment Operator
        //Declaration  and assignment
        int number1=10;
        int number2;
        //Assignment after declaration
        number2=20;
        //Assign value using += 

        System.out.println ("Number2 after using += is "+(number2+=10));
        //assign using *=
        number2 *=100;// this is same as doing number2=number2*100
        System.out.println("Number2 after using *= is "+number2);

        //Relational Operators
        int rNumber1=9, rNumber2=20;
        System.out.println("Is rNumber1 equals to rNumber2? "+ (rNumber1 == rNumber2));
        System.out.println("Is rNumber1 less than rNumber2? "+ (rNumber1<rNumber2));
        System.out.println("Is rNumber1 greater or equals to rNumber2? "+(rNumber1>=rNumber2));
        System.out.println("Is rNumber1 and rNubmer1 not equals to rNumber2? "+(rNumber1!=rNumber2));

        //Logical Operators
        int lNumber1=20, lNumber2=22;
        boolean expression1=lNumber1 == lNumber2;
        boolean expression2= lNumber1>lNumber2;
        System.out.println("And expression using && "+(expression1 && expression2));
        System.out.println("Or expression using || "+ (expression1 || expression2));
        System.out.println("Not expression using ! "+ (!expression1));

        //Unary Operator
        int uNumber1=10;
        uNumber1++; //same as uNumber1=uNumber1+1
        System.out.println("Unary operator using ++ "+ uNumber1); 

        uNumber1--; //same as uNumber1=uNumber-1
        System.out.println("Unary operation using -- " +uNumber1);

        //Ternary Operator
        int tNumber1=20, tNumber2=20;
        boolean tExpression1=tNumber1==tNumber2;
        /*For Ternary, First hyou define expression, if expression is true
        it returns value after "?"
        if the expression is false
        it returns the value after ":"
        syntax 
        expression ? true statement : false statement
         */

        String output= tExpression1 ?"True Condition": "False Condition";
        /*Further be seen as 
         * String output
         * if (tExpression1){
         * output= "True Condition";
         * }else{
         * output= "False Condition"
         * }
         */
        int numberOutput = tNumber2 > tNumber2 ? 10 :20;
        System.out.println(output);
        System.out.println(numberOutput);

        /*Task 1
         * 
         * write a program to print whether a variable is greater or equal to 18
         */
        int tsNumber1=35;
        boolean tsExpression=tsNumber1==18;
        System.out.println(tsExpression);

         /*Task2
          * Write a program to print simple interest from variables
          * make 3 variables for amount, time and rate and save the calculation into a variable 
          * formula:
          * SI= amount * time * rate/100;

          */
          int amount=5, time=4, rate=15;
          double SI= amount*time*rate/100;
          System.out.println("Simple interest is "+ SI);

          /*Task 3 
          write a program to print the area and perimeter of rectangle
          a=l*b
          p=2(l+b)
           */
          int length=5, bredth=4;
          int area=length*bredth;
          System.out.println("the area of rectangle is "+area);


          int perimeter=2*(length+bredth);
          System.out.println("the perimeter of rectangle is "+ perimeter);

          /*Task 4
           * complete the task 1 using ternary operators
           */
         
         
         int  terNumber1=35, terNumber2=18;
         boolean exp=terNumber1== terNumber2;

         String output1= exp ? "true condition":"False Condition";
         System.out.println(output1);



    }
    
}
