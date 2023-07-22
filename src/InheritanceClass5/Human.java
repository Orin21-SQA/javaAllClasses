package InheritanceClass5;

public class Human extends AnimalInheritance {
    public static void main(String[]args){
        Human human=new Human();
        human.color="Fair";
        human.name="ABC";
        human.weight="65kgs";

        human.walk();
        human.eat();
        human.weight();
    }

    private void weight() {
        System.out.println(name+"65kgs");
    }
}
