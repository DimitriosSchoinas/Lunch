import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int numeroFixo = in.nextInt();
		in.nextLine();
		Almoco numeroFixo1 = new Almoco(numeroFixo);
		
		int N = in.nextInt();
		
		
		int numeroGuardado = 0;
        
		for(int i=0; i < N; i++) {
			int e = in.nextInt();
			in.nextLine();
			if(e <= numeroFixo && e > numeroGuardado) 
				numeroGuardado = e;
			
		}
		
		if(numeroGuardado > 0 && numeroGuardado <= numeroFixo) {
			System.out.println(numeroGuardado);
		}
		else{
			System.out.println("No free lunch");
		}
		
		}
		
		
		
		
	}


