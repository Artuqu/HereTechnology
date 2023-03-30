package com.here.Objects;

public class File {


    private String fileName;
    private long size;

    public File(String fileName, long size) {
        this.fileName = fileName;
        this.size = size;
    }

    public long getSize() {
        return size;
    }

    public String getFileName() {
        return fileName;
    }

    @Override
    public String toString() {
        return "File{" +
                "fileName='" + fileName + '\'' +
                ", size=" + size +
                '}';
    }
}
