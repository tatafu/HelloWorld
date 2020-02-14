package com.anti.com;

import java.util.ArrayList;

/**
 * @author fusl
 * @date 2019-11-25 -- 11:13
 **/
public class solution {
    public static void main(String[] args) {
       /* int aa=9;
        System.out.println(aa);*/

//       int bb=6;
        String abs="abs";
        System.out.println(abs);
        System.out.println();
    }


    public void print(){
        String[] arr=new String[]{"john","hanmeimei","lilei"};
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }

       //增强for循环
        for (String s : arr) {
            System.out.println(s);
        }

        //普通for循环
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println(s);
        }
    }


    public void print1(){
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(2);

        for (Integer integer : list) {
            System.out.println(integer);
        }


        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.println(list.get(i));
        }
    }


     public void print2(){
        ArrayList<Integer> list=new ArrayList<>();
         if (list == null) {

         }
         if (list != null) {

         }
         if (list == null) {

         }
         if (list != null) {

         }
     }
}
