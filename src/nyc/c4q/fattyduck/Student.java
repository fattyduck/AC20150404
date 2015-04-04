package nyc.c4q.fattyduck;
/**
 * Created by fattyduck on 4/4/15.
 */
public class Student {
    private String name;
    private int    numOfPencilsInPocket;
    private lunchbox myLunchBox;

    public Student(String name)
    {
        this.name = name;
    }

    public String getName(){
        return name;
    }
    public int getNumOfPencilsInPocket(){
        return numOfPencilsInPocket;
    }
    public void setNumOfPencilsInPocket(int numOfPencilsInPocket){
        this.numOfPencilsInPocket = numOfPencilsInPocket;
    }
    public void setLunchBox(lunchbox item){
        myLunchBox=item;
    }
    public lunchbox getLunchBox(){
        return myLunchBox;
    }
}