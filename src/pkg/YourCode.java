package pkg; // Music Project
// Sond used: Empty Space by James Aurthur 
// Total beats = 198

import ryanguru.ColorDisplay;

public class YourCode
{
	public static void FitWholeScreen(String color)                         // Fill whole Screen
{
		for(int c=0; c<=9;c++){
		for(int e=0; e<=19;e++){
			
			ColorDisplay.setPixelColor(c, e, color);
		}
	}
}
	
	public static void Vertline(int r, int c, int height, String color)        // Vertical Line 
	{
		for (int k = r; k <= r+height; k++)
		{
			ColorDisplay.setPixelColor(k, c, color);
		}
		
	}
	
	public static void Horline(int r, int c, int len, String color)        // Horizontal Line
	{
		for (int k = c; k < c+len; k++)
		{
			ColorDisplay.setPixelColor(r, k, color);
		}
		
	}
	
	
	public static void sq(int r, int c, int ht, int width, int d)        // Draw A Square
	{
		Horline(r,c+d,ht,"BLUE");
		Horline(r+1,c+d,width,"BLUE");
	}
	
	public static void DrawH ()        // Letter H
	{
		Vertline(3,4,4,"WHITE");
		Horline(5,4,5,"WHITE");
		Vertline(3,8,4,"WHITE");
		
		
	}

	public static void DrawI()         // Letter I
	{
		Horline(3,11,5,"WHITE");
		Vertline(3,13,4,"WHITE");
		Horline(7,11,5,"WHITE");
		
	}
	
	public static void DrawHeart(String color, int colOffset)            // Display Heart
	{
		int[] rows = {3, 4, 4, 3, 2, 1, 0, 0, 1, 2, 3, 4, 4, 3};
		int[] cols = {4, 5, 6, 7, 6, 5, 4, 3, 2, 1, 0, 1, 2, 3};
			
		for (int a=0; a< rows.length; a++)
		{
			ColorDisplay.setPixelColor(rows[a], cols[a] + colOffset, color);
			ColorDisplay.pause(20);
		}

		for (int a=0; a< rows.length; a++)
		{
			ColorDisplay.setPixelOFF(rows[a], cols[a] + colOffset);
		}
	}
	
	public static void Z(int r, int c, int ht, int width, int d)               //  Draw Letter Z
	{
		Horline(r,c+d,ht,"MEGENTA");
		Horline(r-1,c+1+d,width,"MEGENTA");
	}

	public static void dot(int row, int col, String color)                    // Draw Dot
	{
		ColorDisplay.setPixelColor(row, col, color);
	}
	
	public static void Smile(int r, String color, int d) {                  // Draw Smile
		
		dot(3,7+d, color);
		dot(3,14+d, color);
		int[] col = {8,9,10,11,12,13};
		for (int i=0; i<col.length; i++) {
			ColorDisplay.setPixelColor(r, col[i]+d, color);
		}

	}
	
	public static void stairs(int r, int c, int k, String color, int d)         // Draw Stairs
	{
	for (int b=0; b<k; b++)
	  {
		ColorDisplay.setPixelColor(r+d, c+b+d, color);
       }
	
	}
	
	public static void Person(String color, int d)           // Draw Person
	{
		Horline(6,1+d,5,color);
		Horline(6+1,1+d,5,color);
		Horline(7+1,1+d,5,color);
		Horline(8+1,1+d,5,color);
		Vertline(1,3+d,5,color);
		dot(3,2+d,color);
		dot(4,1+d,color);
		dot(3,4+d,color);
		dot(4,5+d,color);
		dot(1,2+d,color);
		dot(0,1+d,color);
		dot(1,4+d,color);
		dot(0,5+d,color);
	}
	
	public static void MCfox()                    // Draw MInecraft Fox
	{
		FitWholeScreen("MEGENTA");
		Horline(6,2,8,"ORANGE");
		Horline(5,2,8,"ORANGE");
		Horline(4,2,8,"ORANGE");
		Vertline(7,2,1,"WHITE");
		Vertline(7,9,1,"WHITE");
		dot(8,3,"WHITE");
		dot(8,8,"WHITE");
		dot(7,3,"PINK");
		dot(7,8,"PINK");
		dot(3,2,"BLACK");
		Horline(2,2,2,"ORANGE");
		Horline(1,2,2,"WHITE");
		dot(3,3,"WHITE");
		Horline(3,4,4,"ORANGE");
		dot(3,8,"WHITE");
		dot(3,9,"BLACK");
		dot(2,4,"WHITE");
		dot(2,7,"WHITE");
		Horline(2,5,2,"BLACK");
		Horline(1,4,5,"WHITE");
		Horline(2,8,2,"ORANGE");
		Horline(1,8,2,"WHITE");
		
		ColorDisplay.pause(200);
		
	}
	
	public static void alex()                // Draw  Minecraft Alex
	{
		dot(5,18,"ORANGE");
		Horline(5,11,3,"ORANGE");
		Horline(6,11,4,"ORANGE");
		Horline(6+1,11,8,"ORANGE");
		Horline(6,16,3,"ORANGE");
		Horline(7+1,11,8,"ORANGE");
		Horline(6,15,2,"PINK");
		Horline(5,14,4,"PINK");
		dot(4,11,"PINK");
		dot(4,12,"WHITE");
		dot(4,13,"GREEN");
		Horline(4,14,2,"PINK");
		dot(4,16,"GREEN");
		dot(4,17,"WHITE");
		dot(4,18,"PINK");
		Horline(3,11,8,"PINK");
		Horline(2,11,3,"PINK");
		Horline(1,11,8,"PINK");
		Horline(2,16,3,"PINK");
		Horline(2,14,2,"RED");
		
		ColorDisplay.pause(200);
	}
	
	public static void random (String color) {                // Draw Radom Pattern
		int[] row = {0,1,2,3,4,5,6,7,8,9};
		int[] col  = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19};
		for (int h=0; h<col.length; h++) {
			for (int y=0; y<row.length; y++) {
			ColorDisplay.setPixelColor(row[y],col[h], color);
			ColorDisplay.pause(10);
			}
		}
	}
	
	public static void pyramid (String color, int d) {         // Draw Pyramid
		
		Horline(0,0,20,color);
		ColorDisplay.pause(200);
		Horline(1,1,18,color);
		ColorDisplay.pause(200);
		Horline(2,2,16,color);
		ColorDisplay.pause(200);
		Horline(3,3,14,color);
		ColorDisplay.pause(200);
		Horline(4,4,12,color);
		ColorDisplay.pause(200);
		Horline(5,5,10,color);
		ColorDisplay.pause(200);
		Horline(6,6,8,color);
		ColorDisplay.pause(200);
		Horline(7,7,6,color);
		ColorDisplay.pause(200);
		Horline(8,8,4,color);
		ColorDisplay.pause(200);
		Horline(9,9,2,color);
		ColorDisplay.pause(200);
		
		
		}
	
	
	public static void OFF()                                // Off whole screen
	{
		ColorDisplay.setScreenOFF();
	}
	
	public static void onBeat(int c)
	{

		System.out.println("At beat : " + c);
		
		if (c <= 5) {
		FitWholeScreen("BLACK");
		DrawH();                    // Draw Letter H
		DrawI();                    // Draw Letter I
		}
		else {
		OFF();
		}
		
		ColorDisplay.pause(200);    // Pause 0.2 Seconds
		
		if (c > 5 && c <= 12) {
		FitWholeScreen("WHITE");
		DrawHeart("PINK",10);         // Draw Heart
		DrawHeart("YELLOW",2);        
		}
		else {
		OFF();
		}
		
		ColorDisplay.pause(200);    // Pause 0.2 Seconds
		
		if (c > 12 && c <= 19) {
			FitWholeScreen("BLACK");
			Z(6,5,3,3,c % 5);
			Z(6,12,3,3,c % 5);
			Smile(2,"RED", c % 5);
			}
		else if (c > 19 && c <= 25) {
			FitWholeScreen("GREEN");
			for (int s=0; s<10; s++) {
				stairs(0,0,5,"BLUE", c % 10);
			}
			for (int v=0; v<20; v++) {
				stairs(0,9,5,"RED", c % 10);
			}
		}
		else if (c > 25 && c <= 32) {
			FitWholeScreen("PINK");
			Person("CYAN", c % 20);
			
		}
		else if (c > 32 && c <= 39) {
			FitWholeScreen("MENGENTA");
			MCfox();
			alex();
		}
		else if (c > 39 && c <= 49) {
			random(ColorDisplay.randomColor());
			}
		
		ColorDisplay.pause(200);
		
		if (c > 49 && c <= 60) {
			FitWholeScreen("WHITE");
			pyramid(ColorDisplay.randomColor(), c % 10);
				
			}
	  }
		
}