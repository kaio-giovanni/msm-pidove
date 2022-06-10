package com.example.msmpidove.utils;

import io.github.cdimascio.dotenv.Dotenv;

public class DotEnvUtils {

    private DotEnvUtils () {
    }

    private static final Dotenv dotenv = Dotenv.configure()
            .ignoreIfMissing()
            .load();

    public static String getDatabaseUrl () {
        return dotenv.get("DB_URL");
    }

    public static String getDatabaseUserName () {
        return dotenv.get("DB_USERNAME");
    }

    public static String getDatabasePassword () {
        return dotenv.get("DB_PASSWORD");
    }

    public static String getRabbitMQUrl() {
        return dotenv.get("RABBITMQ_URL");
    }

}
