package com.here;

import com.here.Objects.Directory;
import com.here.Objects.File;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CalculateDirectorySize {

    static List<String> filesNameList = new ArrayList<>();
    static List<Long> filesSizeList = new ArrayList<>();
    static List<String> directoriesNameList = new ArrayList<>();

    static List<String> listFiles(String dir) {
        filesNameList.add(dir);
        return filesNameList;
    }

   static List<String> listDirectories(String dir) {
        directoriesNameList.add(dir);
        return directoriesNameList;
    }

    static long fileSize(String file) {
        return Long.parseLong(file);
    }

    static long directorySize(String directory) {
        return Long.parseLong(directory);
    }


    public static void main(String[] args) {

        List<File> fullFileList = new ArrayList<>();
        listFiles("dir");
        listFiles("dir2");
        filesSizeList.add(fileSize("2000"));
        filesSizeList.add(fileSize("3000"));

        File file = new File(filesNameList.get(0), filesSizeList.get(0));
        File file2 = new File(filesNameList.get(1), filesSizeList.get(1));

        Collections.addAll(fullFileList, file, file2);

        listDirectories("newDirectory");

        Directory directory = new Directory(directoriesNameList.get(0), directorySize("20"), fullFileList);

        calculateDirectorySize(directory);

    }

    private static void calculateDirectorySize(Directory directory) {
        List<File> files = directory.getFiles();
        long size = directory.getSize();
        for (int i = 0; i < files.size(); i++) {
            size += files.get(i).getSize();
        }
        System.out.println("Size of " + directory.getFileName() + " " + "is " + size);
    }
}
