import java.io.Serializable;
import java.sql.SQLOutput;

class Singleton implements Cloneable, Serializable {
    private static Singleton obj = null;

    private Singleton() {
    }
    protected Object readResolve()
    {
        return obj;
    }

    public static Singleton getInstance() {
        if (obj == null) {
            synchronized (Singleton.class) {
                if (obj == null) {
                    obj = new Singleton();
                }

            }
        }

        return obj;
    }
    @Override
    protected Object clone() throws  CloneNotSupportedException{
        return new CloneNotSupportedException();
    }


}
