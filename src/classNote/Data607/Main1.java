package classNote.Data607;

import java.util.Scanner;

class Calc{
    int fact(int n) {
        int res=1;
        if (n<=1)
            return 1;
        for (int i=2;i<=n;i++)
            res*=i;
        return res;
    }
}

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calc sol=new Calc();
        System.out.print(sol.fact(sc.nextInt()));
    }
}
