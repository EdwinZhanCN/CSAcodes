public class FrogSimulation {

    private int goalDistance;
    private int maxHops;
    public FrogSimulation(int goalDistance, int maxHops){
        this.goalDistance = goalDistance;
        this.maxHops = maxHops;
    }
    public int hopDistance(){
        return (int)(-15 + Math.random()*(15-(-15)+1));
    }
    public boolean simulate(){
        int position = 0;
        for (int i = 0; i < maxHops; i++){
            position += hopDistance();

            if (position >= goalDistance){
                return true;
            } else if (position < 0){
                return false;
            }
        }
        return false;
    }

    public double runSimulations(int num){
        int success = 0;

        for (int i = 0; i < num; i++) {
            if(simulate()) {
                success++;
            }
        }
        return (double)success / num;
    }
}