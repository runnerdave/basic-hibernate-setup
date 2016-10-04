package net.runnerdave.entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Project implements Auditable {
	
	private Long id;
	private String title;
	private Set<Geek> geeks = new HashSet<Geek>();
	private Date created;
	private Date lastUpdate;
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
	public Date getCreated() {
		return this.created;
	}

	@Override
	public void setCreated(Date created) {
		this.created = created;
		
	}

	@Override
	public Date getLastUpdate() {
		return this.lastUpdate;
	}

	@Override
	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate = lastUpdate;
		
	}
	public Period getPeriod() {
		return period;
	}
	public void setPeriod(Period period) {
		this.period = period;
	}

}
