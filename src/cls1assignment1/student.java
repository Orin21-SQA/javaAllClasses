package cls1assignment1;

public class student {
    String name; //class & object
    String age;
    float height;

    public student(){


    }
    public void doStudy(){
System.out.println(name+ "study");

    }
    public String getAge(){
        return age;
    }


    public static void main(String[]args){

        student student =  new student();
        student.name="ORIN";
        student.age ="22";
        student .doStudy();

        System.out.println("orin age"+student.getAge());
    }
}
