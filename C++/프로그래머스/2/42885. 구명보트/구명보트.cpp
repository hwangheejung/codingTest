#include <string>
#include <vector>
#include<algorithm>
#include<iostream>
#include<stack>

using namespace std;

int solution(vector<int> people, int limit) {
    int answer = 0;

  
    sort(people.rbegin(),people.rend());
    stack <int> stk;
    
    stk.push(people[0]);
    for(int i=1;i<people.size();i++){
        if(stk.size()!=0 && stk.top()+people[i]<=limit){
            answer++;
            stk.pop();
        }
        else{
            stk.push(people[i]);
        }
        
    }
   
    answer +=stk.size();
   
    return answer;
}