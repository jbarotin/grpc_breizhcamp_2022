package org.example;

import com.breizhcamp.grpc.protos.MessageBreizhcamp;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/**
 * Hello world!
 *
 */
public class Simple
{
    public static void main( String[] args )
    {

        MessageBreizhcamp bzh = MessageBreizhcamp.newBuilder().setGreen(1)
                .setIt("yes")
                .setIsBeautiful(2).build();


        try {
            FileChannel fileChannel = FileChannel.open(Paths.get("test.bin"), StandardOpenOption.CREATE, StandardOpenOption.WRITE, StandardOpenOption.TRUNCATE_EXISTING);
            fileChannel.write(ByteBuffer.wrap(bzh.toByteArray()));
            fileChannel.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("proto : "+bzh.toByteArray().length);

//        String json = "{'name':'John Doe','email':'jdoe@example.com','phones':[{'number':'551-4321', 'type':'HOME}";

//        System.out.println("json : "+json.length());

  /*      ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try (GZIPOutputStream gos = new GZIPOutputStream(byteArrayOutputStream)){
            gos.write(json.getBytes());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        byte[] jsonGziped = byteArrayOutputStream.toByteArray();

        System.out.println("jsonGz : "+jsonGziped.length);
        */


    }
}
