package com.company;
import java.io.*;

public class FileWork {
    public void writeAllInfoToFile(Closet closet){
        try {


            FileOutputStream outStream = new FileOutputStream("C://Users//Dmytro//OneDrive//Рабочий стол//JavaProg//src//com//company//Info.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outStream);

            objectOutputStream.writeObject(closet);
            outStream.close();
            System.out.println("successful");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}
