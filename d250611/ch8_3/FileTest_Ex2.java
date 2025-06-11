package d250611.ch8_3;

import java.io.File;

public class FileTest_Ex2 {
    public static void main(String[] args) {
        // 새로운 폴더 만들기, backup 폴더 만들기.
        File dir = new File("backup");
        dir.mkdir();
    }
}
