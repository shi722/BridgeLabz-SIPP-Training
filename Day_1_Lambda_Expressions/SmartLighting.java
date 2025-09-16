interface LightAction {
    void activate();
}
public class SmartLighting {
    public static void main(String[] args) {
        LightAction motionSensor = () -> System.out.println("Lights ON: Motion detected!");
        LightAction nightMode = () -> System.out.println("Lights dimmed: Night mode activated!");
        LightAction voiceCommand = () -> System.out.println("Lights OFF: Voice command received!");
        motionSensor.activate();
        nightMode.activate();
        voiceCommand.activate();
    }
}
