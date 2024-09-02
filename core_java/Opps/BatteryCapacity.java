/*
 *  Battery has current capacity,
 *              upper limit for the charge
 *              lower limit for the charge
 * 
 * Charging operation increases the current capacity, charging should stop once it reaches the upperlimit
 * Discharging operation decreases the current capacity, discharging should not reduce the current capacity below th elower limit.
 * 
 * Battery capacity can be viewed
 */

class Battery {

    double currentCapacity;
    double upperLimit;
    double lowerLimit;

    Battery(double currentCapacity, double upperLimit, double lowerLimit) {
        this.currentCapacity = currentCapacity;
        this.upperLimit = upperLimit;
        this.lowerLimit = lowerLimit;
    }

    void charging(){

        while (currentCapacity < upperLimit) {
            System.out.println("Charging....");
            currentCapacity++;
        }

    }

    void discharging(){

        while (currentCapacity > lowerLimit) {
            System.out.println("Discharging....");
            currentCapacity--;
        }

    }

    void viewCapacity(){
        System.out.println("The Current Capacity: " + this.currentCapacity);
    }
    
 }
 
class BatteryCapacity {
    public static void main(String[] args) {
        
        Battery b = new Battery(39.0, 100.0, 10.0);
        b.viewCapacity();
        b.charging();
        b.viewCapacity();
        b.discharging();
        b.viewCapacity();

    }
}