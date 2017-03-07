package test.utils.domain.audit;

import java.util.Date;

import org.springframework.data.keyvalue.annotation.KeySpace;

import test.utils.Constants;

/**
 * <P>Domain object to test {@link 
 * org.springframework.data.keyvalue.repository.config.EnableKeyValueAuditing
 * EnableKeyValueAuditing},
 * for the insert date.
 * </P>
 * 
 * @author Neil Stevenson
 */
@KeySpace(Constants.LOG_MAP_NAME)
public class WhenC extends MyLog {
	private static final long serialVersionUID = 1L;

	@CreatedDate
	protected Date		whenCreated;

}
