package Maths;

public class dayOfyear {
    public int dayOfYear(String date) {
        int days=0;
        int arr[]={31,28,31,30,31,30,31,31,30,31,30,31};
        String []year=date.split("-");
        int y=Integer.parseInt(year[0]);
        int month=Integer.parseInt(year[1]);
        int day=Integer.parseInt(year[2]);
        boolean leap =false;
        for(int i=0;i<month-1;i++){
            days +=arr[i];
        }
        days +=day;
        if(y%4==0){
             if(y%100==0){
                 if(y%400==0){
                     leap=true;
                 }
                 else{
                     leap=false;
                 }
             }
             else{
                 leap=true;
             }
        }
        else{
            leap=false;
        }
        if(leap==true && month>2){
            days +=1;
        }
        return days;
    }
}
/*
 * Given a string date representing a Gregorian calendar date formatted as YYYY-MM-DD, return the day number of the year.

 

Example 1:

Input: date = "2019-01-09"
Output: 9
Explanation: Given date is the 9th day of the year in 2019.
Example 2:

Input: date = "2019-02-10"
Output: 41
 
 */
