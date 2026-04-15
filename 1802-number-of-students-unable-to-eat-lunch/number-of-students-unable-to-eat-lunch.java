class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
     int zeroes = 0;
     int ones = 0;
     for(int student : students){
        if(student ==0){
            zeroes++;
        }
        else{
            ones++;
        }
     }   
     for(int sandwich : sandwiches){
        if(sandwich ==0){
            if(zeroes ==0){
                return ones;
            }
            else{
                zeroes--;
            }
        }
        else if(sandwich==1){
            if(ones ==0){
                return zeroes;
            }
            else{
                ones--;
            }
        }
     }
     return 0;
    }
}