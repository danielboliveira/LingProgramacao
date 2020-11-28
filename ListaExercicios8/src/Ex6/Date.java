package Ex6;

public class Date {
	private int dia,mes,ano;
	
	public Date(int Dia,int Mes,int Ano) {
		this.dia = Dia;
		this.mes = Mes;
		this.ano = Ano;
		
		this.CheckDate();
	}
	
	public void Display() {
		System.out.printf("%d/%d/%d\n",dia,mes,ano);
	}
	
	public Date NextDay() {
		int maxDias = this.getNumDias();
		int n_dia,n_mes,n_ano;
		
		if (mes < 12) {
			
			if (dia + 1 > maxDias) {
				n_dia = 1;
				n_mes = mes + 1;
				n_ano = ano;
			}else{
				n_dia = dia + 1;
				n_mes = mes;
				n_ano = ano;
			}
			
		}else {
			if (dia + 1 > maxDias) {
				n_dia = 1;
				n_mes = 1;
				n_ano = ano+1;
			}else {
				n_dia = dia + 1;
				n_mes = mes;
				n_ano = ano;
			}
		}
		
		return new Date(n_dia,n_mes,n_ano);
	}
	
	private boolean CheckDate() {
		if (ano < 0){
			System.out.println("Ano inválido!");
			this.ano = 1;
			return false;
		}
		
		if (!(mes >= 1 && mes <= 12)) {
			System.out.println("Mês inválido");
			this.mes = 1;
			return false;
		}
		
		 int numDays = getNumDias(); 
	      
	     if (!(dia >= 1 && dia <= numDays)) {
	    	 System.out.println("Dia inválido");
	    	 dia = 1;
	    	 return false;
	     }
	     
	     return true;
	}
	
	private int getNumDias() {
		int numDays = 0; 
		 
        switch (mes) { 
            case 1:  
            case 3:  
            case 5: 
            case 7:  
            case 8:  
            case 10: 
            case 12: 
                numDays = 31; 
                break; 
            case 4:  
            case 6: 
            case 9:  
            case 11: 
                numDays = 30; 
                break; 
            case 2: 
                if ( ((ano % 4 == 0) && !(ano % 100 == 0)) || (ano % 400 == 0)) 
                    numDays = 29; 
                else 
                    numDays = 28; 
                break; 
        }
        
        return numDays;
	}
}
