function solution(sizes) {
    var answer = 0;
    let max_width=0;
    let max_height=0;

  
    for(let i=0;i<sizes.length;i++){
        if(sizes[i][0]>sizes[i][1]){
            let ch = sizes[i][0];
            sizes[i][0]=sizes[i][1];
            sizes[i][1]=ch;
        }
    }
    for(let i=0;i<sizes.length;i++){
        if(max_width<sizes[i][0]){
            max_width=sizes[i][0];
        }
        if(max_height<sizes[i][1]){
            max_height=sizes[i][1];
        }
    }
    answer=max_width*max_height;
        return answer;
}