package app;

public class ArrayUtils {
    @MethodInfo(name = "getLength", returnType = "int", description = "Returns the length of array")
    @Author(firstName = "Oleksii", lastName = "Bechke")
    public int getLength(int[] array) {
        return array.length;
    }
}
