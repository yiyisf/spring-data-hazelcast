package test.utils.domain.audit;

import org.springframework.data.keyvalue.annotation.KeySpace;

import test.utils.Constants;

/**
 * <P>Domain object to test {@link 
 * org.springframework.data.keyvalue.repository.config.EnableKeyValueAuditing
 * EnableKeyValueAuditing},
 * for the insert principal.
 * </P>
 * 
 * @author Neil Stevenson
 */
@KeySpace(Constants.LOG_MAP_NAME)
public class WhoC extends MyLog {
	private static final long serialVersionUID = 1L;

	@CreatedBy
	protected String 	whoCreated;

}
