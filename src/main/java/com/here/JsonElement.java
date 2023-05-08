package com.here;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.here.Objects.Person;

import java.io.FileReader;
import java.io.IOException;

public class JsonElement {


    private static void parseJson() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        String filePath = "src/main/java/com/here/Objects/patternPerson.json";
        FileReader fileReader = new FileReader(filePath);
        Person p = objectMapper.readValue(fileReader, Person.class);

        System.out.println("name: " + p.getName() + ", " + "age: " + p.getAge() + ", " + "has car: " + p.getCar()
                + ", " + "is blonde: " + p.isBlonde() + ", " + "car list: " + p.getCars());

    }

    public static void main(String[] args) throws IOException {

        String string = "{" +
                "'name':'John', 'age':'30'," +
                " 'car':'null', 'List':'['Ford', 'BMW', 'Mazda']', 'blonde':'true'}";

        parseJson();

    }
}
