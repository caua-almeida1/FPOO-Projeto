package aprendizagem1;

public class DadosContato {
	private String email;
	private String Telefone;
	
	public String getEmail() {
		return email;
	}
		
		public void setemail(String email) {
			if (email.isEmpty()) {
			System.out.println("EMAIL � OBRIGAT�RIO");
			System.exit(0);
			}else {
				this.email = email;
				
			}
	}
	
	public String getTelefone() {
		return Telefone;
	}
	public void setTelefone(String telefone) {
		if (telefone.isEmpty()) {
			System.out.println("N�MERO DE TELEFONE � OBRIGAT�RIO");
			System.exit(0);
			
		}else {
			if(telefone.length()==15) {
		this.Telefone = telefone;
		
			}else {
				System.out.println("M�NIMO E M�XIMO DE 15 CARACTERES");
				System.exit(0);
			}
	}

}
}
