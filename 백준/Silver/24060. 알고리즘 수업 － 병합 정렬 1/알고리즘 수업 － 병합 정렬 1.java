import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	static int[] arr;
	static int[] tmp;
	static int cnt = 0;
	static int result;
	static int K;
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
	
		st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		
		arr = new int[N];
		tmp = new int[N];
		
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		merge_sort(arr, 0, arr.length-1);
		
		if(result == 0) {
			result = -1;
		}
		
		System.out.println(result);
    }	
	
	static void merge_sort(int[] a, int p, int r) {
		
		int q;
		
		if(p < r) {
			q = (p+r)/2;
			
			merge_sort(a, p, q);
			merge_sort(a, q+1, r);
			merge(a, p, q, r);
		}
	}
	
	static void merge(int[] a, int p, int q, int r) {
		int i = p;
		int j = q+1;
		int t = 0;
		
	    while (i <= q && j <= r) {
	        if (a[i] <= a[j]) {
		        tmp[t++] = a[i++];
	        } else {
	        	tmp[t++] = a[j++];
	        }
	    }
	    
	    while (i <= q) {
	    	tmp[t++] = a[i++];
	    }
	    while (j <= r) {
	        tmp[t++] = a[j++];
	    }
	    
	    i = p; 
	    t = 0;
	    
	    while (i <= r) {
	    	cnt++;
	    	if(cnt==K){
                result = tmp[t];
                break;
            }
	        a[i++] = tmp[t++]; 
	    }
	}
}