package kodlama.io.Devs.entities.concretes;

public class Language {
	private int id;
	private String name;
	private String program;
	
	public Language() {		
	}

	public Language(int id, String name, String program) {
		super();
		this.id = id;
		this.name = name;
		this.program = program;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getProgram() {
		return program;
	}

	public void setProgram(String program) {
		this.program = program;
	}
	
	

}
