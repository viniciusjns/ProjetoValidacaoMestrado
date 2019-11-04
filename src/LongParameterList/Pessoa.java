package LongParameterList;

public class Pessoa {
	
	private String name;
	private String age;
	private String documentId;
	private String address;
	private String zipCode;
	private String state;
	private String telephone;
	private String celphone;
	
	public void setInformation(String name, String age, String documentId,
			String address, String zipCode, String state, String telephone, String celphone) {
		this.name = name;
		this.age = age;
		this.documentId = documentId;
		this.address = address;
		this.zipCode = zipCode;
		this.state = state;
		this.telephone = telephone;
		this.celphone = celphone;
	}

}
