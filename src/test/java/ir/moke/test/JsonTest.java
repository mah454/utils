package ir.moke.test;

import com.fasterxml.jackson.core.JsonProcessingException;
import ir.moke.utils.JsonUtils;

import java.util.List;

public class JsonTest {
    static void main() throws JsonProcessingException {

        String json = """
                [
                  {
                    "id" : 1,
                    "name" : "ali"
                  },
                  {
                    "id" : 2,
                    "name" : "mahdi"
                  },
                  {
                    "id" : 3,
                    "name" : "parsa"
                  }
                ]
                """;
        List<Person> list = JsonUtils.toList(json, Person.class);

        System.out.println(list);
    }
}
