/*************************************************************************
	> File Name: SimpleDotCom.java
	> Author: 
	> Mail: 
	> Created Time: Mon 18 Apr 2016 12:07:13 AM CST
 ************************************************************************/

public class SimpleDotCom
{
    int[] locationCells;
    int numbOfHits=0;

    public void setLocationCells(int[] locs){
        locationCells=locs;
    }
    public String checkYourself(String stringGuess){
        int guess=Integer.parseInt(stringGuess);
        String result="miss";
        for (int cell:locationCells){
            if(guess==cell){
                result="hit";
                numbOfHits++;
                break;
            }
        }
        if (numbOfHits==locationCells.length){
            result="kill";
        }
        System.out.println(result);
        return result;
    }
}
