#include <bits/stdc++.h>
using namespace std;

int main()
{

    int caseCount = 1, T, answers, r ;
    vector <string> web ;
    string s ;

    cin >> T;

    while(T--)
    {
        answers = -1;
        web.clear();

        for(int i = 0; i < 10; ++i)
        {
            cin >> s >> r;

            if(r > answers)
            {
                answers = r;
                web.clear();
                web.push_back(s);
            }
            else if(r == answers)
                web.push_back(s);
        }

        cout << "Case #" << caseCount++ << ":\n";

        int sz = web.size();

        for( int i = 0 ; i < sz ; ++i )
            cout << web[i] << '\n';
    }

    return 0;
}
