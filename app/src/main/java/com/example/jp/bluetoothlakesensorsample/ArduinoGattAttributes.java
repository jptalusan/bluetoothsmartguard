package com.example.jp.bluetoothlakesensorsample;
import java.util.HashMap;

/**
 * This class includes a small subset of standard GATT attributes for demonstration purposes.
 */
public class ArduinoGattAttributes {
    private static HashMap<String, String> attributes = new HashMap<String, String>();    //public static final String SerialPortUUID = "0000fff0-0000-1000-8000-00805f9b34fb"; //
    //public static final String SerialPortUUID = "0000fff1-0000-1000-8000-00805f9b34fb"; //nothing
    //public static final String SerialPortUUID = "0000fff4-0000-1000-8000-00805f9b34fb"; //nothing
    //public static final String SerialPortUUID = "00002a50-0000-1000-8000-00805f9b34fb"; //garbage
    //public static final String SerialPortUUID = "00002a2a-0000-1000-8000-00805f9b34fb"; //may nakukuha?! expiremental data daw
    //public static final String SerialPortUUID = "00002a29-0000-1000-8000-00805f9b34fb"; //manufactruer name
    //public static final String SerialPortUUID = "00002a28-0000-1000-8000-00805f9b34fb"; //software revision
    //public static final String SerialPortUUID = "00002a27-0000-1000-8000-00805f9b34fb"; //hardware revision
    //public static final String SerialPortUUID = "00002a26-0000-1000-8000-00805f9b34fb"; //firmware revision
    //public static final String SerialPortUUID = "00002a25-0000-1000-8000-00805f9b34fb"; //serial number
    //public static final String SerialPortUUID = "00002a24-0000-1000-8000-00805f9b34fb"; //model number
    //public static final String SerialPortUUID = "00002a23-0000-1000-8000-00805f9b34fb"; //[8]garbage [potential]
    //public static final String SerialPortUUID = "00002a05-0000-1000-8000-00805f9b34fb"; //nothing?
    public static final String SerialPortUUID = "00002a04-0000-1000-8000-00805f9b34fb"; //[8]garbage (potential) ???
    //public static final String SerialPortUUID = "00002a03-0000-1000-8000-00805f9b34fb"; //nothing?
    //public static final String SerialPortUUID = "00002a02-0000-1000-8000-00805f9b34fb"; //[1] garbage?
    //public static final String SerialPortUUID = "00002a01-0000-1000-8000-00805f9b34fb"; //[2] garbage and then nothing? looks like same as other
    //public static final String SerialPortUUID = "00002a00-0000-1000-8000-00805f9b34fb"; //electronic scale
    //public static final String SerialPortUUID = "00001801-0000-1000-8000-00805f9b34fb"; //electronic scale
    //public static final String SerialPortUUID2 = "00002a00-0000-1000-8000-00805f9b34fb"; //electronic scale

    //above stats given the ff: uuids
    public static final String CommandUUID = "0000fff4-0000-1000-8000-00805f9b34fb";
    public static final String ModelNumberStringUUID = "0000fff0-0000-1000-8000-00805f9b34fb";


    static {
        // Sample Services.
        attributes.put("0000fff0-0000-1000-8000-00805f9b34fb", "Electronic Scale v.1");
    }

    public static String lookup(String uuid, String defaultName) {
        String name = attributes.get(uuid);
        return name == null ? defaultName : name;
    }
}

