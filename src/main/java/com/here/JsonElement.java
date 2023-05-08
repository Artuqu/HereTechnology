package com.here;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.here.Objects.Man;

import java.io.FileReader;
import java.io.IOException;

public class JsonElement {


    private static void parseJson(String s) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        Man man = objectMapper.readValue(s, Man.class);
        System.out.println("name: " + man.getName() + ", " + "age: " + man.getAge() + ", " + "has car: " + man.getCar()
                + ", " + "is blonde: " + man.isBlonde() + ", " + "car list: " + man.getCars());
    }

    private static void parseJson() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        String filePath = "src/main/java/com/here/Objects/patternPerson.json";
        FileReader fileReader = new FileReader(filePath);
        Man man = objectMapper.readValue(fileReader, Man.class);

        System.out.println("name: " + man.getName() + ", " + "age: " + man.getAge() + ", " + "has car: " + man.getCar()
                + ", " + "is blonde: " + man.isBlonde() + ", " + "car list: " + man.getCars());

    }

    public static void main(String[] args) throws IOException {

        String o =
                "{\"name\":\"Emily\", \"age\": \"40\", \"car\": \"object\" , \"cars\": [\"Ford\", \"BMW\", \"Mazda\"], \"blonde\":\"false\"}";

        parseJson(o);
        parseJson();
    }
}
