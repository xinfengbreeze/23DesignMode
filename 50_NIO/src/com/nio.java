package com;

import org.junit.Test;

import java.nio.*;

/**
 * User: kaifeng.yuan
 * Date: 3/16/17.
 */
public class nio {

    @Test
    public void testByteBuffer(){
//        ByteBuffer
//        CharBuffer
//        IntBuffer
//        ShortBuffer
//        LongBuffer
//        FloatBuffer
//        DoubleBuffer

        //申请非直接内存
        ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
        System.out.println("capacity-----"+byteBuffer.capacity());
        System.out.println("limit-----"+byteBuffer.limit());
        System.out.println("position----"+byteBuffer.position());
        //存放数据
        byteBuffer.put((byte) 1);
        byteBuffer.put((byte) 2);
        byteBuffer.put((byte) 3);
        byteBuffer.put((byte) 4);
        byteBuffer.put(0, (byte) 9);
        System.out.println("capacity-----"+byteBuffer.capacity());
        System.out.println("limit-----"+byteBuffer.limit());
        System.out.println("position----"+byteBuffer.position());
        //切换到读模式
        byteBuffer.flip();
        System.out.println("capacity-----"+byteBuffer.capacity());
        System.out.println("limit-----"+byteBuffer.limit());
        System.out.println("position----"+byteBuffer.position());
        for(int i = 0; i <byteBuffer.limit(); i ++){
            if(i == 2){
                byteBuffer.mark();//添加一个标记点
            }
            System.out.println(byteBuffer.get());
        }

        System.out.println("capacity-----"+byteBuffer.capacity());
        System.out.println("limit-----"+byteBuffer.limit());
        System.out.println("position----"+byteBuffer.position());

        byteBuffer.reset();//回到标记点

        System.out.println("capacity-----"+byteBuffer.capacity());
        System.out.println("limit-----"+byteBuffer.limit());
        System.out.println("position----"+byteBuffer.position());

        byteBuffer.rewind();//回到读开始的模式
        System.out.println("capacity-----"+byteBuffer.capacity());
        System.out.println("limit-----"+byteBuffer.limit());
        System.out.println("position----"+byteBuffer.position());

        byteBuffer.clear();
        System.out.println("capacity-----"+byteBuffer.capacity());
        System.out.println("limit-----"+byteBuffer.limit());
        System.out.println("position----"+byteBuffer.position());
    }
}
