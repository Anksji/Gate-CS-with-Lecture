struct CellNode {
       struct CellNOde *leftChild;
       int element;
       struct CellNode *rightChild;
};
    int GetValue (struct CellNode *ptr) 
{
              int value = 0;
	if (ptr != NULL) 
        {
           if ((ptr -> leftChild == NULL) &&
               (ptr -> rightChild == NULL))
	value = 1;
           else
	value = value + GetValue(ptr -> leftChild)
		+ GetValue(ptr -> rightChild);
        }
		return(value);
}