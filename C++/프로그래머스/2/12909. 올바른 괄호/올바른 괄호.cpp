#include<string>
#include <iostream>
#include<stack>

using namespace std;

bool solution(string s)
{
    bool answer = true;
    stack<int > stk;
    
    
    stk.push(s[0]);
    for(int i=1;i<s.size();i++){
        if(s[i]=='('){
            stk.push(s[i]);
            
        }
        else {
          if(stk.empty()){
              return false;
          }
            else stk.pop();
        }
        
    }
    if(stk.empty()){
        answer=true;
    }
    else{
        answer=false;
    }

    return answer;
}