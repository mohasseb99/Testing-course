package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        int n;
        Scanner S=new Scanner(System.in);
        n=S.nextInt();
        int[] f = new int[n*3];

        for (int i =0;i<f.length;i++)
            f[i] =S.nextInt();

        body b = new body();

        if(b.idle(f,n))
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}


class body {
    public boolean idle(int [] f, int n){
        if(n<1 || n>100)
            return false;
        for (int i = 0 ; i < f.length ; i++){
            if (f[i]<-100 || f[i]>100)
                return false;
        }
        int total = 0;
        for (int j = 0 ; j < 3 ; j++){
            total = 0;

            for(int k = j;k<f.length;k+=3)
                total += f[k];

            if (total != 0)
                return false;
        }
        return true;
    }
}