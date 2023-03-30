package com.here.Objects;

import java.util.List;

public class Directory extends File {


    private List<File> files;

    public Directory(String directoryName, long size, List<File> files) {
        super(directoryName, size);
        this.files = files;
    }


    public List<File> getFiles() {
        return files;
    }

    @Override
    public String toString() {
        return "Directory{" +
                "files=" + files +
                '}';
    }
}
