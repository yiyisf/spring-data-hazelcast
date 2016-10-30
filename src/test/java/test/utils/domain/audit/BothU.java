package test.utils.domain.audit;

import java.util.Date;

import org.springframework.data.keyvalue.annotation.KeySpace;

import test.utils.Constants;

/**
 * FIXME
 * 
 * @author Neil Stevenson
 */
@KeySpace(Constants.LOG_MAP_NAME)
public class BothU extends MyLog {
	private static final long serialVersionUID = 1L;

	@UpdatedDate
	protected Date		whenUpdated;
	@UpdatedBy
	protected String 	whoUpdated;

}
