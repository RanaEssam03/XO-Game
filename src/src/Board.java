public class Board {
final private int n;
private char[][]grid;
public Board(int size){
    n = size;
    grid = new char[n][n];
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            grid[i][j] = '-';
        }
    }
}
public Boolean update_board(int x , int y , char symbol){
    if( x < n && x>-1 && y<n && y>-1){
         System.out.println("Positions out of Range!..Please Try Again");
         return false;
    }
    else if ( grid[x][y]!='-'){
        System.out.println("Invalid Positions! .. Please try again");
        return false;
    }
  grid[x][y] = symbol;
    return true;
}
public void display_board(){
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            System.out.print(grid[i][j]);
            System.out.print(' ');
        }
        System.out.println();
    }
}
public Boolean is_winner(){
    for(int i=0;i<n;i++){
       char symbol = grid[i][0];
       if(symbol != '-'){
       Boolean flag = false;
       for(int j = 1 ; j<n;j++){
           if(grid[i][j] != symbol){
               flag = true;
           }
       }
       if(!flag)
           return true;
       }
    }
    for(int j=0;j<n;j++){
        char symbol = grid[0][j];
        if(symbol != '-'){
        Boolean flag = false;
        for(int i = 1 ; i<n;i++){
            if(grid[i][j] != symbol){
                flag = true;
            }
        }
        if(!flag)
            return true;
        }
    }
    char symbol = grid[0][0];
    Boolean ok = true;
    for(int i=1;i<n;i++){
        if(symbol == '-' || grid[i][i] != symbol){
            ok = false;
        }
    }
    if(ok)
        return true;

    symbol = grid[0][2];
    ok = true;
    for(int i = 1 ,j=1 ; i<n && j>=0 ; i++,j--){
        if(symbol == '-' || grid[i][j] != symbol){
            ok = false;
        }
    }
    if(ok)
        return true;
    return false;

}
public Boolean is_draw(){
    for(int i =0;i<n;i++){
        for(int j=0;j<n;j++){
            if(grid[i][j] == '-'){
                return false;
            }
        }
    }
    return true;
}


}
