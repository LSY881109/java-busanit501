package d250611.ch8_3;

import java.io.File;

public class FileTest_Ex2 {
    public static void main(String[] args) {
        // 새로운 폴더 만들기, backup 폴더 만들기.
        // File dir = new File("backup");
        // dir.mkdir();

        // 2. 파일의 크기 확인 (용량 확인 )test.txt
        File file = new File("test.txt");
        System.out.println("파일 용량 확인 : " + file.length());
    }
}
