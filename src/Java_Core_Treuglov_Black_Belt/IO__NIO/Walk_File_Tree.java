package Java_Core_Treuglov_Black_Belt.IO__NIO;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Scanner;

public class Walk_File_Tree {

    private static String decodeGetParameter(String parameter) throws UnsupportedEncodingException {
        return new String(URLDecoder.decode(parameter, "UTF-8").getBytes("UTF-8"), "UTF-8");

    }
    public static void main(String[] args) throws IOException {


//        String buf_str=new String("D:\\temp\\Сентябрь\\Path.txt");
//        byte[] arr= buf_str.getBytes(StandardCharsets.UTF_8);
//        String path=new String(arr);
//        System.out.println(path);
//        String utf8String = new String(buf_str.getBytes("ISO-8859-1"),"UTF-8");
//        System.out.println(decodeGetParameter("D:\\temp\\Сентябрь\\Path.txt"));
//        File for_read=new File(decodeGetParameter("D:\\temp\\Сентябрь\\Path.txt"));

        File for_read=new File("D:\\Path.txt");
        Scanner file_scan=new Scanner(for_read);
        String buf_str=new String(file_scan.nextLine().getBytes(StandardCharsets.UTF_8));
        Path source= Paths.get(buf_str);
        String buf_str2=new String(file_scan.nextLine().getBytes(StandardCharsets.UTF_8));
        Path destionation= Paths.get(buf_str2);
        file_scan.close();
        Files.walkFileTree(source,new File_Update(source,destionation));
        System.out.println("Finish!");

    }
}

class File_Update extends SimpleFileVisitor<Path>{
    Path source;
    Path destination;

    public File_Update(Path source, Path destination) {
        this.source = source;
        this.destination = destination;
    }

    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) {
        Path new_dest=destination.resolve(source.relativize(dir));
            try {
                Files.copy(dir, new_dest);
                System.out.println("Папка: " + dir.getFileName() + " Скопирована");
            } catch (IOException e) {
                System.out.println("Папка:" + new_dest.getFileName() + " уже существует");
                //e.printStackTrace();
            }
            finally {
                return FileVisitResult.CONTINUE;
            }



    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
        Path new_dest=destination.resolve(source.relativize(file));

            try {
                Files.copy(file,new_dest);
                System.out.println("Файл: " + file.getFileName() + " Скопирован");
            } catch (IOException e) {
                System.out.println("Файл:" + file.getFileName() + " уже существует");
                //e.printStackTrace();
            }
            finally {
                return FileVisitResult.CONTINUE;
            }


    }
}


