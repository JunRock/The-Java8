import org.yaml.snakeyaml.emitter.ScalarAnalysis;

import java.io.*;
import java.util.Scanner;

public class IoClass {
    public static void main(String[] args) {
        /*
        Buffer방식
         */
        /*
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<10;i++){
            sb.append(i);
        }
        System.out.println(sb);*/
    }

    public void inputOutput() throws IOException {
        byte[] bytes={1,2,3,4,5,6,7,8,9};
        InputStream inputStream=new ByteArrayInputStream(bytes);
        int num;
        while((num=inputStream.read())!=-1){
            System.out.println(num);
        }
    }

    public void outputStream() throws IOException {
        byte[] bytes={1,2,3,4,5,6,7,8,9};
        File f=new File("data.txt");
        OutputStream outputStream=new FileOutputStream(f);
        for(byte b : bytes)
            outputStream.write(b);
    }

    public void system(){
        Scanner sc=new Scanner(System.in);
        System.out.println(1);
        System.err.println("error");
    }

    public final class System{
        public static final InputStream in = null;
        public static final PrintStream out = null;
        public static final PrintStream err = null;
    }
}
