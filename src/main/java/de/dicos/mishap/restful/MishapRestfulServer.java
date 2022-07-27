/**
 * (c) DICOS GmbH, 2018
 *
 * $Id$
 */

package de.dicos.mishap.restful;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 *
 * @author sth
 */
@SpringBootApplication(scanBasePackages = {"de.dicos.mishap"}) 
public class MishapRestfulServer
{
	// /////////////////////////////////////////////////////////
	// Class Members
	// /////////////////////////////////////////////////////////
	/** */
	// private static Logger log = LoggerFactory.getLogger(PhCpcRestfulServer.class);

	// /////////////////////////////////////////////////////////
	// Constructors
	// /////////////////////////////////////////////////////////
	/**
	 */
	public MishapRestfulServer()
	{
	}

	// /////////////////////////////////////////////////////////
	// Methods
	// /////////////////////////////////////////////////////////
	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		new SpringApplicationBuilder(MishapRestfulServer.class)
			.run(args);
	}

	// /////////////////////////////////////////////////////////
	// Inner Classes
	// /////////////////////////////////////////////////////////


}
