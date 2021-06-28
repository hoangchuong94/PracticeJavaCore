package IO.writefile;

import java.io.*;
import java.util.ArrayList;

public class csv {
    public static void main(String[] args) {
        File file = new File("test.csv");
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }

        ArrayList<Student> students = new ArrayList<>();
        Student student = new Student("chuong",25);

        students.add(student);
        students.add(student);
        students.add(student);
        students.add(student);
        students.add(student);
        students.add(student);
        students.add(student);
        students.add(student);
        students.add(student);

        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("test.csv"));
            for (int i = 0; i < students.size(); i++) {
                bufferedWriter.write(students.get(i).toStringCSV());
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        ArrayList<Student> students1 = new ArrayList<>();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("test.csv"));

            String line = "";
            while ((line = bufferedReader.readLine()) != null){
                String[] strLine = line.split(",");
                students1.add(new Student(strLine[0],Integer.parseInt(strLine[1])));
            }
            for (int i = 0; i < students1.size(); i++) {
                System.out.println(students1.get(i).toString());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



}
