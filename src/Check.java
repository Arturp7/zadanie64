public class Check {

    String quarter(int coordinateX, int coordinateY ) {
        if (coordinateX > 0 && coordinateY > 0) {
            return "Punkt(" + coordinateX+","+coordinateY+") leży w  I ćwiartce układu współrzędnych";
        } else if (coordinateX < 0 && coordinateY > 0) {
            return "Punkt(" + coordinateX+","+coordinateY+") leży w  II ćwiartce układu współrzędnych";
        } else if (coordinateX < 0 && coordinateY < 0) {
            return "Punkt(" + coordinateX + "," + coordinateY + ") leży w  III ćwiartce układu współrzędnych";
        }else if (coordinateX > 0 && coordinateY < 0){
            return "Punkt(" + coordinateX+","+coordinateY+") leży w  IV ćwiartce układu współrzędnych";
        } else
        return "Punkt ("+ coordinateX+","+coordinateY+ ")To początek układu współrzędnych";}
}





