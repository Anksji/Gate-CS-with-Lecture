void xyz(int a[], int b [], int c[])
{
  int i, j, k;
  i = j = k = O;
    while ((i < n) && (j < m))
        if (a[i] < b[j]) c[k++] = a[i++];
        else c[k++] = b[j++];
}