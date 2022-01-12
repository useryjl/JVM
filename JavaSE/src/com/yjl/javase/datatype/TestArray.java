package com.yjl.javase.datatype;

/**
 * @author ll3306
 * @Description
 * @create 2022-01-11
 */
public class TestArray {
    public static void main(String[] args) {
        String[] strings = new String[10];
        String string = strings[0];
        System.out.println(string);  //null

        //二维数组的长度、 遍历
        int[][] arr=new int[][]{{1,2,3},{4,5},{6,7,8}};
        System.out.println("arr.length:"+arr.length);//3
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                System.out.println(arr[i][j]);
            }
        }

        if ("null".equals(string)){
            System.out.println(123);
        }

        if (string==null){
            System.out.println(456);
        }
    }
}
