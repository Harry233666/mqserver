package com.chenk.mqcommon.listener;

import org.eclipse.paho.client.mqttv3.IMqttMessageListener;
import org.eclipse.paho.client.mqttv3.MqttMessage;

/**
 * @Author chenk
 * @create 2021/1/10 18:34
 */
public class MyIMqttMessageListener implements IMqttMessageListener {
    @Override
    public void messageArrived(String topic, MqttMessage message) {
        System.out.println("---TOPIC---:" + topic);
        System.out.println("---MqttMessage---:" + new String(message.getPayload()));
    }
}
