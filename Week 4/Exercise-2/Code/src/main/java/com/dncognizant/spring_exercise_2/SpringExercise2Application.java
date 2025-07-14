package com.dncognizant.spring_exercise_2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringExercise2Application {

    private static final Logger log = LoggerFactory.getLogger(SpringExercise2Application.class);

    public static void main(String[] args) {
        log.info("=== NationApp Initialization ===");
        loadNationFromXML();
        log.info("=== NationApp Termination ===");
    }

    public static void loadNationFromXML() {
        @SuppressWarnings("resource")
        ApplicationContext context = new ClassPathXmlApplicationContext("nation-config.xml");

        com.dncognizant.spring_exercise_2.Nation nation = context.getBean("nation", com.dncognizant.spring_exercise_2.Nation.class);
        log.info("Nation Retrieved: " + nation);
    }
}
