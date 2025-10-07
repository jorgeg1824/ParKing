package co.edu.uco.parking.dto;

import java.util.UUID;

public final class CellDTO {
	
	private UUID id;
	private String name;
	private CellTypeDTO cellType;
	private ZoneDTO zone;
	private boolean active;
	
	public CellDTO() {
		this.id = null;
		this.name = "";
		this.cellType = new CellTypeDTO();
		this.zone = new ZoneDTO();
		this.active = false;
	}
	
	public CellDTO(final UUID id, final String name, final CellTypeDTO cellType, final ZoneDTO zone, final boolean active) {
		this.id = id;
		this.name = name;
		this.cellType = cellType;
		this.zone = zone;
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
	
	public CellTypeDTO getCellType() {
		return cellType;
	}
	
	public void setCellType(CellTypeDTO cellType) {
		this.cellType = cellType;
	}
	
	public ZoneDTO getZone() {
		return zone;
	}
	
	public void setZone(ZoneDTO zone) {
		this.zone = zone;
	}
	
	public boolean isActive() {
		return active;
	}
	
	public void setActive(boolean active) {
		this.active = active;
	}

}
