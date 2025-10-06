package co.edu.uco.parking.business.domain;

import java.util.UUID;

import co.edu.uco.parking.crosscuting.helper.TextHelper;
import co.edu.uco.parking.crosscuting.helper.UUIDHelper;

public final class CellDomain extends Domain{
	
	private String name;
	
	public CellDomain() {
		super(UUIDHelper.getUUIDHelper().getDefault());
		setId(UUIDHelper.getUUIDHelper().getDefault());
		setName(TextHelper.getDefault());
	}
	
	public CellDomain(final UUID id, final String name) {
		super(id);
		setId(id);
		setName(name);
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = TextHelper.getDefaultWithTrim(name);
	}
	
}
