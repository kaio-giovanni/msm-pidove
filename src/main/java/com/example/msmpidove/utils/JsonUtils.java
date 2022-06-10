package com.example.msmpidove.utils;

import java.util.Arrays;
import java.util.Collection;

import com.example.msmpidove.exceptions.JsonRuntimeException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

public class JsonUtils {

    public static <T> T fromJson(String json, Class<T> clazz) {
        try {
            return getMapper().readValue(json, clazz);
        } catch (JsonProcessingException e) {
            throw new JsonRuntimeException(e);
        }
    }

    public static <T> Collection<T> fromJsonAsCollection(String json, Class<T[]> clazz) {
        try {
            return Arrays.asList(getMapper().readValue(json, clazz));
        } catch (JsonProcessingException e) {
            throw new JsonRuntimeException(e);
        }
    }

    public static String toJson(Object object) {
        try {
            return getMapper().writeValueAsString(object);
        } catch (JsonProcessingException e) {
            throw new JsonRuntimeException(e);
        }
    }

    public static ObjectMapper getMapper() {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
        objectMapper.registerModule(new JavaTimeModule());
        return objectMapper;
    }

}
