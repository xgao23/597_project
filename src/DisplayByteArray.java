import java.util.Arrays;



public class DisplayByteArray {
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        char arr[][] = {{'x','x',' '},{'x','x',' '},{'x','x','x'}};
        char arr2[][]={{'x','x',' '},{' ','x',' '},{' ','x','x'}};
        Print2DMartrix(arr);
        Print2DMartrix(arr2);
        compareMatrix(arr,arr2);
        
        
	}
	public static void compareMatrix(char[][] a, char[][] b){
		float blackToWhite=0;
		float whiteToBlack=0;
		int length=a.length;
		float dimension=(length+1)*(length+1);
		int blength=b.length;
		if(length!=blength)
			System.out.println("Two matrix are not in the same dimension");
		for(int i=0;i<length;i++)
		{
			for(int j=0;j<length;j++){
				
				if(a[i][j]=='x'&&b[i][j]==' '){
					blackToWhite++;
					System.out.println("point("+(i+1)+","+(j+1)+") B/W");
				}else if(a[i][j]==' '&&b[i][j]=='x'){
					whiteToBlack++;
					System.out.println("point("+(i+1)+","+(j+1)+") W/B");
					
				}			
			}
		}
		System.out.println();
		System.out.println("Black to White Num "+blackToWhite+ ", Rate "+(blackToWhite/dimension)*100+"%" );
		System.out.println("White to Black Num "+whiteToBlack+ ", Rate " +(whiteToBlack/dimension)*100+"%" );
		System.out.println("Total Mutation Rate "+((whiteToBlack+blackToWhite)/dimension)*100+"%");
	
	}
	
	
	
	public static void Print2DMartrix(char[][] arr ){
		int length=arr[0].length;
		for(int i=0;i<length;i++)
			{
				for(int j=0;j<length;j++){
					System.out.print(arr[i][j]);
				}
				System.out.println();
			}
		
		
	}

}
