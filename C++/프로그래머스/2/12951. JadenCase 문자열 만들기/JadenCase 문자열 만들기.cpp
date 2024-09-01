#include <string>
#include <vector>
#include<iostream>
using namespace std;

string solution(string s) {
    string answer = "";
    if(s[0]>=97&&s[0]<=122){
        s[0]= toupper(s[0]);
    }
    for(int i=1;i<s.size();i++){
        
        if(s[i]==' '){
            if(s[i+1]==' '){
            
            cout<<"공백이라오"<<endl;
                s[i+1]=toupper(s[i+1]);
            }
            else{
                
            
            s[i+1]=toupper(s[i+1]);
            i++;
            }
        }
        else if(s[i]>=65&&s[i]<=90){
            s[i] = tolower(s[i]);
        }
    }
 answer=s;
    return answer;
}