package com;

import java.io.IOException;
import java.io.InputStream;

/**
 * User: kaifeng.yuan
 * Date: 12/15/16.
 */
public class EncryptInputStream extends InputStream {
    private  InputStream inputStream;
    public EncryptInputStream(InputStream inputStream){
        this.inputStream = inputStream;
    }
    @Override
    public int read() {

        int data = 0;
        try {
            data = inputStream.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if(data != -1){
            data += 3;
        }
        return data;
    }
}
