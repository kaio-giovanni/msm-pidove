package com.example.msmpidove.utils;

import com.example.msmpidove.log.Logger;

public class PropertiesUtils {

    private static final Logger logger = new Logger(PropertiesUtils.class);

    private PropertiesUtils () {
        // Do nothing
    }

    public static void loadByDotEnv () {
        logger.info("Setting properties by env...");
        System.setProperty("spring.datasource.url", DotEnvUtils.getDatabaseUrl());
        System.setProperty("spring.datasource.username", DotEnvUtils.getDatabaseUserName());
        System.setProperty("spring.datasource.password", DotEnvUtils.getDatabasePassword());
    }
}
