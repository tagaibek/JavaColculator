package Сalculator;

import java.util.Scanner;

public class Arina2 {



    public static void main(String[] args) {
        Arina arina = new Arina();
        String [] actions = {"+","-","/","*" };
        String []redactions = {"\\+","-","/","\\*"};
        Scanner scn= new Scanner(System.in);
        System.out.print("ведите слово ");
        String scan = scn.nextLine();
        // здесь определяем орифметические задание
        int aktIndex =-1;
        for (int i = 0; i < actions.length; i++) {
            if (scan.contains(actions[i])){
                aktIndex = i;
                break;
            }
        }

     if (aktIndex==-1){
         System.out.println(" Некорректое выражение ");
         return;
     }
     // делим строку по арифметического знаку
    String[]data = scan.split(redactions[aktIndex]);
     if (arina.isRoman(data[0])==arina.isRoman(data[1])){
         int a,b;
         boolean isRoman = arina.isRoman(data[0]);
         if(isRoman){
         a = arina.inToRoman(data[0]);
         b = arina.inToRoman(data[1]);


         }else {
             a = Integer.parseInt(data[0]);
             b = Integer.parseInt(data[1]);
         }
             int result;
             switch (actions[aktIndex]) {
                 case "+":
                     result = a + b;
                     break;
                 case "-":
                     result = a - b;
                     break;
                 case "*":
                     result = a * b;
                     break;
                 default:
                     result = a / b;
                     break;

             }
             if (isRoman){
                 System.out.println(arina.inToRoman(result));
             }
             else {
                 System.out.println(result);
             }


     }else {
         System.out.println(" numbers should be in one format ");
     }

    }
}
