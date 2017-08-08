package com.searchincite.server;

import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.XMLConfiguration;


import com.searchincite.server.irccat.IRCCat;

public class irccatdaemon{
    private static irccatdaemon _instance = null;
    private IRCCat _ircdaemon = null;

    private irccatdaemon() {
        XMLConfiguration ircconf = null;
        try {
            ircconf = new XMLConfiguration("support/ircconf.xml");
        } catch (ConfigurationException cex) {
            System.err.println("Configuration error, check config file");
            cex.printStackTrace();
            System.exit(1);
        }
        
        try {
            _ircdaemon = new IRCCat(ircconf);
            _ircdaemon.setAutoNickChange(true);
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
        }
        
        sendMessageToAllChannels("Signing on :" + _ircdaemon.getNick() + " irccat logging bot.");
    }


    public static irccatdaemon instance() {
        System.out.print("irccatdaemon: instance\n");
        if (_instance == null) {
            System.out.print("irccatdaemon: instance-null\n");
            _instance = new irccatdaemon();
        }
        return _instance;
    }
    
    /**
     * Sends message to default channel
     * @param message
     */
    public void sendMessage(String message) {
        _ircdaemon.sendMessage(_ircdaemon.getDefaultChannel(), message);
    }
    
    public void sendMessage(String target, String message) {
        _ircdaemon.sendMessage(target, message);
    }
    
    public void sendMessageToAllChannels(String message) {
        _ircdaemon.sendMessage("#*", message);
//        _ircdaemon.sendAction("!spam", "message");
//
//        String[] chans = _ircdaemon.getChannels();
//        for(int i = 0; i < chans.length; i++) {
//            _ircdaemon.sendAction("!spam", "message");
//            sendMessage(chans[i], message);
//        }
    }
    
    public void joinChannel(String channel){
        _ircdaemon.joinChannel(channel);
    }

    /**
     * For direct access to the IRCCat object, this is for advanced usage only
     * if you find you are using this a lot, add the functionality to irccatdaemon.java
     * @return
     */
    public IRCCat _fullDisclosure() {
        return _ircdaemon;
    }
}
