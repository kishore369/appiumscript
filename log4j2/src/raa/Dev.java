package raa;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;




public class Dev {
	
	private static Logger log=LogManager.getLogger(Dev.class.getName());

	public static void main(String[] args) {
		log.debug("click on checkbox");
		log.info("gives checkbox information");
		log.error("element is not displayed");
		log.fatal("object is missing");
		
	}

}
