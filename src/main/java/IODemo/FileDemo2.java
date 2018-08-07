package IODemo;

import java.io.*;

/**
 * Created by Administrator on 2018/8/6.
 */
public class FileDemo2 {
    public static void main(String[] args) throws Exception {
        printFiles(new File("D:\\scala2\\learn\\demo"),1);
    }
    public static void printFiles(File dir,int tab) throws IOException {
        if(dir.isDirectory()){
            File next[] = dir.listFiles();
            for(int i = 0;i<next.length;i++){
                for(int j = 0;j<tab;j++){
                    System.out.print("|--");
                }
                System.out.println(next[i].getName());
                if(next[i].isDirectory()){
                    printFiles(next[i],tab+1);
                }

            }
        }
    }
}
