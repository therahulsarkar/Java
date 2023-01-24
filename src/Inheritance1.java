
class Square{
    int side;
    final double pi = 3.14;
    Square(int s){
        this.side = s;
    }
    public void getVolume(){
        // return Math.pow(this.side, 3);
        System.out.print("Volume: " + Math.pow(this.side, 3) + "\n ");
    }
}

 class Inheritance1 extends Square {
    int height;
    Inheritance1(int side, int height){
        super(side);
        this.height = height;
    }

    public void getVolume(){
        System.out.print("Volume: " + pi * Math.pow(this.side, 2) * this.height + "\n ");
    }

    public static void main(String[] args) {
        Square s = new Square(10);
        s.getVolume();

        Inheritance1 i = new Inheritance1( 2, 5);
         i.getVolume();
        
    }
    
}

