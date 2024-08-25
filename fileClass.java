// explain file class with its methods

import java.io.File;

public class exam17{
    public static void main(String[] args) {
        File file = new File("example.txt");

        try{
            boolean created = file.createNewFile();
            System.out.println("file created : "+created);

        }catch (Exception e){
            e.printStackTrace();
        }

        System.out.println("file name :"+file.getName());
        System.out.println("file path : " +file.getPath());
        System.out.println("is directory : " + file.isDirectory());
        System.out.println("is file : "+ file.isFile());
        System.out.println("file size : "+ file.length());

        File renamedFile = new File("rfile.txt");
        boolean renamed = file.renameTo(renamedFile);
        System.out.println("file renamed :"+ renamed);

        boolean deleted = renamedFile.delete();
        System.out.println("file deleted :"+deleted);
    }
}