package beta;

import org.apache.logging.log4j.*;

public class Demo1 {

	private static Logger log = LogManager.getLogger(Demo1.class.getName()); // Create/Initialize Log object with LogManager function, it accepts class argument 
	public static void main(String[] args) {
		
		log.debug("I am debugging");
			log.info("Object is present");
		log.warn("This is warn");
			log.error("Object is not present");
		log.fatal("This is fatal");
		
	}

}
