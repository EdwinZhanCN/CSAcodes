public class Heroes {
    private String name;
    private int hitPoints;


    public Heroes(String name){
        this.name = name;
        this.hitPoints = 100;
    }

    public String getName() {
        return name;
    }

    public int getHitPoints(){
        return hitPoints;
    }

    public void setHitPoints(int hitPoints){
        this.hitPoints = hitPoints;
    }

    public void duel(Heroes opponent) throws InterruptedException {
        double randomNumber = Math.random();
        int damage = 0;
        if( randomNumber < 0.5){
            this.hitPoints -= 10;
        }else{
            damage = 10;
        }
        opponent.setHitPoints(opponent.getHitPoints() - damage);
        System.out.println(this);
        System.out.println(opponent);
        System.out.println();
        System.out.println();
        Thread.sleep(1000);
    }

    public void duelToTheDeath(Heroes opponent) throws InterruptedException {
        while(this.hitPoints > 0 && opponent.getHitPoints() > 0){
            duel(opponent);
        }
    }

    public void phoenixDown(Heroes revival){
        if(revival.getHitPoints() == 0) {
            revival.setHitPoints(100);
        }
    }

    public String nFightsToTheDeath (Heroes opponent, int times) throws InterruptedException {
        int winTimes = 0;
        int opponentWinTimes = 0;
        while (times > 0){
            duelToTheDeath(opponent);
            if(this.hitPoints == 0){
                opponentWinTimes += 1;
                phoenixDown(this);
            }else {
                winTimes += 1;
                phoenixDown(opponent);
            }
            times -= 1;
        }
        return this.name + ": " + winTimes + " wins"+
                "\n" + opponent.getName() + ": " + opponentWinTimes + " wins";
    }




    @Override
    public String toString(){
        return name + ": " + hitPoints + " hp";
    }

}
