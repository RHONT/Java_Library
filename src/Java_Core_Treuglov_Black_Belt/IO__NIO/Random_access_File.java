package Java_Core_Treuglov_Black_Belt.IO__NIO;

import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Random_access_File {
    public static void main(String[] args) {
        try(RandomAccessFile ra=new RandomAccessFile("C:\\KH\\test.txt","rw");
            ) {
            // чтение в StringBuilder
            StringBuilder str=new StringBuilder();
            while (ra.getFilePointer()< ra.length()-1){
                str.append(ra.readLine()+"\n");
            }

            // Нормальный вывод киррилицы.
            String buf_str=new String(str);
            String utf8String = new String(buf_str.getBytes("ISO-8859-1"),"UTF-8");
            System.out.println(utf8String);
            // Добавление кирилицы в конец
            String s="Питон";
            byte[] arr= s.getBytes(StandardCharsets.UTF_8);
            ra.seek(ra.length());
            ra.writeBytes("\n");
            ra.write(arr,0, arr.length);
            // Показать текущую позицию курсора
            Long l=ra.getFilePointer();
            System.out.println(l);
            // В ручном режиме взять третью строку
            String get_str;
            ra.seek(0);
            ra.readLine();
            ra.readLine();
            get_str= ra.readLine();
            System.out.println(get_str);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

