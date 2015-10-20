package algorithm;
/**
 * @purpose 求解greatest common measure(最大公约数)
 * @author lixiang
 *
 */
public class gcd {
	public static void main(String[] args){
		
	}
	public static int gcd(int p, int q){
		if(q == 0) return q;
		int r = p % q;
		return gcd(q,r);
	}
}
