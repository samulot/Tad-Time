import java.util.Scanner;
	
public class TimeTeste {
		public static void main(String args[]) {
			
			Scanner teclado = new Scanner(System.in);
			Time t = new Time();
			
			int h,m,s;
			
			h = teclado.nextInt();
			m = teclado.nextInt();
			s = teclado.nextInt();
			
			t.setTime(h,m,s);
			
			System.out.println(t.exibirHoraUniversal());
			System.out.println(t.exibirHoraPadrao());
			
			// um comentario aleatorio
			
			teclado.close();
		}
}
