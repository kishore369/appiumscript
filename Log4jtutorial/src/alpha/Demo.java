package alpha;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;



public class Demo {
	private static Logger log=LogManager.getLogger(Demo.class.getName());
	
	public static void main(String[] args) {
		log.debug("i am fine");
		log.info("i am not fine");
		log.fatal("kingmaker");
		log.error("object is present");
		

	}

}
