package com.javalab3.lab3.lab.z3;

import java.util.List;

public class HeapSort  
{
    public void sort(List<Double> arr)
    {
        int n = arr.size();

        // Построение кучи (перегруппируем массив)
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(arr, n, i);

        // Один за другим извлекаем элементы из кучи   
        for (int i=n-1; i>=0; i--)
        {
            // Перемещаем текущий корень в конец
            double temp = arr.get(0);
            arr.set(0, Double.parseDouble(i+""));
           
            arr.set(i, temp);

            // Вызываем процедуру heapify на уменьшенной куче
            heapify(arr, i, 0);
        }
    }

    // Процедура для преобразования в двоичную кучу поддерева с корневым узлом i, что является
// индексом в arr[]. n - размер кучи
     void heapify(List<Double> arr, int n, int i)
    {
        int largest = i; // Инициализируем наибольший элемент как корень
        int l = 2*i + 1; // левый = 2*i + 1
        int r = 2*i + 2; // правый = 2*i + 2

           // Если левый дочерний элемент больше корня
        if (l < n && arr.get(l) > arr.get(largest))
            largest = l;

          // Если правый дочерний элемент больше, чем самый большой элемент на данный момент
        if (r < n && arr.get(r) > arr.get(largest))
            largest = r;
       // Если самый большой элемент не корень
        if (largest != i)
        {
            
            double swap = arr.get(i);
            arr.set(i, arr.get(largest));
            arr.set(largest, swap);

          // Рекурсивно преобразуем в двоичную кучу затронутое поддерево
            heapify(arr, n, largest);
        }
    }

    /* Вспомогательная функция для вывода на экран массива размера n */
    static <T extends Number>void printArray(T arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
}