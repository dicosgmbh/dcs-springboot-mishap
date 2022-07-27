/**
 * (c) DICOS GmbH, 2020
 *
 * $Id$
 */

package de.dicos.mishap.restful.api; // FIXME Taken from de.dicos.smspring.common.api - still needed or replace by actuator endpoints?

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 *
 * @author bhochberger
 */
@RestController
@RequestMapping(path = "/rest/mystery")
public class MysteryController
{
	// /////////////////////////////////////////////////////////
	// Class Members
	// /////////////////////////////////////////////////////////
	/** */
	//private static Logger log = LoggerFactory.getLogger(OkController.class);


	// /////////////////////////////////////////////////////////
	// Constructors
	// /////////////////////////////////////////////////////////
	/**
	 */
	public MysteryController()
	{
	}

	// /////////////////////////////////////////////////////////
	// Methods
	// /////////////////////////////////////////////////////////
	@GetMapping(value = "secured", produces = MediaType.TEXT_PLAIN_VALUE)
    public String securedGet(){
        return "I am a secret. Why am i not secured?";
    }

	// /////////////////////////////////////////////////////////
	// Inner Classes
	// /////////////////////////////////////////////////////////


}
