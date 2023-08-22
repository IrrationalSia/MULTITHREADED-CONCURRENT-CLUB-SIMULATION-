public class Barman {
        // ... Barman class definition...
        private boolean busy;
    private boolean hasDrink;

    Barman() {
        busy = false;
        hasDrink = false;
    }

    synchronized boolean isBusy() {
        return busy;
    }

    synchronized void takeOrder() {
        busy = true;
        hasDrink = false;
    }

    synchronized boolean hasDrink() {
        return hasDrink;
    }

    synchronized void makeDrink() throws InterruptedException {
        Thread.sleep(1000); // Simulate making a drink
        hasDrink = true;
    }

    synchronized void deliverDrink() {
        busy = false;
        hasDrink = false;
    }
    }
