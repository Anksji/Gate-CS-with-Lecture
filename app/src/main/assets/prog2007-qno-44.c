int gcd(n,m)
{
	if (n%m ==0) return m;
	        n = n%m;
		return gcd(m,n);
}