public class Backyard{
    private int x;
    private int y;
    private int place_x;
    private int place_y;
    private String[][] field;

    public int getPlace_x() {
        return place_x;
    }
    public int getPlace_y() {
        return place_y;
    }
    public String[][] getField() {
        return field;
    }
    public int getX() {
        return x;
    } 
    public int getY() {
        return y;
    }

    public void create(int cordX, int cordY){
        x = cordX;
        y = cordY;
        field = new String[x][y];
        for (int i = 0; i < y; i++ ){
            for(int j = 0; j < x; j++ ){
                field[i][j] = " - ";
                System.out.printf("%s",field[i][j]);
            }
            System.out.println();
        }
    }
    public void input(int cordX, int cordY){
        place_x = cordX;
        place_y = cordY;
        for(int i = 0; i < y; i++){
            for(int j = 0; j < x; j++){
                field[place_y][place_x] = " x ";
                System.out.printf("%s",field[i][j]);
            }
            System.out.println();
        }
    }
}