package at.da.rest.example.model;

public class {{MODELNAME}} {
	private Long id;
	private String property;
	
	public {{MODELNAME}}() {
		super();
	}
	public {{MODELNAME}}(Long id) {
		super();
		this.id = id;
	}
	public {{MODELNAME}}(Long id, String property) {
		super();
		this.id = id;
		this.property = property;
	}
}
