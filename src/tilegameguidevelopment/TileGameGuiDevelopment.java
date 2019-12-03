package tilegameguidevelopment;
public class TileGameGuiDevelopment {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new TileGameGuiDevelopment();
    }
    
    public TileGameGuiDevelopment(){
        GameBoard gameBoard = new GameBoard();
        gameBoard.setVisible(true);
    }
}
