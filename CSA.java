public class CSA {
    public static void main(String[] args) {
        FrogSimulation sim = new FrogSimulation(24,5);
        for(int i = 0; i < 20; i++){
            System.out.println(sim.hopDistance());
        }


        HiddenWord puzzle = new HiddenWord("HARPS");
        System.out.println(puzzle.getHint("AAAAA"));
        System.out.println(puzzle.getHint("HELLO"));
        System.out.println(puzzle.getHint("HEART"));
        System.out.println(puzzle.getHint("HARMS"));
        System.out.println(puzzle.getHint("HARPS"));

    }
}
