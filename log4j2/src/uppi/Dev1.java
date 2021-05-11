package uppi;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Dev1 {
	
	private static Logger log=LogManager.getLogger(Dev1.class.getName());

	public static void main(String[] args) {
		log.debug("click on textbox");
		log.info("gives textbox information");
		log.error("object is not displayed");
		log.fatal("something is missing");
		
	}

}
