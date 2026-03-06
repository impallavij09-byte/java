public class Array2{
    public static void main(String[] args) {
        int [][]num=new int[2][3];
        num[0][0]=10;
         num[0][1]=10;
          num[0][2]=10;
           num[1][0]=10;
            num[1][1]=10;
             num[1][2]=10;
             for (int i=0 ;i<num.length;i++){
                 for (int j=0 ;j<num[i].length;j++){
                    System.out.println(num[i][j]+" ");
                 }
                 System.out.println();
             }


    }
}