package math.findclosestperson;

public class FindClosestPerson {
    public int getClosest(int xAxis, int yAxis, int zAxis){
        int xSteps = Math.abs(xAxis-zAxis);
        int ySteps = Math.abs(yAxis-zAxis);
        if(xSteps < ySteps)
            return 1;
        else if(xSteps > ySteps)
            return 2;
        else
            return 0;
    }
}
