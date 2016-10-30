package test.utils.domain.audit;

import org.springframework.data.keyvalue.annotation.KeySpace;

import test.utils.Constants;

/**
 * FIXME
 * 
 * @author Neil Stevenson
 */
@KeySpace(Constants.LOG_MAP_NAME)
public class WhoU extends MyLog {
	private static final long serialVersionUID = 1L;

	@LastModifiedBy
	protected String 	whoUpdated;

}
