public class DuplicateSortedArray {
    
    public static void main(String[] args) {

        int array []={1,2,3,4,5,6};
        System.out.println(checkDuplicate(array));
        
    }

    private static boolean checkDuplicate(int [] array){
        int n=array.length;
        int left=0;
        int right=n-1;
while (left<right) {

    if (array[left]==array[right]) {
        return true;
    }
 if(n%2==0){
    left++;
    right--;
 }
    
}

return false;


    }
}
