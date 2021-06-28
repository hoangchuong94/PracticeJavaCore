package IO.writefile;

import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class Main {

        public static void main(String[] args) throws IOException {

            Student studen = new Student("Hung", 19);

            List<Student> list = new ArrayList<Student>();
            list.add(new Student("HUNG", 14));
            list.add(new Student("HAN", 11));
            list.add(new Student("HOANG", 15));
            list.add(new Student("HUYNH", 11));
            list.add(new Student("HUY", 16));

            File file = new File("hello.txt");

            if(!file.exists()){
                file.createNewFile();
            }

    }
}

