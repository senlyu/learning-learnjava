/*************************************************************************
	> File Name: SimpleDotComTestDrive.java
	> Author: 
	> Mail: 
	> Created Time: Sun 17 Apr 2016 11:54:17 PM CST
 ************************************************************************/

public class SimpleDotComTestDrive
{
    public static void main (String[] args){
        SimpleDotCom dot= new SimpleDotCom();
        int[] Locations={2,3,4};
        dot.setLocationCells(Locations);
        String userGuess="2";
        String result=dot.checkYourself(userGuess);

    }
}
