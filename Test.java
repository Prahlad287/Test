import java.util.Scanner;
public class Test
{
    int count=0; int sum=0; int add=0;
    int g=0; int l = 0; int c=0; int d=0;
       public int countNum(int n){
        count=0;
        while(n !=0) {
            n = n / 10;
            count = count + 1;
        }
        return count;
    }

    public void input() {
        int a[] = new int[200];
        int m;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int N = sc.nextInt();
        for (int i = 1; i <= N; i++) {
           int j = countNum(i);
            if ((j % 2) == 1) {
                c++;
            }
            if ((j % 2) == 0) {
               d++;
            }
        }
        System.out.println("1 number:"+c*2);
        System.out.println("2 number:"+d*3);
        int k=((countNum(c*2)+countNum(d*4)));
        System.out.println(""+k);
           }
    public static void main(String[] args) {
        Test t= new Test();
        t.input();
    }
}
