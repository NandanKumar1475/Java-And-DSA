package html;
public class Battery {
    private int CurrentCapacity ;
    private int Llimit ;
    private int Ulimit ;


    // constructor start
    Battery(int currentCapacity , int Llimit , int Ulimit)
    {
        if (currentCapacity > Ulimit || currentCapacity < Llimit) {
            System.out.println("Input error ");
            throw new IllegalArgumentException("current capacity is must be between lower limit and upper limit");
        }
        this.CurrentCapacity = currentCapacity ;
        this.Llimit = Llimit ;
        this.Ulimit = Ulimit ;
    } 
    // constructor end 

    public void charge(int amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Charge amount must be positive.");
        }
        currentCapacity += amount;
        if (currentCapacity > Ulimit) {
            currentCapacity = Ulimit;
        }
    }

}


