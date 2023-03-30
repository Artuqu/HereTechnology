package com.here.Objects;

import java.util.List;

public class Directory {

    private String name;
    private List<File> files;

    public String getName() {
        return name;
    }

    public List<File> getFiles() {
        return files;
    }

    public Directory(String name, List<File> files) {
        this.name = name;
        this.files = files;
    }

    @Override
    public String toString() {
        return "Directory{" +
                "name='" + name + '\'' +
                ", files=" + files +
                '}';
    }
}
