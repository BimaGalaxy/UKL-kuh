package ukl_array;

/**
 *
 * @author Galaxy
 */
public class Ukl_Matrix {
    public static void main(String[] args) {
    int a=5;
    int b=3;
    int u=a;
    int s=a;
    System.out.println("Deret Aritmatika :");
    for(int i=0;i<4;i++){
        for(int j=0;j<3;j++){
            System.out.print(u+"\t");
            u=u+b;
            s=s+u;
   }
    System.out.println();
 }
    s=s-u;
    System.out.println("Jumlah Deret Aritmatikanya adalah"+s);   
    }
}
