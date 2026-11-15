public class CoffeePotModel {
    private int currentVolume;
    private int maxCapacity;

    public CoffeePotModel (int maxCapacity){

        this.maxCapacity = maxCapacity;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void brew(int amount){


        if(amount < 0) {
        
            
            throw new IllegalArgumentException();
        }

        if(currentVolume + amount > maxCapacity) {

            throw new IllegalStateException();
        }

        currentVolume += amount;
       
    }

    public void pour(int amount) {
        if(amount < 0) {
        
            
            throw new IllegalArgumentException();
        }

        if(currentVolume - amount < 0) {

            throw new IllegalStateException();
        }

        currentVolume -= amount;
    }
}

