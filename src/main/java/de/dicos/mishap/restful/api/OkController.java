/**
 * (c) DICOS GmbH, 2020
 *
 * $Id$
 */

package de.dicos.mishap.restful.api; // FIXME Taken from de.dicos.smspring.common.api - still needed or replace by actuator endpoints?

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import de.dicos.mishap.restful.data.Ok;

/**
 *
 * @author bhochberger
 */
@RestController
@RequestMapping(path = "/rest/ok", //
	produces = MediaType.APPLICATION_JSON_VALUE)
public class OkController
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
	public OkController()
	{
	}

	// /////////////////////////////////////////////////////////
	// Methods
	// /////////////////////////////////////////////////////////
	/**
	 * @throws Exception
	 * 
	 */
	@GetMapping(value = "", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Ok> checkAvailability()
		throws Exception
	{		
        return new ResponseEntity<Ok>(new Ok(), HttpStatus.OK);
	}

	// /////////////////////////////////////////////////////////
	// Inner Classes
	// /////////////////////////////////////////////////////////


}
