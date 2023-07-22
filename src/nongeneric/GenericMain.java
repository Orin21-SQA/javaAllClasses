package nongeneric;

public class GenericMain {
    public static void main(String[]args){
        GenericDataType<Integer> genericDataType =new GenericDataType<>(100);
        System.out.println(genericDataType.Datatype);

        GenericDataType<String> stringGenericDataType =new GenericDataType<>("Hello");
        System.out.println(stringGenericDataType.Datatype);


    }
}
