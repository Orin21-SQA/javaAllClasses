package nongeneric;

public class NongenericTest {
    public static void main (String[]args){
        IntegerTest integerTest=new IntegerTest(50);
        System.out.println(integerTest.getAnInt());

        StringTest stringTest =new StringTest("hello");
        System.out.println(stringTest.getString());

        DoubleTest doubleTest=new DoubleTest(40.40);
        System.out.println(doubleTest.getaDouble());
    }
}
