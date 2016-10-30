package test.utils.domain.audit;

import java.io.Serializable;
import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.keyvalue.annotation.KeySpace;

import test.utils.Constants;

/**
 * FIXME
 * 
 * @author Neil Stevenson
 */
@KeySpace(Constants.LOG_MAP_NAME)
public class MyLog implements Comparable<MyLog>, Serializable {
	private static final long serialVersionUID = 1L;

	@Id 
	protected String	id;
	protected String	payload;
	protected Date		whenCreated;
	protected Date		whenUpdated;
	protected String 	whoCreated;
	protected String 	whoUpdated;

	// Sort by ID only
	@Override
	public int compareTo(MyLog that) {
		return this.id.compareTo(that.getId());
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPayload() {
		return payload;
	}

	public void setPayload(String payload) {
		this.payload = payload;
	}

	public String getWhoCreated() {
		return whoCreated;
	}

	public void setWhoCreated(String whoCreated) {
		this.whoCreated = whoCreated;
	}

	public String getWhoUpdated() {
		return whoUpdated;
	}

	public void setWhoUpdated(String whoUpdated) {
		this.whoUpdated = whoUpdated;
	}

	public Date getWhenCreated() {
		return whenCreated;
	}

	public void setWhenCreated(Date whenCreated) {
		this.whenCreated = whenCreated;
	}

	public Date getWhenUpdated() {
		return whenUpdated;
	}

	public void setWhenUpdated(Date whenUpdated) {
		this.whenUpdated = whenUpdated;
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName()
				+ " [id=" + id + ", payload=" + payload + ", whoCreated=" + whoCreated + ", whoUpdated=" + whoUpdated
				+ ", whenCreated=" + whenCreated + ", whenUpdated=" + whenUpdated + "]";
	}

}
