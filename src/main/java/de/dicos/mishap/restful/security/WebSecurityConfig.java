/**
 * (c) DICOS GmbH, 2020
 *
 * $Id$
 */

package de.dicos.mishap.restful.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 *
 * @author bhochberger
 */
@Configuration
@EnableWebSecurity
public class WebSecurityConfig
	extends WebSecurityConfigurerAdapter
{
	// /////////////////////////////////////////////////////////
	// Class Members
	// /////////////////////////////////////////////////////////
	/** */
	// private static Logger log = LoggerFactory.getLogger(WebSecurityConfig.class);
    // /////////////////////////////////////////////////////////
	// Constructors
	// /////////////////////////////////////////////////////////
	/**
	 */
	public WebSecurityConfig()
	{
	}

	// /////////////////////////////////////////////////////////
	// Methods
	// /////////////////////////////////////////////////////////
	/**
	 * {@inheritDoc}
	 *
	 * @see org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter#configure(org.springframework.security.config.annotation.web.builders.HttpSecurity)
	 */
	@Override
	protected void configure(HttpSecurity httpSecurity)
		throws Exception
	{
		// Requests ohne Authentisierung
		httpSecurity.authorizeRequests()
		.antMatchers("/rest/ok")
			.permitAll()
		.antMatchers("/mystery/**").authenticated()
	    	.and()
	    	.httpBasic();
   

	}	

	// /////////////////////////////////////////////////////////
	// Inner Classes
	// /////////////////////////////////////////////////////////


}
