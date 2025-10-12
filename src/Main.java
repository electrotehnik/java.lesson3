public class Main {
    static String[][] arrayOK = {
            {"1","2","3","4"},
            {"5","1","7","8"},
            {"9","6","1","2"},
            {"3","4","1","6"}
    };
    static String[][] arrayBAD = {
            {"1","2","3","4"},
            {"5","1","7","8"},
            {"9","b","1","2"},
            {"3","4","1","6"}
    };
    static String[][] arrayOversize = {
            {"1","2","3","4"},
            {"5","1","7","8"},
            {"9","b","1","2"},
            {"9","b","1","2"},
            {"3","4","1","6"}
    };

    static int strToInt(String[][] str) {
        int sum = 0;
        if (str.length != 4) {
            throw new MyArraySizeException("Неверный размер массива");
        }
        try {
            for (int i = 0; i < str.length; i++) {
                for (int j = 0; j < str[i].length; j++) {
                    sum += Integer.parseInt(str[i][j]);
                }
            }
        } catch (NumberFormatException e) {
            throw new MyArraySizeException("Неверный тип данных");
        }
        return sum;
    }

    static void main(String[] args) {
        System.out.println("Сумма элементов массива: " + strToInt(arrayOK));
    //    System.out.println("Сумма элементов массива: " + strToInt(arrayBAD));
        System.out.println("Сумма элементов массива: " + strToInt(arrayOversize));
    }
}
