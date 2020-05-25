package Pains;

import java.util.Objects;

public class Shape_Factory {


    public Shape createShape(String stringOfSides){


        if(Objects.equals(stringOfSides, "M")){
            return new Message_Flow_R();
        }
        else if(Objects.equals(stringOfSides, "A")){
            return new Activities_R();
        }
        else if(Objects.equals(stringOfSides, "G")){
            return new Gateways_R();
        }
        else if (Objects.equals(stringOfSides, "E")){
            return new Event_R();
        }
        else if(Objects.equals(stringOfSides, "S")){
            return new Sequence_Flow_R();
        }else{
            return null;
        }


    }
}
