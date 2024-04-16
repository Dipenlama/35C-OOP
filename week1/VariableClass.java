package week1;
public class VariableClass{
    //Instance variable
    //needs object to access 
    //not shared in multiple object 
    int instanceVariable=10;
    /*static variable
     * No need objects, can be accessed using class
     * shared in multiple object
     */
}

public class VariableClass {
    public static void main (String[] args){
        //Non primitive data type
        //Declaration
        byte byteVariable;
        //initialization
        byteVariable=100;
        //Declaration and Initialization
        short shortVariable =1000;
        //multiple Declaration
        int intVariable1, intVariable2;
        //initialization
        intVariable1=10;
        intVariable2=10;
        //multiple Declaration and Initialization 
        long longVariable1=100000, longVariable2=-199999;
        //initialization
        float floatVariable=1.89f;// the letter'f' is required
        double doubleVariable=189.8923d;// the letter 'd'is optional
        char charVariable='c';// single letter enclosed in simgle quotation
        boolean booleanVariable=true; //small case true/false

        //Illegal actions
        //byte byteVariable=20; //cannot redeclare a variable
        //bytevariable =30; //instead use reassignment
        //boolean boolVar2='false' ; //should match the exact datatype
        //byte byteVariable2=100000; //cannot exceed min or max
        

        //non-primitive data type
        String stringVariable="this is a string"; //use double quotation""
        //or use the class
        String stringVariable2=new String ("string using class");
        //class/object
        VariableClass variableObject=new VariableClass();
        //use the same class Name as specified in public class <ClassName>
        
        /*need object to access instance variable */
        System.out.println(variableObject.instanceVariable);
        //can access static variable with class only/ no object neecded
        System.out.println(VariableClass.staticVariable);

        //type casting
        int intVariableConvert=10;
        double intVariableConvertToVariable=intVariableConvert;
        //explicit casting 
        double doubleVariableConvert =100.29;
        int doubleVariableConvertToInt=(int)doubleVariableConvert;
    }
}