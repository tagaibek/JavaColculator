package Сalculator;



import java.util.TreeMap;

public class Arina {

    TreeMap<Character, Integer> treeMap = new TreeMap<>();
TreeMap< Integer, String> romanTree = new TreeMap<>();
    public  Arina (){
        treeMap.put('I',1);
        treeMap.put('V',5);
        treeMap.put('X',10);
        treeMap.put('L',50);
        treeMap.put('C',100);
        treeMap.put('D',500);
        treeMap.put('M',1000);



        romanTree.put(1000,"M");
        romanTree.put(900,"CM");
        romanTree.put(500,"D");
        romanTree.put(400,"CD");
        romanTree.put(100,"C");
        romanTree.put(90,"XC");
        romanTree.put(50,"L");
        romanTree.put(40,"XL");
        romanTree.put(10, "X");
        romanTree.put(9, "IX");
        romanTree.put(5, "V");
        romanTree.put(4, "IV");
        romanTree.put(1, "I");
    }
public boolean isRoman (String number){return treeMap.containsKey(number.charAt(0));
}
public String inToRoman(int number){
String roman = "";
int arabic ;
do {
    arabic = romanTree.floorKey(number);
    roman += romanTree.get(arabic);
    number-=arabic;
}while (number!= 0);
return roman;
}
public int inToRoman(String s ){
        int fos =s.length() - 1;
        char[]array = s.toCharArray();
        int kaffee;
        int result = treeMap.get(array[fos]);
    for (int i = fos; i >= 0; i--) {
        kaffee = treeMap.get(array[i]);
        if (kaffee< treeMap.get(array[i + 1])) {
            result -= kaffee;
        } else {
            result += kaffee;
        }


    }
    return result;

}
}

