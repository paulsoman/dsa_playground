public class TwoPointer {
    public static void main(String[] args) {

        String name="Paul";

        System.out.println("Before "+name);
        System.out.println("After "+reverseString(name));
        
    }

private static String reverseString(String string){
    char [] array= string.toCharArray();

int n = array.length;


int i=0;
int j=n-1;

while (i<j) {
    
char temp = array[i];
array[i]=array[j];
array[j]=temp;
i++;
j--;

}


    return new String(array);
}



}
