#include <iostream>
#include <vector>
#include <string>

using namespace std;

int main()
{
    int a[7]={55,75,23,54,86,-22,-1};
    for(int i = 1; i< 7 ; i++){
        int j = i+1;
        int temp = a[j];
        while(a[j-1]>temp && j>0){
            a[j]=a[j-1];
            j--; 
        }
        a[j] = temp;
    }
    for(int k = 0; k< 7;k++)
        cout<<a[k]<<"\n";    
}
