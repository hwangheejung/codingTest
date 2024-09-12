#include <string>
#include <vector>
#include <iostream>

using namespace std;

vector<int> solution(int n, vector<string> words) {
    vector<int> answer;

    int people=0;
    int order=0;
   
    int index=0;
    
    bool first =false;
    for(int i=1;i<words.size();i++){
        if(words[i-1].back()!=words[i].front()){
            people = i%n+1;
            order =i/n+1;
            index =i;
            break;
     
        }
  
    }
   
    for(int i=1;i<words.size();i++){
        for(int j=0;j<i;j++){
            if(words[i]==words[j]){
                if(index ==0 || index>i){
                    
                
                 people = i%n+1;
            order =i/n+1;
                }
                break;
            }
        }
    }

    
    answer.push_back(people);
    answer.push_back(order);
    
   
    return answer;
}