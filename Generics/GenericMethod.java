public class GenericMethod {
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] intArray = {55, 66, 88, 11, 44};
        Double[] doubleArray = {1.0, 2.0, 3.0, 4.0, 5.0};
        String[] stringArray = {"samosa", "pizza", "pasta", "fruit", "momos"};

        printArray(intArray);
        printArray(doubleArray);
        printArray(stringArray);
    }
}
