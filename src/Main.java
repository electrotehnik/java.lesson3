public class Main {
    static char[][] strings = {
                                {'1','2','3','4'},
                                {'5','6','7','8'},
                                {'9','1','1','2'},
                                {'3','4','1','6'}
                                };

    static int strToInt(char[][] str) throws MyArraySizeException {
        int sum = 0;

        for(int i = 0; i < strings.length; i++) {
            for(int j = 0; j < strings[i].length; j++) {
                sum += (int)strings[i][j];
            }
        }
        return sum;
    }

    static void main(String[] args) {
        System.out.println("Сумма элементов массива: " + strToInt(strings));
    }
}
