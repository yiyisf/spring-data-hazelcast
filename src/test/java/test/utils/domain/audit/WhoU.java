package test.utils.domain.audit;

import org.springframework.data.keyvalue.annotation.KeySpace;

import test.utils.Constants;

/**
 * <P>Domain object to test {@link 
 * org.springframework.data.keyvalue.repository.config.EnableKeyValueAuditing
 * EnableKeyValueAuditing},
 * for the last change principal.
 * </P>
 * 
 * @author Neil Stevenson
 */
@KeySpace(Constants.LOG_MAP_NAME)
public class WhoU extends MyLog {
	private static final long serialVersionUID = 1L;

	@LastModifiedBy
	protected String 	whoUpdated;

}
