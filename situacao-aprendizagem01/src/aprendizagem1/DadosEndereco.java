	package aprendizagem1;
	
public class DadosEndereco {
		
	private String cep;
	private String logradouro;
	private String numero;
	private String bairro;
	private String cidade;
	private String estado;
		
	public String getcep() {
		return cep;
}
	public void setcep(String cep) {
		if (cep.isEmpty()) {
			System.out.println("CEP � OBRIGAT�RIO");
			System.exit(0);
			
			}else { 
				if(cep.length()>=3) {
				this.cep = cep;
			}else {
				System.out.println("M�NIMO DE TR�S CARACTERES");
				System.exit(0);
					}
				}
			}
			
	
	public String getlogradouro() {
		return logradouro;
}
	public void setlogradouro(String logradouro) {
		if (logradouro.isEmpty()) {
			System.out.println("LOGRADOURO � OBRIGAT�RIO");
			System.exit(0);
			
			
			}else { 
				if(logradouro.length()>=3) {
				this.logradouro = logradouro;
			}else {
				System.out.println("M�NIMO DE TR�S CARACTERES");
				System.exit(0);
					
				}
			}
		
	}
	
	public String getnumero() {
		return numero;
}
	public void setnumero(String numero) {
		if (numero.isEmpty()) {
			System.out.println("N�MERO � OBRIGAT�RIO");
			System.exit(0);
		}else {
			this.numero = numero;
				}
			}
	
	public String getbairro() {
		return bairro;
}
	public void setbairro(String bairro) {
		
		if (bairro.isEmpty()) {
			System.out.println("BAIRRO � OBRIGAT�RIO");
			System.exit(0);
			
		this.bairro = bairro;
				}
			}
	
	public String getcidade() {
		return cidade;
}
	public void setcidade(String cidade) {
		if (cidade.isEmpty()) {
			System.out.println("CIDADE � OBRIGAT�RIO");
			System.exit(0);
			
		this.cidade = cidade;
		}
    	  
      }W
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		if (estado.isEmpty()) {
			System.out.println("ESTADO � OBRIGAT�RIO");
			System.exit(0);
			
			
			}else { 
				if(estado.length()==2) {
				this.estado = estado;
				}else {
					System.out.println("M�XIMO DOIS CARACTERES");
					System.exit(0);
		this.estado = estado;
			}
		}
	}
}
