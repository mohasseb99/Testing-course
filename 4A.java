package com.company;

import java.util.*;

class WaterMelon {
    public boolean divide (int x){
        if(x >= 4 && x % 2 == 0){
            return true;
        }
        else{
            return false;
        }
    }
}
public class Main {

    public static void main(String[] args) {
        int a;
        Scanner S = new Scanner(System.in);
        a = S.nextInt();

        WaterMelon d = new WaterMelon();
        boolean x = d.divide(a);
        if (x)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}