package backend.utility;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileUtility {
    public static void createFile(String FileNameWithPath){
        File file=new File(FileNameWithPath);
        boolean fileCreated=false;
        try {
            fileCreated=file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
//        return fileCreated;
    }

    public static void readAndPrintFile(String fileName) {
        Scanner scanner=null;
        try {
            File file=new File(fileName);
            scanner=new Scanner(file);
            while (scanner.hasNextLine()){
                String line= scanner.nextLine();
                System.out.println(line);
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if(scanner!=null){
                scanner.close();
            }

        }

    }

    public static void writeToFile(String filenameWithPath,String content){
        try {
            FileWriter fileWriter=new FileWriter(filenameWithPath);
            fileWriter.append(content);
            fileWriter.close();
        }
        catch (Exception e){

        }
    }
    public static void main(String[] args) {
        String nameOfNewFile="C:\\Users\\Good\\OneDrive\\Desktop\\Coding\\Volante Training\\JavaFileHanding\\data\\practice\\file\\"+"create-File-2.txt";
        createFile(nameOfNewFile);
        writeToFile(nameOfNewFile,"Your ok or not");
        readAndPrintFile(nameOfNewFile);
    }

}
