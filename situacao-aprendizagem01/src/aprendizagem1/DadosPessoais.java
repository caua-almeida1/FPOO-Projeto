package aprendizagem1;
public class DadosPessoais {

		private String Nome;
		private String sobreNome;
		private String dataNascimento;
		private String genero;
		
	public String getNome() {
		return Nome;
	}
	public void setNome(String Nome) {
		if (Nome.isEmpty()) {
		System.out.println("NOME � OBRIGAT�RIO");
		System.exit(0);
			
		} else{
			
			int tamanho = Nome.length();
			if(tamanho <3) {
			System.out.println("M�NIMO DE TR�S CARACTERES");
			System.exit(0);
			
			} else{
			
				this.Nome = Nome;
				
			}	
		}
		
	}
	
	public String getsobreNome() {
		return sobreNome;
	}
	public void setsobreNome(String sobreNome) {
		if (sobreNome.isEmpty()) {
		System.out.println("SOBRENOME � OBRIGAT�RIO");
		System.exit(0);
			
		} else{
			if(sobreNome.length()>=3) {
		} else {
			System.out.println("M�NIMO DE TR�S CARACTERES");
			System.exit(0);
			
		this.sobreNome = sobreNome;
		}
			
	}
			
		}
		
	
	public String getdataNascimento() {
		return dataNascimento;
		
	}
	public void setdataNascimento(String dataNascimento) {
		if (dataNascimento.isEmpty()) {
		System.out.println("DATA DE NASCIMENTO � OBRIGAT�RIA");
			
		} else{
			if(dataNascimento.length()==10) {
				this.dataNascimento = dataNascimento;
		} else {
			System.out.println("M�NIMO 10 CARACTERES");
			System.exit(0);
			
		}
			
	}
	
		}
	
	
	
	public String getgenero() {
		return genero;
	}
	public void setgenero(String genero) {
		if (genero.isEmpty()) {
		System.out.println("G�NERO � OBRIGAT�RIO");
		System.exit(0);
		}else {
		if(genero.equalsIgnoreCase("FEMININO")) {
			this.genero = genero;
		}else {
			if(genero.equalsIgnoreCase("MASCULINO")) {
			this.genero = genero;
		}else {
			if (genero.equalsIgnoreCase("OUTROS")) {
			this.genero = genero;
		}else {
			System.out.println("GENERO INVALIDO");
			System.exit(0);
		}
	}
		}
		
	}
	
	}
	
}


		
		

			
