package at.da.rest.example.response.model;

import java.util.ArrayList;
import at.da.rest.example.model.{{MODELNAME_B}};

public class {{MODELNAME_B}}Container {
	public {{MODELNAME_B}} {{MODELNAME}};
	public ArrayList<{{MODELNAME_B}}> {{MODELNAME}}s;

	public {{MODELNAME_B}}Container() {
		set{{MODELNAME_B}}s(new ArrayList<{{MODELNAME_B}}>());
	}

	public {{MODELNAME_B}}Container({{MODELNAME_B}} {{MODELNAME}}) {
		set{{MODELNAME_B}}({{MODELNAME}});
	}

	public {{MODELNAME_B}}Container(ArrayList<{{MODELNAME_B}}> {{MODELNAME}}s) {
		set{{MODELNAME_B}}s({{MODELNAME}}s);
	}

	public {{MODELNAME_B}} get{{MODELNAME_B}}() {
		return {{MODELNAME}};
	}

	public void set{{MODELNAME_B}}({{MODELNAME_B}} {{MODELNAME}}) {
		this.{{MODELNAME}} = {{MODELNAME}};
	}

	public ArrayList<{{MODELNAME_B}}> get{{MODELNAME_B}}s() {
		return {{MODELNAME}}s;
	}

	public void set{{MODELNAME_B}}s(ArrayList<{{MODELNAME_B}}> {{MODELNAME}}s) {
		this.{{MODELNAME}}s = {{MODELNAME}}s;
	}

	public void add{{MODELNAME_B}}s({{MODELNAME_B}} {{MODELNAME}}) {
		if (get{{MODELNAME_B}}s() != null) {
			get{{MODELNAME_B}}s().add({{MODELNAME}});
		} else {
			set{{MODELNAME_B}}s(new ArrayList<{{MODELNAME_B}}>());
			this.add{{MODELNAME_B}}s({{MODELNAME}});
		}
	}

	public boolean multiValueIsNotNull(){
		return {{MODELNAME}}s != null;
	}

	public boolean singleValueIsNotNull(){
		return {{MODELNAME}} != null;
	}
}
