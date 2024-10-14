package X_And_Space;

public class ArrayFloor {
    public static String[][] playboard(int [][] array ){
        String [][] convertedArray = new String[3][3];
        for (int index = 0; index < 3; index++){
            for (int value = 0; value < 3; value++){
                convertedArray[index][value] = array[index][value] == 1 ? "*":" ";

            }
        }
        return convertedArray;
    }

}
