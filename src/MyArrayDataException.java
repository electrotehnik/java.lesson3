// Создание собственного исключения

public class MyArrayDataException extends RuntimeException {
    int row, column;
    public MyArrayDataException(String message, int row, int column) {
        super(message + "[" + row + ", " + column + "]");
        this.row = row;
        this.column = column;
    }
}
