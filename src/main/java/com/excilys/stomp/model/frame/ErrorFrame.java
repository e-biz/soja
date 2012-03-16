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
public class ErrorFrame extends Frame {

	public ErrorFrame(String shortMessage) {
		super(Frame.COMMAND_ERROR, new Header().set(Header.HEADER_MESSAGE, shortMessage), null);
	}

	public ErrorFrame setDescription(String description) {
		setBody(description);
		return this;
	}

	public ErrorFrame setDescription(String description, String contentType) {
		setDescription(description);
		getHeader().set(Header.HEADER_CONTENT_TYPE, contentType);
		getHeader().set(Header.HEADER_CONTENT_LENGTH, String.valueOf(description.length()));
		return this;
	}

	public ErrorFrame setReceipId(String receipId) {
		getHeader().set(Header.HEADER_RECEIPT_ID, receipId);
		return this;
	}

}
