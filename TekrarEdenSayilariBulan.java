package Diziler;

import java.util.Arrays;

public class TekrarEdenSayilariBulan {
    static boolean isFind(int[] arr, int value){
        for(int i: arr){
            if(i == value){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args){
        int[] list = {3,7,3,2,2,3,4,6,4,9,10,7,9,12,6,12};
        int[] duplicate=new int[list.length];
        int startIndex=0;
        for (int i=0;i < list.length;i++){

            for (int j=0;j < list.length;j++){
                if((i != j) && (list[i] == list[j])){
                    if (list[i] % 2==0){
                        if(!isFind(duplicate,list[i])) {
                            duplicate[startIndex++] = list[i];

                        }
                        break;
                    }
                }
            }

        }
        for (int value: duplicate){
            if (value != 0){
                System.out.println(value);
            }
        }
    }
}
