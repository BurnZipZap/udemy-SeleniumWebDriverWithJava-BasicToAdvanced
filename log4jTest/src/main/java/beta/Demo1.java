package beta;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Demo1 {
	private static Logger logger = LogManager.getLogger(Demo1.class.getName());

	public static void main(String[] args) {

		logger.debug("debugmsg");
		logger.info("infomsg");
		logger.error("errormsg");
		logger.fatal("fatalmsg");
	}
}
