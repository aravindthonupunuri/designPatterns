
abstract class EntertainmentDevice {

    public int deviceState;

    public int maxSetting;

    public int volumeLevel = 0;

    public abstract void buttonFivePressed();

    public abstract void buttonSixPressed();

    public void deviceFeedback() {

        if(deviceState > maxSetting || deviceState < 0) { deviceState = 0; }

        System.out.println("On Channel " + deviceState);

    }


}
class TVDevice extends EntertainmentDevice {

    public TVDevice(int newDeviceState, int newMaxSetting){

        deviceState = newDeviceState;

        maxSetting = newMaxSetting;

    }

    public void buttonFivePressed() {

        System.out.println("Channel Down");

        deviceState--;

    }

    public void buttonSixPressed() {

        System.out.println("Channel Up");

        deviceState++;

    }

}
abstract class RemoteButton{


    private EntertainmentDevice theDevice;

    public RemoteButton(EntertainmentDevice newDevice){

        theDevice = newDevice;

    }

    public void buttonFivePressed() {

        theDevice.buttonFivePressed();

    }

    public void buttonSixPressed() {

        theDevice.buttonSixPressed();

    }

    public void deviceFeedback(){

        theDevice.deviceFeedback();

    }

    public abstract void buttonNinePressed();

}
class TVRemoteMute extends RemoteButton{

    public TVRemoteMute(EntertainmentDevice newDevice) {
        super(newDevice);
    }

    public void buttonNinePressed() {

        System.out.println("TV was Muted");

    }

}
class TVRemotePause extends RemoteButton{

    public TVRemotePause(EntertainmentDevice newDevice) {
        super(newDevice);
    }

    public void buttonNinePressed() {

        System.out.println("TV was Paused");

    }

}
public class TestTheRemote{

    public static void main(String[] args){

        RemoteButton theTV = new TVRemoteMute(new TVDevice(1, 200));

        RemoteButton theTV2 = new TVRemotePause(new TVDevice(1, 200));

        System.out.println("Test TV with Mute");

        theTV.buttonFivePressed();
        theTV.buttonSixPressed();
        theTV.buttonNinePressed();

        System.out.println("\nTest TV with Pause");

        theTV2.buttonFivePressed();
        theTV2.buttonSixPressed();
        theTV2.buttonNinePressed();
        theTV2.deviceFeedback();



    }

}
