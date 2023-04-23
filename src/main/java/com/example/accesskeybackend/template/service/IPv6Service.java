package com.example.accesskeybackend.template.service;

import org.springframework.stereotype.Service;

import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.UnknownHostException;

@Service
public class IPv6Service {

    public boolean checkIPv6Support (String siteUrl) {
        try {
            InetAddress[] addresses = InetAddress.getAllByName(siteUrl);
            for (InetAddress address : addresses) {
                if (address instanceof Inet6Address) {
                    return true;
                }
            }
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        return false;
    }
}