
public class SelectionSort {

    public static void main(String[] args) {
        int[] numbers = { 3, 22, 1, 56, 4, 33, 67, 21 };
        System.out.println("Before Sorting");
        printArray(numbers);
        System.out.println("After Sorting");
        printArray(sortElements(numbers));

    }

    public static int[] sortElements(int[] numbers) {
        int arraySize = numbers.length;

        for (int step = 0; step < arraySize - 1; step++) {
            int minIndex = step;

            for (int j = step + 1; j < arraySize; j++) {
                if (numbers[j] < numbers[minIndex]) {
                    minIndex = j;
                }

            }

            int temp = numbers[step];
            numbers[step] = numbers[minIndex];
            numbers[minIndex] = temp;

        }

        return numbers;

    }

    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

}
