public class GenericClass<T> {
    private T value;

    public GenericClass(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public static void main(String[] args) {
        GenericClass<String> strObj = new GenericClass<>("Hello, World!");
        System.out.println(strObj.getValue());

        GenericClass<Integer> intObj = new GenericClass<>(123);
        System.out.println(intObj.getValue());
    }
}

