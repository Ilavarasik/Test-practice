package log4jexample;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class BasicConfiguratorExample {


  static Logger logger=Logger.getLogger(BasicConfiguratorExample.class);

    public static void main(String[] args) {
        BasicConfigurator.configure();
        logger.debug("this is a debug message");
        logger.info("This is info");
        logger.warn("This is warning");
        logger.error("This is an error");
        logger.fatal("This is fatal");
    }}
