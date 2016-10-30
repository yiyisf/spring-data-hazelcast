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
public class WhenCU extends MyLog {
	private static final long serialVersionUID = 1L;

	@CreatedDate
	protected Date		whenCreated;
	@LastModifiedDate
	protected Date		whenUpdated;

}
