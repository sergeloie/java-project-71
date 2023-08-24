package hexlet.code.serializers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import hexlet.code.DifferBuilder;

import java.util.List;

public class serializeJSON {


    public static String diffToJSON(List<DifferBuilder> diffList) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.writeValueAsString(diffList);
    }

}