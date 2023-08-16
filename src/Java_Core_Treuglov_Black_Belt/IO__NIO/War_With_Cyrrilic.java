package Java_Core_Treuglov_Black_Belt.IO__NIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.CharBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.StandardCharsets;

public class War_With_Cyrrilic {
    public static void main(String[] args) {
        String s=new String("Привет");
        char[] arr=s.toCharArray();
        String utf8String = new String(arr);
        System.out.println(utf8String);
        System.out.println("Привет");
        String filepath = "D:\\temp\\Сентябрь\\Path.txt";



    }
}
