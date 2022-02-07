package arrays;

public class avgarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          double array[]= {3,5,6,9,8,7};
          double sum=0;
          for (int i=0;i<array.length;i++) {
        	  sum=sum+array[i];
          }
          
          double average=sum/array.length;
          
          System.out.println(String.format("%.2f", average));
	}

}
