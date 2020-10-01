/**
*    Name: printArray
*    Print each element of the generic vector on a new line. Do not return anything.
*    @param A generic vector
**/

// Write your code here
template <class T>
void printArray(vector<T> my_vector)
{
    typename vector<T>::iterator it;
    for (it = my_vector.begin(); it < my_vector.end(); it++)
        {
        cout << *it << endl;
    }
}