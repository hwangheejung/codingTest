#include <string>
#include <vector>
#include<iostream>
using namespace std;

int solution(int n) {
    double answer = 0;
    vector<int> a ={0,1};
    for(int i=0;i<n;i++){
        a.push_back((a[i]+a[i+1])%1234567);
    }
   
  answer=a[n];
    return answer;
}