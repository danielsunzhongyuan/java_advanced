package com.zsun.java.chapter6;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * Created by qzou at 2019-12-21 00:07
 *
 * @author qzou
 */
public class SerializationStaticInnerClassSingleton {
    public static void main(String[] args) {
        try (FileOutputStream fileOutputStream = new FileOutputStream(new File("myObjectFile.txt"));) {
            MyObject3 myObject3 = MyObject3.getInstance();
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(myObject3);
            objectOutputStream.close();
            System.out.println(myObject3.hashCode());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (FileInputStream fileInputStream = new FileInputStream(new File("myObjectFile.txt"))) {
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            MyObject3 myObject3 = (MyObject3) objectInputStream.readObject();
            objectInputStream.close();

            System.out.println(myObject3.hashCode());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

class MyObject3 implements Serializable {
    private static final long serialVersionUid = 88888L;

    private static class MyObjectHandler {
        private static MyObject3 myObject = new MyObject3();
    }

    private MyObject3() {
    }

    public static MyObject3 getInstance() {
        return MyObjectHandler.myObject;
    }

    /**
     * 必须要有，否则反序列化后不再是同一个实例
     * @return
     * @throws ObjectStreamException
     */
    protected Object readResolve() throws ObjectStreamException {
        System.out.println("start readResolve");
        return MyObjectHandler.myObject;
    }
}
