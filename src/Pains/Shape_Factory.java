package Pains;

public class Shape_Factory {
    public Shape createShape(int numberOfSides){

        if(numberOfSides==4){
            return new Rectangle_R();
        }
        else if(numberOfSides==3){
            return new Triangle_R();
        }
        else if(numberOfSides==2){
            return new Angle_R();
        }
        else if (numberOfSides==1){
            return new Straight_R();
        }
        else if(numberOfSides==0){
            return new Circle_R();
        }else{
            return null;
        }
    }
}
