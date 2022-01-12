package com.yjl.javase.datatype;

/**
 * @author ll3306
 * @Description
 * @create 2022-01-11
 */
public class TestArray2 {
    /*返回最大值的方法*/
    public static int returnMax(int[] array){
        int MaxValue=array[0];
        for (int i=0;i<array.length;i++){
            if (array[i]>MaxValue){
                MaxValue=array[i];
            }
        }
        return MaxValue;
    }

    /*返回最小值的方法*/
    public static int returnMin(int[] array){
        int MinValue=array[0];
        for (int i=0;i<array.length;i++){
            if (array[i]<MinValue){
                MinValue=array[i];
            }
        }
        return MinValue;
    }

    /*返回总和的方法*/
    public static int returnSum(int[] array){
        int sum=0;
        for (int i=0;i<array.length;i++){
            sum+=array[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i=0;i<array.length;i++){
             array[i]= (int)(Math.random()*90) + 10;
        }

        for (int i=0;i<array.length;i++){
            System.out.println("array[i]:"+array[i]);
        }
        System.out.println();

        int returnMax = TestArray2.returnMax(array);
        System.out.println("returnMax:"+returnMax);
        int returnMin = TestArray2.returnMin(array);
        System.out.println("returnMin:"+returnMin);
        int returnSum = TestArray2.returnSum(array);
        System.out.println("returnSum:"+returnSum);
        System.out.println("average:"+returnSum/(double)array.length);

    }
}
