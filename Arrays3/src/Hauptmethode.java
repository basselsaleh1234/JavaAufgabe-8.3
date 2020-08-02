import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Hauptmethode {

	public static void main(String[] args) throws IOException {

		Schachspiel f=new Schachspiel();

		f.setX(5); //set die pferde
		f.setY(5);
char[][]x=f.schachbrettmachen(); //aufruf die methode die Matrix ausfüllt

f.anzeigen(x);// die Matrix zeigen


BufferedReader einlesen=new BufferedReader(new InputStreamReader(System.in));
System.out.println();
System.out.println("Bitte x-koordinate eingaben :");
int x1=Integer.parseInt(einlesen.readLine());

System.out.println();
System.out.println("Bitte y-koordinate eingaben :");
int y1=Integer.parseInt(einlesen.readLine());
boolean m=f.prefix(x1, y1);

if(m) {System.out.println("Korrekter Zug");
f.setX(x1);
f.setY(y1);
}
else
	System.out.println("Falscher Zug");

char[][]c=f.schachbrettmachen();
f.anzeigen(c);

	}

}
