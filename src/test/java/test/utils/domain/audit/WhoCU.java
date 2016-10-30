package test.utils.domain.audit;

import org.springframework.data.keyvalue.annotation.KeySpace;

import test.utils.Constants;

/**
 * FIXME
 * 
 * @author Neil Stevenson
 */
@KeySpace(Constants.LOG_MAP_NAME)
public class WhoCU extends MyLog {
	private static final long serialVersionUID = 1L;

	@CreatedBy
	protected String 	whoCreated;
	@UpdatedBy
	protected String 	whoUpdated;

}
