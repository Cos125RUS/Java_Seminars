import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.*;


public class program {
   public static int Getcount(File [] arr){
        int count = 0;
        for (File file : arr) {
            if (file.isFile()) {
                count+=1;
            }
        }
        return count;
    }
    public static String[] GetStringMass(int count, File[] arr){
        String[] Res = new String[count];
        for (int i = 0; i < count; i++) {
            Res[i] =arr[i].getName();
        }
        return Res;
    }

    public static void WriteToFile(String name, String[] mass) throws IOException {
        FileWriter writer = new FileWriter(name);
        for(String str: mass) {
            writer.write(str + System.lineSeparator());
        }
        writer.close();
    }
    public static void main(String[] args) throws IOException {
      Logger logger = Logger.getLogger(program.class.getName());
      FileHandler fh = new FileHandler("log.xml");
      logger.addHandler(fh);
      XMLFormatter xml = new XMLFormatter();
      fh.setFormatter(xml);

        File folder = new File("C:\\Users\\Валерий\\Documents\\Учёба\\GeekBrains\\Диплом");
        File[] listOfFiles = folder.listFiles();
        String[] Res = GetStringMass(Getcount(listOfFiles), listOfFiles);
        WriteToFile("file.txt", Res);
        logger.info("File write");
    }
}