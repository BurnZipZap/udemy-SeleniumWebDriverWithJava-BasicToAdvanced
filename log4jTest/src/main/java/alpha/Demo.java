package alpha;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Demo {
	private static Logger logger = LogManager.getLogger(Demo.class.getName());

	public static void main(String[] args) throws InterruptedException {
		/*
		 * File with name prints.log have been actual log data
		 * Other file - old logs
		 */
		
		for (int i = 0; i < 20; i++) {
			logger.debug("debugmsg" + i);
			Thread.sleep(100);
			logger.info("infomsg" + i);
			Thread.sleep(100);
			logger.error("errormsg" + i);
			Thread.sleep(100);
			logger.fatal("fatalmsg" + i);
			Thread.sleep(100);
		}
	}
}
