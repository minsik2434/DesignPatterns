package javaIO;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class LowerCaseInputStream extends FilterInputStream {
    public LowerCaseInputStream(InputStream in) {
        super(in);
    }

    public int read() throws IOException {
        int c = in.read();
        //입력 스트림의 마지막일 경우(-1일 경우) -1 반환, 아닐경우 소문자로 변경후 반환
        return (c == -1 ? c : Character.toLowerCase((char) c));
    }

    public int read(byte[] b, int offset, int len) throws IOException {
        int result = in.read(b, offset, len);
        //offset 부터 끝까지 문자 소문자로 변환
        for(int i= offset; i< offset+result; i++){
            b[i] = (byte) Character.toLowerCase((char)b[i]);
        }
        return result;
    }
}
