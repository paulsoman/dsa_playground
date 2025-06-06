public class CheckSortedArray {
    public static void main(String[] args) {

        int[] sorted = {9,3,5,7};

        System.out.println(checkSorted(sorted));
        
    }

private static boolean checkSorted(int [] array){
    int n=array.length;

    for(int i=0;i<n-1;i++){
        if (array[i]>array[i+1]) {
            return false;
        }
    }

    return true;
}


}
