package com.alex.tasks.task4;

import com.alex.tasks.service.reader.impl.ReaderImpl;
import com.alex.tasks.service.reader.Reader;
import com.alex.tasks.service.writer.impl.WriterImpl;
import com.alex.tasks.service.writer.Writer;


public class Task4 {

    public static void main(String[] args) {
        Reader reader = ReaderImpl.getInstance();
        Writer writer = WriterImpl.getInstance();

        writer.writeLn("Input size of array: ");
        int arrSize = reader.readInt();
        int[] array = inputElementsOfArray(reader, writer, arrSize);

        printPrimeIndexes(writer, array);
    }

    private static int[] inputElementsOfArray(Reader reader, Writer writer, int arrSize) {
        int[] array = new int[arrSize];
        for (int i = 0; i < arrSize; i++) {
            writer.writeLn("Input " + i + " element: ");
            array[i] = reader.readInt();
        }
        return array;
    }

    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        } else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    private static void printPrimeIndexes(Writer writer, int[] array) {
        writer.write("Indexes of prime numbers: ");
        for (int i = 0; i < array.length; i++) {
            if (isPrime(array[i])) {
                writer.write(i + " ");
            }
        }
    }
}
