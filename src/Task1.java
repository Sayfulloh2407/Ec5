import java.io.StringWriter;

public class Task1 {
    public static void main(String[] args) {
        int[] MyArray =new int[10];
        for(int i=0;   i<MyArray.length; i++){
            MyArray[i]= MyArray.length - 1 - i;
        }
        for (int x :MyArray) {
            System.out.println("Array["+x+"]="+MyArray[x]);

        }
    }
}
