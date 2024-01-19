public class Cube {
    //prop
    private int side;

    public Cube(){
        side = 1;
    }
    public Cube(int i) {
        if(i<1){
            throw new IllegalArgumentException("A cube’s side length cannot be less than 1!");
        }
        this.side = i;
    }

    public int getSide(){
        return side;
    }

    public void setSide(int i){
        if(i<1){
            throw new IllegalArgumentException("A cube’s side length cannot be less than 1!");
        }
        this.side = i;
    }

    public int getSurfaceArea() {
        return 6*(side * side);
    }
    public int getVolume() {
        return side * side * side;
    }
}
