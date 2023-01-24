
class enum1 {
    enum Month{
        JANUARY(31), FEBRUARY(28), MARCH(31), APRIL(30), MAY(31), JUNE(30),
    JULY(31), AUGUST(31), SEPTEMBER(30), OCTOBER(31), NOVEMBER(30), DECEMBER(31);
    
    private int days;
    Month(int days){
        this.days = days;
    }
    private int getDays(){
        return this.days;
    }
    }

    public static void main(String[] args) {
        for(Month data: Month.values()){
            System.out.print(data.toString() + "->" + data.getDays() + " ");
        }
    }
    
    
}
