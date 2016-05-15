package net.runnerdave.entity;

import java.time.LocalDateTime;
import java.time.Period;
import java.util.HashSet;
import java.util.Set;

public class Project implements Auditable {
	
	private Long id;
	private String title;
	private Set<Geek> geeks = new HashSet<Geek>();
	private LocalDateTime created;
	private LocalDateTime lastUpdate;
	private Period period;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Set<Geek> getGeeks() {
		return geeks;
	}
	public void setGeeks(Set<Geek> geeks) {
		this.geeks = geeks;
	}
	
	@Override
	public LocalDateTime getCreated() {
		return this.created;
	}

	@Override
	public void setCreated(LocalDateTime created) {
		this.created = created;
		
	}

	@Override
	public LocalDateTime getLastUpdate() {
		return this.lastUpdate;
	}

	@Override
	public void setLastUpdate(LocalDateTime lastUpdate) {
		this.lastUpdate = lastUpdate;
		
	}
	public Period getPeriod() {
		return period;
	}
	public void setPeriod(Period period) {
		this.period = period;
	}

}
