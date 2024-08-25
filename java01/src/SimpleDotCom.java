public class SimpleDotCom {

    int [] LocationsCell ;
    int numOfHits = 0;
    public void setLocationsCell(int [] locs){
        LocationsCell = locs;
    }
    public String checkYourSelf(String StringGuess){
        int guess = Integer.parseInt(StringGuess);
        String result = "miss";
        for(int cell : LocationsCell){
            if (guess==cell){
                result = "Hit";
                numOfHits++;
                break;
            }
        } // out of the Loop
        if(numOfHits==LocationsCell.length){
            result = "Kill";
        }
        System.out.println(result);
        return result;
    }
}
