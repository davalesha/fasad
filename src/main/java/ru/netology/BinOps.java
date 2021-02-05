package ru.netology;

public class BinOps {
    public String sum(String a, String b) throws NumberFormatException {
            /*Переведите числа из двоичной записи в
      строках в int, сложите и переведите
      обратно в двоичную запись*/
        try {
            int numberFirst = Integer.parseInt(a, 2);
            int numberSecond = Integer.parseInt(b, 2);
            int result = numberFirst + numberSecond;
            return Integer.toBinaryString(result);
        } catch (NumberFormatException ex) {
            throw new NumberFormatException("Введите двоичное число");
        }
    }

    public String mult(String a, String b) {
            /*Переведите числа из двоичной записи в
      строках в int, перемножьте и переведите
      обратно в двоичную запись*/
        try {
            int numberFirst = Integer.parseInt(a, 2);
            int numberSecond = Integer.parseInt(b, 2);
            int result = numberFirst * numberSecond;
            return Integer.toBinaryString(result);
        } catch (NumberFormatException ex) {
            throw new NumberFormatException("Введите двоичное число");
        }
    }
}
