import java.util.Random;
import java.util.Scanner;


public class Crazytime {
	static Random random=new Random();
	static Scanner t=new Scanner(System.in);
	static int scelta=0,puntataTot,budget,budgetIniziale,moltiplicatore,win,uno=0,due=0,cinque=0,dieci=0,cf=0,pc=0,ch=0,ct=0;
	public static void menu(){
		int carica=0;
		win=0;
		uno=0;
		due=0;
		cinque=0;
		dieci=0;
		cf=0;
		pc=0;
		ch=0;
		ct=0;
		try{
			System.out.println("Carica i numeri e/o i bonus:");
			Thread.sleep(3000);
		}catch(InterruptedException e) {}
		do {
			System.out.println("1. n'1:\t\t"+uno+"$\n2. n'2:\t\t"+due+"$\n3. n'5:\t\t"+cinque+"$\n4. n'10:\t"+dieci+"$\n5. Coin Flip:\t"+cf+"$\n6. Pachinko:\t"+pc+"$\n7. Cash Hunt:\t"+ch+"$\n8. Crazy Time:\t"+ct+"$\n9. Tutti i numeri\n10.Tutti i bonus\n0. Gira la ruota\n-1. TERMINARE\n\nSALDO: "+budget+"$");
			scelta=t.nextInt();
			while(scelta<-1||scelta>10) {
				System.out.println("inserisci numero valido");
				scelta=t.nextInt();
			}
			if(scelta!=0&&scelta!=-1){
				System.out.println("Quanto vuoi caricare?");
				carica=t.nextInt();
				while(carica>budget) {
					System.out.println("errore... riprova");
					carica=t.nextInt();
				}
				if(scelta==9||scelta==10) {
					while(carica*4>budget) {
						System.out.println("errore... riprova");
						carica=t.nextInt();
					}
				}
				puntataTot+=carica;
			}
			switch(scelta) {
			case 0:
				break;
			case 1:
				uno+=carica;
				break;
			case 2:
				due+=carica;
				break;
			case 3:
				cinque+=carica;
				break;
			case 4:
				dieci+=carica;
				break;
			case 5:
				cf+=carica;
				break;
			case 6:
				pc+=carica;
				break;
			case 7:
				ch+=carica;
				break;
			case 8:
				ct+=carica;
				break;
			case 9:
				uno+=carica;
				due+=carica;
				cinque+=carica;
				dieci+=carica;
				break;
			case 10:
				cf+=carica;
				pc+=carica;
				ch+=carica;
				ct+=carica;
				break;
			case -1:
				break;
			}
			if(scelta==9||scelta==10) {
				carica*=4;
			}
			if(scelta!=0) {
				budget-=carica;
			}
			puntataTot=0;
		}while(scelta!=0&&scelta!=-1&&budget!=0);
	}
	public static void coinFlip() {
		int generaBlu,generaRed;
		int colore=0,moltiplicatore2=0;
		System.out.println("E' uscito il coin flip");
		do{
			generaBlu=random.nextInt(100)+1;
			generaRed=random.nextInt(100)+1;
		}while(generaBlu==generaRed);	
			if(generaBlu>=0&&generaBlu<=17) {
				moltiplicatore=2;
			}
			if(generaBlu>=18&&generaBlu<=24) {
				moltiplicatore=4;
			}
			if(generaBlu>=26&&generaBlu<=39) {
				moltiplicatore=5;
			}
			if(generaBlu>=40&&generaBlu<=52) {
				moltiplicatore=6;
			}
			if(generaBlu>=53&&generaBlu<=62) {
				moltiplicatore=8;
			}
			if(generaBlu>=63&&generaBlu<=72) {
				moltiplicatore=10;
			}
			if(generaBlu>=73&&generaBlu<=81) {
				moltiplicatore=15;
			}
			if(generaBlu>=82&&generaBlu<=89) {
				moltiplicatore=20;
			}
			if(generaBlu>=90&&generaBlu<=96) {
				moltiplicatore=25;
			}
			if(generaBlu>=97&&generaBlu<=100) {
				moltiplicatore=50;
			}
			if(generaRed>=0&&generaRed<=17) {
				moltiplicatore2=2;
			}
			if(generaRed>=18&&generaRed<=24) {
				moltiplicatore2=4;
			}
			if(generaRed>=26&&generaRed<=39) {
				moltiplicatore2=5;
			}
			if(generaRed>=40&&generaRed<=52) {
				moltiplicatore2=6;
			}
			if(generaRed>=53&&generaRed<=62) {
				moltiplicatore2=8;
			}
			if(generaRed>=63&&generaRed<=72) {
				moltiplicatore2=10;
			}
			if(generaRed>=73&&generaRed<=81) {
				moltiplicatore2=15;
			}
			if(generaRed>=82&&generaRed<=89) {
				moltiplicatore2=20;
			}
			if(generaRed>=90&&generaRed<=96) {
				moltiplicatore2=25;
			}
			if(generaRed>=97&&generaRed<=100) {
				moltiplicatore2=50;
			}
		try{
			System.out.println("Rosso :"+moltiplicatore+"x");
			System.out.println("Blu :"+moltiplicatore2+"x");
			Thread.sleep(8000);
		}catch(InterruptedException e) {}
		try{
			colore=random.nextInt(2);
			System.out.println("Lancio della moneta...");
			Thread.sleep(5000);
		}catch(InterruptedException e) {}
		if(colore==0) {
			System.out.print("E' uscito il rosso");
			win=moltiplicatore*cf;
		}else {
			System.out.println("E' uscito il blu");
			win=moltiplicatore2*cf;
		}
	}
	public static void pachinko() {
		System.out.println("E' uscito il pachinko");
		int generaPc=random.nextInt(100);
		try {
			System.out.println("5x   7x   10x   12x   15x   20x   25x   50x   75x   100x");
			Thread.sleep(3000);
		}catch(Exception e) {}

		if(generaPc>=0&&generaPc<=9) {
			moltiplicatore=5;
		}
		if(generaPc>=10&&generaPc<=19) {
			moltiplicatore=7;
		}
		if(generaPc>=20&&generaPc<=29) {
			moltiplicatore=10;
		}
		if(generaPc>=30&&generaPc<=39) {
			moltiplicatore=12;
		}
		if(generaPc>=40&&generaPc<=49) {
			moltiplicatore=15;
		}
		if(generaPc>=50&&generaPc<=59) {
			moltiplicatore=20;
		}
		if(generaPc>=60&&generaPc<=69) {
			moltiplicatore=25;
		}
		if(generaPc>=70&&generaPc<=79) {
			moltiplicatore=50;
		}
		if(generaPc>=80&&generaPc<=89) {
			moltiplicatore=75;
		}
		if(generaPc>=90&&generaPc<=99) {
			moltiplicatore=100;
		}
		try {
			System.out.print("La pallina va sul...");
			Thread.sleep(5000);
		}catch(Exception e) {}
		System.out.println(moltiplicatore);
		win=moltiplicatore*pc;

	}
	public static void cashHunt() {
		System.out.println("E' uscito il cash hunt");
		try{
			Thread.sleep(4000);
		}catch(InterruptedException e) {}
		int m[][]=new int[12][9];//52 10x-  44 25x-  6 50x-  5 5x-   1 100x
		for(int j=0; j<9; j++) {
			System.out.print("\t"+(j+1)+":");
		}
		System.out.println();
		for(int i=0; i<12; i++) {
			System.out.print(i+1+":\t");
			for(int j=0; j<9; j++) {
				System.out.print(".\t");
			}
			System.out.println();
		}
		try{
			System.out.println("Decidi dove sparare:");
			Thread.sleep(4000);
		}catch(InterruptedException e) {}
		int randomRiga,randomColonna;
		int n=0;
		while(n!=52) {
			randomRiga=random.nextInt(12);
			randomColonna=random.nextInt(9);
			if(m[randomRiga][randomColonna]==0) {
				m[randomRiga][randomColonna]=10;
				n++;
			}
		}
		n=0;
		while(n!=44) {
			randomRiga=random.nextInt(12);
			randomColonna=random.nextInt(9);
			if(m[randomRiga][randomColonna]==0) {
				m[randomRiga][randomColonna]=25;
				n++;
			}
		}
		n=0;
		while(n!=6) {
			randomRiga=random.nextInt(12);
			randomColonna=random.nextInt(9);
			if(m[randomRiga][randomColonna]==0) {
				m[randomRiga][randomColonna]=50;
				n++;
			}
		}
		n=0;
		while(n!=5) {
			randomRiga=random.nextInt(12);
			randomColonna=random.nextInt(9);
			if(m[randomRiga][randomColonna]==0) {
				m[randomRiga][randomColonna]=5;
				n++;
			}
		}
		n=0;
		while(n!=1) {
			randomRiga=random.nextInt(12);
			randomColonna=random.nextInt(9);
			if(m[randomRiga][randomColonna]==0) {
				m[randomRiga][randomColonna]=100;
				n++;
			}
		}
		int r=0;
		int c=0;
		while(r<1||r>12&&c<1||c>9){
			System.out.println("Inserisci riga e colonna");
			r=t.nextInt();
			c=t.nextInt();
		}	
		win=m[r-1][c-1]*ch;
		try{
			Thread.sleep(4000);
		}catch(InterruptedException e) {}
		try{
			for(int j=0; j<9; j++) {
				System.out.print("\t"+(j+1)+":");
			}
			for(int i=0; i<12; i++) {
				System.out.println();
				System.out.print(i+1+":\t");
				for(int j=0; j<9; j++) {
					System.out.print(m[i][j]+"\t");
				}
			}
			System.out.println();
			Thread.sleep(7000);
		}catch(InterruptedException e) {}

	}
	public static void crazyTime() {
		win=0;
		int []moltCrazy=new int[3];
		System.out.println("E' uscito il crazy time");//12 double- 10 15x- 10 20x- 18 25x- 6 35x- 6 50x- 2 100x
		try{
			Thread.sleep(2000);
		}catch(InterruptedException e) {}
		System.out.println("Inserisci v per scegliere il verde, b per il blu, e g per il giallo");
		String scelta=t.nextLine();
		scelta=t.nextLine();
		int []genera=new int[3];
		boolean[]Double= {true,true,true};
		int[]k= {1,1,1};
		String[]colori= {"Verde :","Blu :","Giallo :"};
		while(Double[0]||Double[1]||Double[2]) {
			try {
				System.out.println("La ruota sta girando...");
				Thread.sleep(7000);
			}catch(InterruptedException e) {};
			for(int i=0; i<Double.length; i++){
				if(Double[i]) {
					genera[i]=random.nextInt(64);
				}
			}
			for(int i=0; i<Double.length; i++) {
				if(genera[i]>=0&&genera[i]<=11) {
					Double[i]=true;
				}else {
					Double[i]=false;
				}
				if(genera[i]>=12&&genera[i]<=21) {
					moltCrazy[i]=10;
				}
				if(genera[i]>=22&&genera[i]<=31) {
					moltCrazy[i]=20;
				}
				if(genera[i]>=32&&genera[i]<=49) {
					moltCrazy[i]=25;
				}
				if(genera[i]>=50&&genera[i]<=55) {
					moltCrazy[i]=35;
				}
				if(genera[i]>=56&&genera[i]<=61) {
					moltCrazy[i]=50;
				}
				if(genera[i]>=62&&genera[i]<=63) {
					moltCrazy[i]=100;
				}
			}
			for(int i=0; i<Double.length; i++) {
				System.out.print(colori[i]);
				if(Double[i]) {
					k[i]*=2;
					System.out.print("DOUBLE"+"\t");
					try {
						Thread.sleep(3000);
					}catch(InterruptedException e) {};
				}else {
					System.out.print(moltCrazy[i]*k[i]+"x\t");
				}
			}
			try {
				Thread.sleep(3000);
			}catch(InterruptedException e) {};
			System.out.println();
		}
		switch(scelta) {
		case "v":{
			win=moltCrazy[0]*k[0]*ct;
			break;
		}
		case "b":{
			win=moltCrazy[1]*k[1]*ct;
			break;
		}
		case "g":{
			win=moltCrazy[2]*k[2]*ct;
			break;
		}
		}
	}
		public static void main(String[] args) {
			System.out.println("Benvenuto al gioco del Crazy time!Buona Fortuna...");
			System.out.println("Con quanto budget vuoi iniziare?");
			budgetIniziale=t.nextInt();
			budget=budgetIniziale;
			while(budget<=0) {
				System.out.println("Inserisci un budget corretto");
				budgetIniziale=t.nextInt();
				budget=budgetIniziale;
			}
			while(budget>0&&scelta!=-1){
				menu();
				if(scelta!=-1) {int genera=random.nextInt(10003)+1;
				try{
					System.out.println("La ruota sta girando...");
					Thread.sleep(7000);
				}catch(InterruptedException e) {}
				if(genera>=0&&genera<=3889) {//numero 1 38,89% di uscita
					System.out.println("E' uscito l'1");
					win=uno=2*uno;
				}
				if(genera>=3890&&genera<=6297) {//numero 2 24,07% di uscita
					System.out.println("E' uscito il 2");
					win=due=3*due;
				}
				if(genera>=6298&&genera<=7594) {//numero 5 12,96% di uscita
					System.out.println("E' uscito il 5");
					win=cinque=6*cinque;
				}
				if(genera>=7595&&genera<=8335) {//numero 10 7,4% di uscita
					System.out.println("E' uscito il 10");
					win=dieci=11*dieci;
				}
				if(genera>=8336&&genera<=9076) {//coin flip 7,4% di uscita
					coinFlip();
				}
				if(genera>=9077&&genera<=9447) {//pachinko 3,7% di uscita
					pachinko();
				}
				if(genera>=9448&&genera<=9818) {//cash hunt 3,7% di uscita
					cashHunt();
				}
				if(genera>=9819&&genera<=10003) {//crazy time 1,85% di uscita
					crazyTime();
				}
				try{
					Thread.sleep(5000);
				}catch(InterruptedException e) {}
				System.out.println("Hai vinto "+win+"$\n\n");
				budget+=win;
				try{
					Thread.sleep(5000);
				}catch(InterruptedException e) {}
				}
			}
			System.out.println("CASH IN:"+budgetIniziale+"$"+"\tCASH OUT:"+budget+"$");
			
			
			
		}
	}
