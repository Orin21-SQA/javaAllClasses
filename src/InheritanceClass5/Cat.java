package InheritanceClass5;

public class Cat extends AnimalInheritance{

    public static void main (String[]args){
        Cat cat=new Cat();
        cat.name="Parching";
        cat.sound="meow";

        cat.sound();
    }
     private void sound(){
        System.out.println(name + "meow");
}
}
