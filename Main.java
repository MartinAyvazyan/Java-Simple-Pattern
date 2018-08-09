import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
class Main {
	
	public static void main(String... args) throws IOException{

		int m = 8;
		int n = 8;

		FileWriter xxx = new FileWriter("xxx.ppm"); 
		xxx.append("P2\n");
		xxx.append(m + " " + n + "\n");
		xxx.append("15\n");
			for(int i = 0; i<m; i++){
				for(int j = 0; j<n; j++){
					if((j==0 || j==n-1) || (i==0 || i==m-1)){
						xxx.append("0 ");
					 	System.out.print("0");
					}else {
						 xxx.append("15 ");
						 System.out.print("1"); 
					}
				}
				xxx.append("\n");	
				System.out.println("");		
			}		
		xxx.flush();
	}
}
