for (i = 0, i < n; i++)
{
    for (j=0; j < n; j++)
    {
        if (i%2)
        {
            x += (4*j + 5*i);
            y += (7 + 4*j);
        }
    }
}