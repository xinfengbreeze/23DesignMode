package com;

import com.sun.xml.internal.messaging.saaj.util.ByteInputStream;

import java.io.BufferedInputStream;

/**
 * User: kaifeng.yuan
 * Date: 12/15/16.
 */
public class Test {
    public static void main(String[] args){
        byte[] buff = new byte[]{1,2,3,4,5,6,7};
        ByteInputStream ins = new ByteInputStream(buff,buff.length);
        int data;
        while((data = ins.read()) != -1){
            System.out.print(data+"  ");
        };
        System.out.println(" ");
        System.out.println("--------------------");

        ByteInputStream ins2 = new ByteInputStream(buff,buff.length);
        EncryptInputStream ins3 = new EncryptInputStream(ins2);
        int data2;
        while((data2 = ins3.read()) != -1){
            System.out.print(data2+"  ");
        };

        System.out.println(" ");
        System.out.println("--------------------");

        ByteInputStream ins4 = new ByteInputStream(buff,buff.length);
        EncryptInputStream ins5 = new EncryptInputStream(new BufferedInputStream(ins4));
        int data5;
        while((data5 = ins5.read()) != -1){
            System.out.print(data5+"  ");
        };
    }
}
