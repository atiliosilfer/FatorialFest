#include <iostream>

using namespace std;

int main()
{
    long int n, f = 1;
    cin >> n;

    cout << "Hello HacktoberFest!" << endl;

    if (n > 0)
    {
        for (unsigned long long int i = 1; i <= n; i++)
            f *= i;

        cout << "fatorial(" << n << ") = " << f << endl;
    }

    return 0;
}