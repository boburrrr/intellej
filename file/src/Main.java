import java.io.File;

public class Main {
    public static void main(String[] args) {
        int i = 1;
        while (i<10){
            String path = "D:\\JavaLesson"+"\\module"+i;
            File file = new File(path);
            file.mkdirs();
            int i1 = 1;
            while (i1<13){
                path = "D:\\JavaLesson"+"\\module"+i+"\\lesson"+i1;
                File file1 = new File(path);
                file1.mkdirs();
                i1++;
            }
            i++;
        }

    }
}