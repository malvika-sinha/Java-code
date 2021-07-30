import java.util.*;
import java.io.*;
public class pract{
	public static void main(String[] args)throws IOException{
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		String s=in.readLine();
		int n=s.length();
		System.out.println(nextGreater(s,n));
	}
    static void swap(char ar[], int i, int j){
        char temp = ar[i];
        ar[i] = ar[j];
        ar[j] = temp;
    }
    static String nextGreater(String s, int n){
    	char[] ar=s.toCharArray();
        int i;
        for (i = n - 1; i > 0; i--){
            if (ar[i] > ar[i - 1]) {
                break;
            }
        }
        if (i == 0){
            return "-1";
        }
        else{
            int x = ar[i - 1], min = i;
            for (int j = i + 1; j < n; j++)
            {
                if (ar[j] > x && ar[j] < ar[min])
                {
                    min = j;
                }
            }
            swap(ar, i - 1, min);
            Arrays.sort(ar, i, n);
            StringBuilder ret=new StringBuilder();
            for (i = 0; i < n; i++)
                ret.append(ar[i]+"");
            return ret.toString();
        }
    }
}
class FastReader{
    public static StringTokenizer st;
    public static BufferedReader in;
    public static PrintWriter pw;
    FastReader(){
        in = new BufferedReader(new InputStreamReader(System.in));
        pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        st = new StringTokenizer("");
    }
    public static int nextInt() throws IOException {
        return Integer.parseInt(next());
    }
    public static long nextLong() throws IOException {
        return Long.parseLong(next());
    }
    public static double nextDouble() throws IOException {
        return Double.parseDouble(next());
    }
    public static String next() throws IOException {
        while(!st.hasMoreElements() || st == null){
            st = new StringTokenizer(in.readLine());
        }
        return st.nextToken();
    }
}