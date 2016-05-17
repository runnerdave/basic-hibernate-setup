package net.runnerdave.entity;

import java.util.Date;

public interface Auditable {
	public Date getCreated();
	public void setCreated(Date created);
	public Date getLastUpdate();
	public void setLastUpdate(Date lastUpdate);
}
