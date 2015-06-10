void P (binary_semaphore *s)
{
    unsigned y;
    unsigned *x = &(s→value);
    do
    {
        fetch-and-set x, y;
    }
    while (y);
}
void V (binary_semaphore *s)
{
    S→value = 0;
} 