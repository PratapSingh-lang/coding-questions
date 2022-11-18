package lcs;

public class lcs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=3;
		int y=3;
		String s1 = "ABC";
		String s2 = "BDC";
//		lcs(x,y,s1,s2);
//		int countMin = countMin(s1);
//		System.out.println(countMin);
		int m = 12, n=23;
//		int m = 5, n=5;
		printRectangle(m,n);
		invertedAndRatatedHalfPyramid(m,n);
		invertedHalfPyramidWithNumbers(m,n);
		flyoidTraingle(m,n);
		zeroOneTraingle(m,n);
		butterFlyPattern(m);
	}
	
	private static void butterFlyPattern(int m) {
		// TODO Auto-generated method stub
		System.out.println("######### ButterFly ###########");
		for(int i =0;i<m;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("* ");
			}
			for(int j=0;j<2*(m-(i+1));j++) {
				System.out.print("  ");
			}
			for(int j=0;j<=i;j++) {
				System.out.print("* ");
			}

			System.out.println();
		}
		for(int i =m-1;i>=0;i--) {
			for(int j=0;j<=i;j++) {
				System.out.print("* ");
			}
			for(int j=0;j<2*(m-(i+1));j++) {
				System.out.print("  ");
			}
			for(int j=0;j<=i;j++) {
				System.out.print("* ");
			}

			System.out.println();
		}
	}

	private static void zeroOneTraingle(int m, int n) {
		// TODO Auto-generated method stub
		System.out.println("####### Zero One Traingle #########");
		int num=1;
		for(int i =0;i<m;i++) {
			for(int j =0;j<=i;j++) {
				
				if((i+j)%2 == 0) {
					System.out.print("1 ");
				}else {
					System.out.print("0 ");
				}
				
//				if(i%2 == 0) {
//					if(j%2 ==0)
//					System.out.print("1" + " ");
//					else {
//						System.out.print("0 ");
//					}
//					
//				}
//				else {
//					if(j%2 !=0)
//						System.out.print("1" + " ");
//						else {
//							System.out.print("0 ");
//						}
//				}
//					System.out.print("0 ");
			}
//			num =0;
			System.out.println();
		}
	}

	private static void flyoidTraingle(int m, int n) {
		// TODO Auto-generated method stub
		System.out.println("####### Flyoid Traingle #########");
		int num =0;
		for(int i =0;i<m;i++) {
			for(int j =0;j<=i;j++) {
//				if(j >=(n-(i+1)))
					System.out.print(++num + " ");
//				else
//					System.out.print("  ");
			}
//			num =0;
			System.out.println();
		}
	}

	private static void invertedHalfPyramidWithNumbers(int m, int n) {
		// TODO Auto-generated method stub
		System.out.println("####### Inverted Half Pyramid with numbers #########");
//		int num =0;
		for(int i =0;i<m;i++) {
			for(int j =0;j<n-i;j++) {
//				if(j >=(n-(i+1)))
					System.out.print(j+1 + " ");
//				else
//					System.out.print("  ");
			}
//			num =0;
			System.out.println();
		}
	}

	private static void invertedAndRatatedHalfPyramid(int m, int n) {
		// TODO Auto-generated method stub
		System.out.println("####### Inverted And Rotated Pyramid #########");
		for(int i =0;i<m;i++) {
			for(int j =0;j<n;j++) {
				if(j >=(n-(i+1)))
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}

		
	}

	static void printRectangle(int m,int n){
		System.out.println("############ Print Rectangle ########### ");
		for(int i =0;i<m;i++) {
			for(int j =0;j<n;j++) {
				if(i==0 || j ==0 || i==m-1|| j==n-1)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}

	}
    static int countMin(String str)
    {
        // code here
        int m = str.length();
        String rev = "";
        int dp[][] = new int[m+1][m+1];
        for(int i=0;i<m;i++)
            rev = str.charAt(i) + rev;
                            // System.out.print(rev);
         for(int i=0;i<m+1;i++){
            for(int j=0;j<m+1;j++){
                if(i==0 || j==0){
                    dp[i][j] =0;
                }
                else if(str.charAt(i-1) == rev.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1] +1;
                }else{
                    Math.max(dp[i-1][j], dp[i][j-1]);
                }
                 System.out.print(dp[i][j]);
            }
                             System.out.println();
        }
         for(int i=0;i<m+1;i++){
            for(int j=0;j<m+1;j++){
                // if(i==0 || j==0){
                //     dp[i][j] =0;
                // }
                // else if(str.charAt(i-1) == rev.charAt(j-1)){
                //     dp[i][j] = dp[i-1][j-1] +1;
                // }else{
                //     Math.max(dp[i-1][j], dp[i][j-1]);
                // }
                System.out.print(dp[i][j]);
            }
                            System.out.println();
        }
                        // System.out.print(dp[m][m]);
        return m-dp[m][m];
    }
	private static void lcs(int x, int y, String s1, String s2) {
		// TODO Auto-generated method stub
		int dp[][] = new int [x+1][y+1];
        char X[]=s1.toCharArray();
        char Y[]=s2.toCharArray();
         for(int i=0;i<x+1;i++){
             for(int j=0;j<y+1;j++)
             if(i==0||j==0){
                 dp[i][j]=0;
             }
         }
        for(int i=1;i<x+1;i++){
            for(int j=1;j<y+1;j++){
//                if(i==0 || j==0){
//                    dp[i][j] =0;
//                }
                // else if(s1.charAt(i-1) == s2.charAt(j-1)){
                 if(X[i-1] == Y[i-1]){
                    dp[i][j] = 1+ dp[i-1][j-1];
                }else{
                   dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
                System.out.print(dp[i][j]);
            }
                System.out.println();
        }
        
		
	}

}
