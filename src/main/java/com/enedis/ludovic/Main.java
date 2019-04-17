package com.enedis.ludovic;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Main {

    private static final Logger logger = LogManager.getLogger();

    public static void main(String[] args) {

        Menu menu = new Menu();

        logger.info("Execution de l'application");
        Messages.bienvenue();
        menu.gameChoice();
        logger.info("Fermeture de l'application");
    }
}

