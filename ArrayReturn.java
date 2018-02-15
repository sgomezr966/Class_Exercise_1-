public class ArrayReturn
{
   public static double[] returnArray( )
   {
      double[] x;

      x = new double[3];    // Create an array of 3 elements

      x[0] = 2.3;
      x[1] = 3.4;
      x[2] = 4.5;

      return( x );         // Return the **reference** (location) of the array
   }
	
	public static double[] reverse(double[]list){
			double[] result = new double[list.length];
			for(int i =0, j = result.length-1;i<list.length;i++, j--){
					result[j] = list[i];
			}
		return result;
	}

   public static void main(String[] args)
   {
      double[] a;

      a = returnArray();

      System.out.println("Array A:");

      for (int i = 0; i < a.length; i++)
         System.out.println( a[i] );   
	 
	 System.out.println("Reversed Array A:");
	 
	 double[] b = reverse(a);
	 for (int i = 0; i < b.length; i++)
         System.out.println( b[i] ); 
	 
   }
}