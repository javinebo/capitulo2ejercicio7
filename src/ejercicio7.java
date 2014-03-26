
import java.util.Scanner;
class ejercicio7{ 
						
	public static void main (String[] args) { 
		int[] numero;
		String[] romano;
		int ano=0, ano2,repite;
		Scanner teclado=new Scanner(System.in);
        System.out.println("Año : ");
        while (ano<=0 || ano>3999){
        	ano=teclado.nextInt();
		}
        ano2=ano;
        numero=new int[14];
		romano=new String [14];
		numero[1] = 1;
		numero[2] = 4;
		numero[3] = 5;
	    numero[4] = 9;
		numero[5] = 10;
		numero[6] = 40;
		numero[7] = 50;
		numero[8] = 90;
		numero[9] = 100;
		numero[10] = 400;
		numero[11] = 500;
		numero[12] = 900;
		numero[13] = 1000;
		romano[1] = "I";
		romano[2] = "IV";
		romano[3] = "V";
		romano[4]= "IX";
		romano[5] = "X";
		romano[6] = "XL";
		romano[7] = "L";
		romano[8] = "XC";
		romano[9] = "C";
		romano[10] = "CD";
		romano[11] = "D";
		romano[12] = "CM";
		romano[13] = "M";
		String xrom="";
		for (repite=13;repite>0;repite--){
				while (ano >= numero[repite]){
				ano = ano - numero[repite];
				xrom = xrom + romano[repite];
				}
       }
		System.out.println("DECIMAL ..: " + ano2);
        System.out.println("ROMANO ..: " + xrom);}
}