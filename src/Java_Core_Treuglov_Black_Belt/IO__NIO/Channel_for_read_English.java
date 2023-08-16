package Java_Core_Treuglov_Black_Belt.IO__NIO;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class Channel_for_read_English {
    public static void main(String[] args) {
        try(
                RandomAccessFile raf=new RandomAccessFile("C:\\KH\\1.txt","rw");
                FileChannel fileChannel=raf.getChannel();
                ) {
            ByteBuffer bf=ByteBuffer.allocate(30);
            StringBuilder sb=new StringBuilder();

            while (fileChannel.read(bf)>0){
                bf.flip();
                while (bf.hasRemaining()){
                    sb.append((char)bf.get());
                }
                bf.clear();
            }
            System.out.println(sb);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
