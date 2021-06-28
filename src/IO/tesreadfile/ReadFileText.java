package IO.tesreadfile;

import java.io.*;

public class ReadFileText {
    public void readFileText(String fileInput) {

        try{

            File file = new File(fileInput);

            if(!file.exists()){
                throw new FileNotFoundException();
            }

            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));

            String line = "";
            int sum = 0;

            while((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
                sum += Integer.parseInt(line);

            }
            bufferedReader.close();
            System.out.println("tong" + sum);
        }catch (Exception e){
            System.err.println("file khong ton tai");
        }
    }
}
