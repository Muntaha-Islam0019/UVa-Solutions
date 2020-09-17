#include <iostream>
using namespace std;

int main()
{
    // your code goes here

    int i ;
    while ( cin >> i )
    {

        if ( i % 6 == 0 || i == 0 )
        {
            printf ( "Y\n" ) ;
        }
        else
        {
            printf ( "N\n" ) ;
        }
    }
    return 0;
}
