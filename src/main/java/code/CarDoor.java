package code;

public class CarDoor {
    private boolean isDoorOpen;
    private boolean isWindowOpen;

    public boolean openDoor() {
        return isDoorOpen = true;
    }

    public boolean closeDoor() {
        return isDoorOpen = false;
    }

    public boolean openOrCloseDoor() {
        if (isDoorOpen) {
            return closeDoor();
        } else {
            return openDoor();
        }
    }

    public boolean openWindow() {
        return isWindowOpen = true;
    }

    public boolean closeWindow() {
        return isWindowOpen = false;
    }

    public boolean openOrCloseWindow() {
        if (isWindowOpen) {
            return closeWindow();
        } else {
            return openWindow();
        }
    }

    public boolean isDoorOpen() {
        return isDoorOpen;
    }

    public boolean isWindowOpen() {
        return isWindowOpen;
    }

    @Override
    public String toString() {
        return "CarDoor{"
                + "isDoorOpen=" + isDoorOpen
                + ", isWindowOpen=" + isWindowOpen
                + '}';
    }
}
