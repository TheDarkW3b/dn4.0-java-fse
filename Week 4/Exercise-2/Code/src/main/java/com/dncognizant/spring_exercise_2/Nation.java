package com.dncognizant.spring_exercise_2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Nation {
    private static final Logger logger = LoggerFactory.getLogger(Nation.class);

    private String code;
    private String name;

    public Nation() {
        logger.debug("Nation object instantiated.");
    }

    public String getCode() {
        logger.debug("Accessed code: {}", code);
        return code;
    }

    public void setCode(String code) {
        logger.debug("Setting code to: {}", code);
        this.code = code;
    }

    public String getName() {
        logger.debug("Accessed name: {}", name);
        return name;
    }

    public void setName(String name) {
        logger.debug("Setting name to: {}", name);
        this.name = name;
    }

    @Override
    public String toString() {
        return "Nation [code=" + code + ", name=" + name + "]";
    }
}
