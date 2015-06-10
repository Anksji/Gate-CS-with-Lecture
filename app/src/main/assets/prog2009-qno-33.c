void enter_CS(X)
{
    while test-and-set(X) ;
}
void leave_CS(X)
{
   X = 0;
}
