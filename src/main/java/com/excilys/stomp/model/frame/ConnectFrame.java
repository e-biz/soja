/**
###############################################################################
# Contributors:
#     Damien VILLENEUVE - initial API and implementation
###############################################################################
 */
package com.excilys.stomp.model.frame;

import com.excilys.stomp.model.Frame;
import com.excilys.stomp.model.Header;

/**
 * @author dvilleneuve
 * 
 */
public class ConnectFrame extends Frame {

	public ConnectFrame(String acceptVersion, String hostname) {
		super(Frame.COMMAND_CONNECT, new Header().set(Header.HEADER_ACCEPT_VERSION, acceptVersion).set(Header.HEADER_HOST, hostname), null);
	}

	public ConnectFrame(String acceptVersion, String hostname, String login, String password) {
		this(acceptVersion, hostname);
		getHeader().set(Header.HEADER_LOGIN, login);
		getHeader().set(Header.HEADER_PASSCODE, password);
	}

}