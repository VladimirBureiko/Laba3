import java.io.Console;
import java.io.Writer;

public class labw03 implements var06 {
    @Override
    public double logika(double d1, double d2, double d3) {
        if(d1<d2 && d1<d3)
        {
            return 1;
        }
         if (d2<d1&&d2<d3)
        {
            return 2;
        }
            return 3;
}



    @Override
    public void poka(int N) {
        int a;
        while (N%10!=0)
        {
            a = N%10;
            N = N/10;
            System.out.print(a + "\n");
        }
    }

    @Override
    public void massivy(double[] A) {
        for(int i = 1; i<A.length-1; i++)
        {
            if(A[i]<A[i-1] && A[i]< A[i+1])
            {
                System.out.print(A[i] + "\n");
                break;
            }
        }
    }
}
