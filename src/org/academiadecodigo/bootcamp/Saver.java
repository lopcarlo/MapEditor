package org.academiadecodigo.bootcamp;

import java.io.*;

/**
 * Created by codecadet on 22/02/2019.
 */
public class Saver{

    public void save(String string) throws IOException {


        FileWriter writer = new FileWriter("resources/save");
        BufferedWriter bwriter = new BufferedWriter(writer);
        bwriter.write(string);
        bwriter.flush();
        bwriter.close();


    }


    public void load() throws IOException {

        FileReader reader = new FileReader("resources/save");
        BufferedReader breader = new BufferedReader(reader);

        try {
            breader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



}
