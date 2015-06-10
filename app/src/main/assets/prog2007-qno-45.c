int DoSomething (int n) {
               if (n < = 2)
                    return 1;
               else
        return (DoSomething (floor(sqrt(n))) + n);
}