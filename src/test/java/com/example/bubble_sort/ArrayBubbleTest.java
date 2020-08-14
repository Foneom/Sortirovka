package com.example.bubble_sort;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class ArrayBubbleTest {
    /**
     * Проверка метода вывода добавленных элементов массива
     */
    @Test
    public void whenDisplayTrue() {
        ArrayBubble arrayBubble = new ArrayBubble(3);
        arrayBubble.add(3);
        arrayBubble.add(5);
        arrayBubble.add(1);
        int[] result = {3, 5, 1};
        int[] expected = arrayBubble.display();
        assertThat(expected, is(result));
    }

    /**
     * Проверка метода поиска по индексу
     */
    @Test
    public void whenGetByIndexTrue() {
        ArrayBubble arrayBubble = new ArrayBubble(3);
        arrayBubble.add(3);
        arrayBubble.add(5);
        arrayBubble.add(1);
        int result = 5;
        int expected = arrayBubble.displayByIndex(1);
        assertThat(expected, is(result));
    }
}