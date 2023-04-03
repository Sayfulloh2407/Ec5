public class Task3 {
    public static void main(String[] args) {
        int[][] MyArray2 =new int[10][10];
        for (int i=0;i<MyArray2.length;i++){
            for (int j=0; j< MyArray2.length;j++){
                if(i==j){
                    MyArray2[i][j]=i;
                }
                else{
                    MyArray2[i][j]=0;
                }
                System.out.print(MyArray2[i][j] + " ");
            }
            System.out.println();
        }
    }
}
