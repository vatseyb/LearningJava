
/*Skip to content
        Using Gmail with screen readers
        Conversations
        4.3 GB (28%) of 15 GB used
        Manage
        Terms · Privacy · Program Policies
        Last account activity: 46 minutes ago
        Details

public class BubbleSortGeneric<T extends Comparable<? super T>> {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer();
        // example using Strings
        String[] arrayOfStrings = { "Andree", "Leana", "Faviola", "Loyce", "Quincy", "Milo", "Jamila", "Toccara"};
        BubbleSortGeneric<String> stringSorter = new BubbleSortGeneric<>();
        stringSorter.bubbleSort(arrayOfStrings);
        System.out.println("String Data Type sorting: "+java.util.Arrays.toString(arrayOfStrings));

        // example using Doubles
        Double[] arrayOfDoubles = { 0.35, 0.02, 0.36, 0.82, 0.27, 0.49, 0.41, 0.17 };
        BubbleSortGeneric<Double> doubleSorter = new BubbleSortGeneric<>();
        doubleSorter.bubbleSort(arrayOfDoubles);
        System.out.println("Double Data Type sorting: "+java.util.Arrays.toString(arrayOfDoubles));

        // example using Integer
        Integer[] arrayOfIntegers = { 35, 2, 36, 82, 27, 49, 41, 17 };
        BubbleSortGeneric<Integer> integerSorter = new BubbleSortGeneric<>();
        integerSorter.bubbleSort(arrayOfIntegers);
        System.out.println("Integer Data Type sorting: "+java.util.Arrays.toString(arrayOfIntegers));
    }

    void bubbleSort(T[] array) {
        int n = array.length;
        while (n > 0) {
            int lastModifiedIndex = 0;
            for (int currentIndex = 1; currentIndex < n; currentIndex++) {
                // if the item at the previous index is greater than the item at the
                // `currentIndex`, swap them
                if (array[currentIndex - 1].compareTo(array[currentIndex]) > 0) {
                    // swap
                    T temp = array[currentIndex - 1];
                    array[currentIndex - 1] = array[currentIndex];
                    array[currentIndex] = temp;
                    // save the index that was modified
                    lastModifiedIndex = currentIndex;
                }
            }
            // save the last modified index so we know not to iterate past it since all
            // proceeding values are sorted
            n = lastModifiedIndex;
        }
    }
}

BubbleSortGeneric.java.txt
        Zoomed out of item.
*/

