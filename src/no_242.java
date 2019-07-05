import java.util.*;
public class no_242 {
	static int val[][] = new int[15][15];
	static int pos;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dp[] = new int[1010];
		int ans[] = new int[20];
	    int s,T,t,n,i,j,k,f;
	    while(true){
	    	s = sc.nextInt();
	    	if(s == 0)	break;
	        T = sc.nextInt();
	        for(t=1;t<=T;t++)
	        {
	            n = sc.nextInt();
	            val[t][0]=n;
	            for(i=1;i<=n;i++)
	               val[t][i] = sc.nextInt();
	            Arrays.fill(dp, -1);
	            dp[0]=0;
	            for(i=1;i<=1000;i++)
	            {
	                for(j=1;j<=n && i-val[t][j]>=0;j++)
	                {
                        if(dp[i]==-1)
                          dp[i]=dp[i-val[t][j]]+1;
                        else
                          dp[i]=Math.min(dp[i],dp[i-val[t][j]]+1);
	                }
	                if(dp[i]>s)
	                {
	                    ans[t]=i-1;
	                    break;
	                }
	            }
	        }
	        f=0;
	        for(i=1;i<=T;i++)
	        {
	            if(ans[i]>f)
	            {
	                f=ans[i];
	                pos=i;
	            }
	            else if(ans[i]==f && check(i,pos))
	                pos=i;
	        }
	        System.out.printf("max coverage =%4d :",ans[pos]);
	        for(i=1;i<=val[pos][0];i++)
	           System.out.printf("%3d",val[pos][i]);
	        System.out.printf("\n");
	    }
	}
	static boolean check(int a,int b)
	{
	    if(val[a][0]!=val[b][0])
	      return val[a][0]<val[b][0];
	    int i=val[a][0];
	    for(;i>=1;i--)
	       if(val[a][i]!=val[b][i])
	         return val[a][i]<val[b][i];
	    return true;
	}
}
