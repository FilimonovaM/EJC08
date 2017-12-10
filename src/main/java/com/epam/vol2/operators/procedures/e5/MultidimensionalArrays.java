package com.epam.vol2.operators.procedures.e5;

public class MultidimensionalArrays {
    /**
     * uses to show the multidimensional array with special algorithm of digit migrate.
     *
     * @param length is a length of massive.
     * @return message with string visualization of array.
     */
    public String show(int length) {
        StringBuffer stringBuffer = new StringBuffer();
        int[][] arr = new int[length][length];
        for(int i = 0; i<length; i++){
                arr[i][i] = 1;
                arr[length-1-i][i]=1;
        }
        for(int i = 0; i<length;i++){
            for(int j = 0; j<length; j++){
                stringBuffer.append(arr[i][j]+" ");
            }
            stringBuffer.append("\n");
        }

        return stringBuffer.toString();
    }
}
