public class Triple {

   // private String value;
    private int index; // the index of the string in the array, -1 if the string inserted to the stash
    private String preValue; // the string that was in the index before the current
    private int kickGroup; // number of elements that were kicked from their position during one insertion

    public Triple( int index, String previous, int numOfKicks){
        this.index = index;
        this.preValue = previous;
        this.kickGroup = numOfKicks;
    }

    public int getIndex(){
        return this.index;
    }

    public String getPreValue(){
        return this.preValue;
    }

    public int getKickGroup(){
        return this.kickGroup;
    }

}