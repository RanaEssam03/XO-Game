public class Main {
    public static void main(String[] args) {
        Board b1 = new Board(3);
        b1.display_board();
        System.out.println(b1.is_winner());
    }
}