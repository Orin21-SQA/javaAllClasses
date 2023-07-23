package InheritanceClass5;

public class AnimalInheritance {
    public String name;
    public String weight;
    public String color;
    public String sound;

    public AnimalInheritance() {

    }

    public void walk(){
        System.out.println(name +"walks");

    }

    public void sleep(){
        System.out.println(name +"sleeps");
    }

    public void eat(){
        System.out.println(name +"eats");

    }

    private void fly(){
        System.out.println(name +"flies");

    }


}
