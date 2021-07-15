import javax.imageio.IIOException;
import java.io.*;

public class TestSingleton {


        public static void main(String[] args) throws IOException,ClassNotFoundException {
            //  Singleton s1 = new Singleton();
            Singleton s1 = Singleton.getInstance();


            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("/Users/z0045qd/Desktop/singletonfile.txt")));
            oos.writeObject(s1);
            oos.close();
            Singleton s4 = null;
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("/Users/z0045qd/Desktop/singletonfile.txt")));

s4 = (Singleton) ois.readObject();
ois.close();
            Singleton s2 = Singleton.getInstance();
            Singleton s3 = null;
            try{
                   // s3 = (Singleton) s1.clone();
            }catch (Exception e){
                System.out.println(e.getMessage());
            }

            System.out.println(s1 == s4);
        }

}
