int work1(int *a, int i, int j)
{
    int x = a[i+2];
    a[j] = x+1;
    return a[i+2] - 3;
}
 
int work2(int *a, int i, int j)
{
    int t1 = i+2;
    int t2 = a[t1];
    a[j] = t2+1;
    return t2 - 3;
}