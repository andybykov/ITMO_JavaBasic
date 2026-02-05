package Lab7;

public class Airplane {
    private final String model;
    Wing wing;

    public Airplane(String model, double weight) {
        this.model = model;
        wing = new Wing(weight);
    }

    public  String getModel() {
        return this.model;
    }

    public double getWeight(){
        return wing.getWeight();
    }

    public void showWeight(){
        wing.showWeight();
    }

    // вложенный класс
    public class Wing{
        private final double weight;

        public  Wing(double weight){
            this.weight = weight;
        }

        public Double getWeight(){
            return this.weight;
        }

        public void showWeight() {
            System.out.println("Вес крыла: " + weight + " кг");
        }
    }
}
