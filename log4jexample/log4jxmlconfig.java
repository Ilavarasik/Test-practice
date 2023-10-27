package log4jexample;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.xml.DOMConfigurator;

public class log4jxmlconfig {

        static Logger logger=Logger.getLogger(log4jxmlconfig.class);
    public static void main(String[] args) {
        DOMConfigurator.configure("log4j.xml");
            logger.debug("this is a debug message");
            logger.info("This is info");
            logger.warn("This is warning");
            logger.error("This is an error");
            logger.fatal("This is fatal");
        }
    }

