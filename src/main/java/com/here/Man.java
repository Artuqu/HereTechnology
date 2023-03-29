package com.here;

public class Man<D extends Comparable<D>> extends JsonElement<D> {

    private String name;
    private int age;
    private Object car;


    public static void main(String[] args) {
        JsonElement json = new Man();
        String string =
                "{'name':'John', 'age':'30', 'car':'null', 'blonde':'true'}";
        json.parseJson(string);
        System.out.println("Object name: " + json.setObject(json));
    }

}
