package test.utils.domain.audit;

import org.springframework.data.keyvalue.annotation.KeySpace;

import test.utils.Constants;

/**
 * <P>Domain object to test {@link 
 * org.springframework.data.keyvalue.repository.config.EnableKeyValueAuditing
 * EnableKeyValueAuditing},
 * for the insert and last change principals.
 * </P>
 * 
 * @author Neil Stevenson
 */
@KeySpace(Constants.LOG_MAP_NAME)
public class WhoCU extends MyLog {
	private static final long serialVersionUID = 1L;

	@CreatedBy
	protected String 	whoCreated;
	@LastModifiedBy
	protected String 	whoUpdated;

}
