package com.example.bubble_sort;

import java.util.Arrays;
import java.util.jar.JarOutputStream;

/**
 * Данный класс демонcтрирует "Пузырьковый" способ сортировки массива
 * @author foneom
 * @version 0.1
 * @since 12.08.2020
 */
public class ArrayBubble {
    /**
     * Целочисленный массив данных
     */
    private int[] array;
    /**
     * Колличество элементов
     */
    private int nElement;

    /**
     * Конструктор, пока 0 элементов
     *
     * @param size - размер массива
     */
    public ArrayBubble(int size) {
        array = new int[size];
        nElement = 0;
    }

    /**
     * Метод добавления элемента в массив,
     * колличество увеличивается на один
     *
     * @param value
     */
    public void add(int value) {
        array[nElement] = value;
        nElement++;
    }

    /**
     * Метод вывода в консоль всех элементов массива
     * @return
     */
    public int[] display() {
        for (int i = 0; i < nElement; i++) {
        }
        return array;
    }

    /**
     * Выводит в консоль элемент массива по индексу
     *
     * @param index
     */
    public int displayByIndex(int index) {
        for (int i = 0; i < nElement; i++) {
            if (i == index) {
                array[i] = array[index];
                break;
            }
        }
        return array[index];
    }

    /**
     * Метод обмена значениями в массиве
     *
     * @param one - первое значение
     * @param two - второе значение
     */
    public void swap(int one, int two) {
        int temp = array[one];
        array[one] = array[two];
        array[two] = temp;
    }

    public void bubbleSort() {
        for (int i = nElement - 1; i > 1; i--) { //идем обратно по циклу
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    /**
                     * Если первый элемент больше второго,
                     * то меняем их местами
                     */
                    swap(j, j + 1);
                }
            }
        }
    }
}
class TestArrayBubble {
    public static void main(String[] args) {
        ArrayBubble array = new ArrayBubble(4);
        array.add(234);
        array.add(654);
        array.add(543);
        array.add(214);
        array.bubbleSort();
        System.out.println();
        System.out.print(Arrays.toString(array.display()));
        System.out.println();
    }
}
