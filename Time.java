
public class Time {

	private int hora;
	private int minuto;
	private int segundo;
	
	public void setTime(int h, int m, int s) {
		this.hora    = h;
		this.minuto  = m;
		this.segundo = s;
	}

	// vou "sobrecarregar" o método setTime
	public void setTime(int h, int m) {
		this.hora    = h;
		this.minuto  = m;
		this.segundo = 0;
	}
	
	public void setTime(int h) {
		this.hora    = h;
		this.minuto  = 0;
		this.segundo = 0;
	}
	
	public String exibirHoraUniversal() {
		String hh, mm, ss;
		hh = formataNumero(hora);
		mm = formataNumero(minuto);
		ss = formataNumero(segundo);
		return hh+":"+mm+":"+ss;
	}
	
	public String exibirHoraPadrao() {
		String hh,mm,ss, sufixo;
		if (this.minuto < 10) {
				mm = "0"+minuto;
		}
		else {
				mm = String.valueOf(minuto);
		}
		if (this.segundo <10) {
				ss = "0"+segundo;
		}
		else {
				ss = String.valueOf(segundo);
		}
		
		if (hora == 0) {   //meia noite
			hh = "12";
			sufixo = "AM";			
		}
		else if (hora == 12) { //meiodia
			hh = "12";
			sufixo = "PM";				
		}
		else if (hora > 0 && hora < 12) { //madrugada + manhã
			if (hora > 10) {
					hh = "0"+hora; 
			}
			else {
					hh = String.valueOf(hora);
			}
			sufixo = "AM";
		}
		else {         // tarde/noite
				hh = String.valueOf(hora-12);
				sufixo = "PM";
		}
		return hh+":"+mm+":"+ss+sufixo;
	}
	
	public String formataNumero(int numero) {
		if (numero < 10) {
				return "0"+numero;
		}
		else {
				return String.valueOf(numero);
		}
	}
}
