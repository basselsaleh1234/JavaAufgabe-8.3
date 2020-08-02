//Aufgabe 8.3
public class Schachspiel {
	
	private int x;
	private int y;
	 
	
	Schachspiel() {
		
	
	}
	

	

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	

	public  char[][] schachbrettmachen() {

		char[][] schachbrett = new char[9][9];

		for (int i = 0; i < schachbrett.length; i++) {
			for (int j = 0; j < schachbrett[0].length; j++) {
				if (j == 0 && i != 8) {
					schachbrett[i][j] = '.';
				}

				if (j % 2 == 0 && i != 8) {
					schachbrett[i][j] = '.';
				} else if (i != 8)
					schachbrett[i][j] = (char)916;
		
				if(i==y&&j==x)schachbrett[i][j]='S';
			}
			}
		return schachbrett;

	}

	public  void anzeigen(char[][]schachbrett) {
		
		
		
		
		
	       for (int i=0; i < 8; i++)
	            for (int j=0; j < 8; j++){
	                    if (j%2 == 0) 
	                        schachbrett[i][j] = '.';
	                    else 
	                        schachbrett[i][j] = (char)916;
	            
	                    if (i==y && j==x) schachbrett[i][j] = 'S';
	            }

	  
	        for (int i=0; i < 8; i++) {
	            for (int j=0; j < 8; j++) {
	                System.out.print(schachbrett[i][j] + " ");
	            }
	            System.out.println("  " + i);
	        }
	        System.out.println("0 1 2 3 4 5 6 7");
	        System.out.println();
		
		
		
	}
	
	public  boolean prefix(int x,int y) {
		
		int sum;
		if(x<0||x>8||y<0||y>8)return false;
		
         if(x==this.x||y==this.y)return false;
		
		if(Math.abs(this.x-x)+Math.abs(this.y-y)==3)
		return true;
		
		return false;
	}
	
	
	
	
	

}
