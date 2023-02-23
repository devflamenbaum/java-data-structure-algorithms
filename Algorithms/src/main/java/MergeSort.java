public class MergeSort {

    public static final String DESC = "descending";
    public static final String ASC = "ascending";

    public static void main(String[] args) {
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        //mergeSort(intArray, 0, intArray.length, DESC);
        mergeSort(intArray, 0, intArray.length, ASC);

        for (int j : intArray) {
            System.out.println(j);
        }
    }

    public static void mergeSort(int[] input, int start, int end, String ordering){

        if(end - start < 2)
            return;

        int mid = ( end + start) / 2;

        mergeSort(input, start, mid, ordering);
        mergeSort(input, mid, end, ordering);
        merge(input, start, mid, end, ordering);
    }

    public static void merge(int[] input, int start, int mid, int end, String ordering){

        int i = start;
        int j = mid;
        int tempIndex = 0;

        int[] tempArray = new int[end - start];

        switch (ordering){
            case "descending":
                if(input[mid - 1] >= input[mid])
                    return;
                while (i < mid && j < end){
                    tempArray[tempIndex++] = input[i] >= input[j] ? input[i++] : input[j++];
                }
                break;
            case "ascending":
                if(input[mid - 1] <= input[mid])
                    return;
                while (i < mid && j < end){
                    tempArray[tempIndex++] = input[i] <= input[j] ? input[i++] : input[j++];
                }
                break;
            default:
                return;
        }

        System.arraycopy(input, i, input, start + tempIndex, mid - i);
        System.arraycopy(tempArray, 0, input, start, tempIndex);

    }
}
