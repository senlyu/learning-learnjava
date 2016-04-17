/*************************************************************************
	> File Name: Player.java
	> Author: 
	> Mail: 
	> Created Time: Sun 17 Apr 2016 09:32:34 PM CST
 ************************************************************************/

public class Player
{
    int number=0;

    public void guess(){
        number =(int)(Math.random()*10);
        System.out.println("I'm guessing "+number);

    }
}
