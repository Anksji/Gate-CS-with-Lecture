if (fork() == 0){ 
	a = a + 5; 
	printf("%d,%d\n", a, &a);
}else {
 	a = a-5; 
	printf("%d, %d\n", a, &a);
} 

