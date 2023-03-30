package com.here;

import java.util.ArrayList;
import java.util.List;

public abstract class JsonElement<D> {

    private String name;
    private int number;
    private List<D> array;
    private Object object;
    private boolean trueOrFalse;
    private Object nullObject;


    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public List<D> getArray() {
        return array;
    }

    public Object getObject() {
        return object;
    }

    public boolean isTrueOrFalse() {
        return trueOrFalse;
    }

    public Object getNullObject() {
        return null;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setArray(List<D> array) {
        this.array = array;
    }

    public Object setObject(Object object) {
        this.object = object;
        return object;
    }

    public void setTrueOrFalse(boolean trueOrFalse) {
        this.trueOrFalse = trueOrFalse;
    }

    public void setNullObject(Object nullObject) {
        this.nullObject = nullObject;
    }

    public JsonElement() {
    }

    JsonElement<D> parseJson(String json) {

        JsonElement<D> js = new JsonElement<D>() {
            @Override
            public String getName() {
                return super.getName();
            }

            @Override
            public int getNumber() {
                return super.getNumber();
            }

            @Override
            public List<D> getArray() {
                return super.getArray();
            }

            @Override
            public Object getObject() {
                return super.getObject();
            }

            @Override
            public boolean isTrueOrFalse() {
                return super.isTrueOrFalse();
            }

            @Override
            public Object getNullObject() {
                return super.getNullObject();
            }

            @Override
            JsonElement<D> parseJson(String json) {
                return super.parseJson(json);
            }
        };
        String[] findArray = json.replaceAll("'", "").replaceAll("\\{", "")
                .replaceAll("}", "").replace(",", "").replace(":", " ")
                .replace(",", "").split("List");

        String firstNoArray = findArray[0];
        String[] splitArray = findArray[1].split("] ");
        String secondNoArray = splitArray[1];
        String[] array = splitArray[0].replaceAll(" \\[", "").replace(",", "").split(" ");


        StringBuilder fullList = new StringBuilder();
        fullList.append(firstNoArray);
        fullList.append(secondNoArray);

        String[] parsing = fullList.toString().replaceAll("\\s+$", "").split(" ");

        List<D> objectList = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            objectList.add((D) array[i]);
        }
        js.setArray(objectList);


        for (int i = 0; i < parsing.length; i++) {
            if (parsing[i].equals("name")) {
                js.setName(parsing[i + 1]);
            } else if (parsing[i].equals("null")) {
                js.setNullObject(null);
            } else if (parsing[i].equals("age")) {
                js.setNumber(Integer.parseInt(parsing[i + 1]));
            } else if (parsing[i].equals("true")) {
                js.setTrueOrFalse(true);
            }
        }

        System.out.println("name: " + js.getName());
        System.out.println("age: " + js.getNumber());
        System.out.println("blonde: " + js.isTrueOrFalse());
        System.out.println("Array: " + js.getArray());
        System.out.println("car: " + js.getNullObject());
        return js;
    }
}
