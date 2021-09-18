package com.alex.tasks.task6;

import com.alex.tasks.servise.reader.impl.ConsReader;
import com.alex.tasks.servise.reader.interfaces.Reader;
import com.alex.tasks.servise.writer.impl.ConsWriter;
import com.alex.tasks.servise.writer.interfaces.Writer;


public class Task6 {

    public static void main(String[] args) {
        Reader reader = new ConsReader();
        Writer writer = new ConsWriter();

        writer.writeLn("Input size of array: ");
        int arrSize = reader.readInt();
        int[] array = inputElementsOfArray(reader, writer, arrSize);

        int[][] matrix = initMatrix(array);
        printMatrix(writer, matrix);
    }


    private static int[] inputElementsOfArray(Reader reader, Writer writer, int arrSize) {
        int[] array = new int[arrSize];
        for (int i = 0; i < arrSize; i++) {
            writer.writeLn("Input " + i + " element: ");
            array[i] = reader.readInt();
        }
        return array;
    }

    private static int[][] initMatrix(int[] arr) {
        int[][] matrix = new int[arr.length][arr.length];
        int offset = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = arr[(j + offset) % arr.length];
            }
            offset++;
        }
        return matrix;
    }

    private static void printMatrix(Writer writer, int[][] matrix) {
        for (int[] ints : matrix) {
            for (int element : ints) {
                writer.write(String.valueOf(element));
            }
            writer.writeLn("");
        }
    }

}
