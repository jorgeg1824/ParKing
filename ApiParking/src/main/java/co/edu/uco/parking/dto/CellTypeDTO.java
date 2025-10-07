package co.edu.uco.parking.dto;

import java.util.UUID;

public final class CellTypeDTO {
	
	private UUID id;
	private String name;
	private String description;
	private boolean active;
	
	public CellTypeDTO() {
		this.id = null;
		this.name = "";
		this.description = "";
		this.active = false;
	}
	
	public CellTypeDTO(final UUID id, final String name, final String description, final boolean active) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.active = active;
	}
	
	public UUID getId() {
		return id;
	}
	
	public void setId(UUID id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public boolean isActive() {
		return active;
	}
	
	public void setActive(boolean active) {
		this.active = active;
	}

}
