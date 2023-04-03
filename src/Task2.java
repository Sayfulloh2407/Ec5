import java.util.Random;
public class Task2 {
    public static void main(String[] args) {
        int[] MyArray1= new int[10];
        Random random = new Random();
        int smallest = 100;
        int largest = 1;
        for (int x:MyArray1){
            x = random.nextInt(100) + 1;
            System.out.print(x+" ");
            if (x < smallest) {
                smallest = x;
            }
            if (x > largest) {
                largest = x;
            }
        }
        System.out.println("The smallest number is: " + smallest);
        System.out.println("The largest number is: " + largest);
    }
}
