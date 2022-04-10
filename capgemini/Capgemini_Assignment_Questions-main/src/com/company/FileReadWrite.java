package com.company;
import java.io.*;
class FileReadWrite {
    public static void main(String arg[]) {
        File inf = new File("C:\\Users\\Asus\\OneDrive\\Capgemini_Practice_Questions\\out\\production\\Capgemini_Practice_Questions\\com\\company\\Input.txt");
        File outf = new File("C:\\Users\\Asus\\OneDrive\\Capgemini_Practice_Questions\\out\\production\\Capgemini_Practice_Questions\\com\\company\\Output.txt");
        FileReader ins = null;
        FileWriter outs = null;
        try {
            ins = new FileReader(inf);
            outs = new FileWriter(outf);
            int ch;
            while ((ch = ins.read()) != -1) {
                outs.write(ch);
            }
            System.out.println("SuccessFully Copied!!!");
        } catch (IOException e) {
            System.out.println(e);
            System.exit(-1);
        } finally {
            try {
                ins.close();
                outs.close();
            } catch (IOException e) {}
        }
    }
}