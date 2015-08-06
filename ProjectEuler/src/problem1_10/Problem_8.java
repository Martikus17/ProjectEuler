package problem1_10;

public class Problem_8 {
	
	public static void main(String[] args){
		int a,b,c,d,e,f,g,h,i,j,k,l,m, as=0, bs=0, cs=0, ds=0, es = 0, fs=0, gs=0, hs=0, is=0, js=0, ks=0, ls=0, ms = 0 ;
		int produkt = 0;
		String digit = "73167176531330624919225119674426574742355349194934"
				+ "96983520312774506326239578318016984801869478851843"
				+ "85861560789112949495459501737958331952853208805511"
				+ "12540698747158523863050715693290963295227443043557"
				+ "66896648950445244523161731856403098711121722383113"
				+ "62229893423380308135336276614282806444486645238749"
				+ "30358907296290491560440772390713810515859307960866"
				+ "70172427121883998797908792274921901699720888093776"
				+ "65727333001053367881220235421809751254540594752243"
				+ "52584907711670556013604839586446706324415722155397"
				+ "53697817977846174064955149290862569321978468622482"
				+ "83972241375657056057490261407972968652414535100474"
				+ "82166370484403199890008895243450658541227588666881"
				+ "16427171479924442928230863465674813919123162824586"
				+ "17866458359124566529476545682848912883142607690042"
				+ "24219022671055626321111109370544217506941658960408"
				+ "07198403850962455444362981230987879927244284909188"
				+ "84580156166097919133875499200524063689912560717606"
				+ "05886116467109405077541002256983155200055935729725"
				+ "71636269561882670428252483600823257530420752963450";
		
		while (digit.length()>=13){
			a = (int)(digit.charAt(0))-48;
			b = (int)(digit.charAt(1))-48;
			c = (int)(digit.charAt(2))-48;
			d = (int)(digit.charAt(3))-48;
			e = (int)(digit.charAt(4))-48;
			f = (int)(digit.charAt(5))-48;
			g = (int)(digit.charAt(6))-48;
			h = (int)(digit.charAt(7))-48;
			i = (int)(digit.charAt(8))-48;
			j = (int)(digit.charAt(9))-48;
			k = (int)(digit.charAt(10))-48;
			l = (int)(digit.charAt(11))-48;
			m = (int)(digit.charAt(12))-48;
			
			if (produkt < getProduct(a, b, c, d, e, f, g, h, i, j, k, l, m)){
				produkt = getProduct(a, b, c, d, e, f, g, h, i, j, k, l, m);
				as = a;
				bs = b;
				cs = c;
				ds = d;
				es = e;
				fs = f;
				gs = g;
				hs = h;
				is = i;
				js = j;
				ks = k;
				ls = l;
				ms = m;
				
			}
			digit = shift(digit);
		}
		System.out.print(as + " "+bs + " "+cs + " "+ds + " "+ es + " "+fs + " "+gs + " "+hs + " "+is + " "+js + " "+ks + " "+ks + " "+ms + " "+produkt);
		
	}
	
	
	public static int getProduct(int a, int b, int c, int d, int e, int f, int g, int h, int i, int j, int k, int l, int m){
		return a*b*c*d*e*f*g*h*i*j*k*l*m;
	}
	
	public static String shift(String digit){
		String returnString = "";
		if (digit.length()>13){
			
			returnString = digit.substring(1, digit.length());
		}
		
		
		return returnString;
	}
}
