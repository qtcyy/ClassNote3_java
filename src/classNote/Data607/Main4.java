package classNote.Data607;

import java.util.Scanner;
public class Main4 {
    public static void main(String[] args){
        for (int i=1;i<=9;i++) {
            for (int j = 1; j <= i; j++)
                System.out.print(i + "*" + j + "=" + i * j + " ");
            System.out.println();
        }
    }
}
