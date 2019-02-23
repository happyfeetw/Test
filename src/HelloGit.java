public class HelloGit{

	public static void main(String[] args){
		
		System.out.println("我的第一个使用git共享的程序");
		
		int[] input = [9,3,7,5,4,0,10];
		System.out.println(minimalInt(input));
		
	}
	
	/**
	 * 找出数组中的最小整数
	 */
	public static int minimalInt(int[] arr){
		int min = arr[0];
		for(i=0; i<arr.length; i++){
			if(arr[i] < min){
				min = arr[i];
			}
		}
		return min;
	}
}

