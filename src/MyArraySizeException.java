// Создание собственного исключения

public class MyArraySizeException extends RuntimeException  {
    public MyArraySizeException(String message) {
        super(message);
        System.out.println("В массиве обнаружилось не верное количество элементов");
    }
}
