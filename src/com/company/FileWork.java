package com.company;
import java.io.*;
import java.util.Arrays;

public class FileWork {
    public void writeAllInfoToFile(Closet closet) throws IOException {

        File file = new File("Data.txt");
        file.createNewFile();

        FileWriter writer = new FileWriter(file);
        writer.write("Books: " + Arrays.toString(closet.getBooksInCloset()) + "\n");
        writer.write("Clothes: " + Arrays.toString(closet.getClothesInCloset()) + "\n");
        writer.write("Drinks: " + Arrays.toString(closet.getDrinkablesInCloset()) + "\n");
        writer.write("Foods: " + Arrays.toString(closet.getFoodInCloset()) + "\n");
        writer.write("Shoes: " + Arrays.toString(closet.getShoesInCloset()) + "\n");
        writer.flush();
        writer.close();

    }

    public boolean saveData(Closet closet) throws IOException {
        boolean bool = false;

        File file = new File("Data.data");
        ObjectOutputStream oos = null;
        FileOutputStream fos = new FileOutputStream(file);
        if(fos != null ){
            oos = new ObjectOutputStream(fos);
            oos.writeObject(closet);
            bool = true;
        }
        if(oos != null){
            oos.close();
        }

        return bool;
    }


    public Closet downloadData() throws IOException, ClassNotFoundException {
        File file = new File("Data.data");
        ObjectInputStream ois = null;
        FileInputStream fis = new FileInputStream(file);
        if(fis!=null){
            ois = new ObjectInputStream(fis);
            Closet closet = (Closet) ois.readObject();
            return closet;
        }
        ois.close();
        throw new InvalidObjectException("Object failed");
    }
}
