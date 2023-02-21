///@Author:Ahmed yehia
abstract class Board {
    protected int n;
    protected char [][]grid;

   public  abstract Boolean is_winner();
    public abstract Boolean update_board(int x , int y , char symbol);
    public abstract void display_board();
    public abstract Boolean is_draw();

}
