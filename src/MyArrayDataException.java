// Создание собственного исключения

public class MyArrayDataException extends NumberFormatException {
    public MyArrayDataException(String message) {
        super(message);
        System.out.println("В массиве обнаружился не верный тип данных");
    }
}
