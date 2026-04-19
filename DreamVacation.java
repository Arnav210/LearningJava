public class DreamVacation {
    
    private String destination;
    private double cost;

    public DreamVacation() {}

    public DreamVacation(String destination, double cost) {

        this.destination = destination;
        this.cost = cost;

    }

    public String getDestination() {
        return destination;
    }

    public double getCost() {
        return cost;
    }

    public void changeDestination(String newDestination) {
        destination = newDestination;
    }

    public void changeCost(double newCost) {
        cost = newCost;
    }

    public static void main(String[] args) {
        DreamVacation myDreamVacation = new DreamVacation();
        DreamVacation myDreamVacationDetailed = new DreamVacation("Italy", 4999.99);
        System.out.println(myDreamVacation.getDestination());
        System.out.println(myDreamVacation.getCost());
        System.out.println(myDreamVacationDetailed.getDestination());
        System.out.println(myDreamVacationDetailed.getCost());
        myDreamVacationDetailed.changeDestination("India");
        myDreamVacationDetailed.changeCost(1000);
        System.out.println(myDreamVacationDetailed.getDestination());
        System.out.println(myDreamVacationDetailed.getCost());
    }
}

