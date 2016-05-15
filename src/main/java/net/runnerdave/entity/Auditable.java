package net.runnerdave.entity;

import java.time.LocalDateTime;

public interface Auditable {
	public LocalDateTime getCreated();
	public void setCreated(LocalDateTime created);
	public LocalDateTime getLastUpdate();
	public void setLastUpdate(LocalDateTime lastUpdate);
}
