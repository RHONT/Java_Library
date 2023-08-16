package Java_Core_Treuglov_Black_Belt.IO__NIO;

import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.Channel;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class Channel_Buffer_Random_Asecc_file {
    public static void main(String[] args) {
        try(
                RandomAccessFile raf=new RandomAccessFile("C:\\KH\\[1].txt","rw");
                FileChannel channel= raf.getChannel();
                ByteArrayOutputStream out_byte_stream=new ByteArrayOutputStream();
                ) {
            ByteBuffer bf=ByteBuffer.allocate(10);

            while (channel.read(bf)>0){
                out_byte_stream.write(bf.array(),0,bf.position());
                bf.clear();
            }

            String str=new String(out_byte_stream.toByteArray(), StandardCharsets.UTF_8);
            System.out.println(str);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
