package com.interview.design.decorator.io;

import java.io.*;

public class LowercaseInputStream extends FilterInputStream {

    public LowercaseInputStream(InputStream in) {
        super(in);
    }

    @Override
    public int read() throws IOException {
        int c = super.read();
        return (c == -1 ? c : Character.toLowerCase((char) c));
    }

    @Override
    public int read(byte[] b, int off, int len) throws IOException {
        int result = super.read(b, off, len);
        for (int i = off; i < off + result; i++) {
            b[i] = (byte) Character.toLowerCase((char) b[i]);
        }
        return result;
    }
}

class InputTest {
    public static void main(String[] args) {
        int c;
        try {
            InputStream in = new LowercaseInputStream(
                    new BufferedInputStream(
                            new FileInputStream("/Users/yyyue/klso/fundamental/src/main/java/com/interview/design/decorator/io/test.txt")));
            while ((c = in.read()) >= 0) {
                System.out.print((char)c);
            }
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
