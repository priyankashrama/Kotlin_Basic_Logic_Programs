package com.includehelp

import java.net.Inet4Address
import java.net.InetAddress
import java.net.NetworkInterface

//Function to Find out IP Address
fun getSystemIP(): String? {
    return try {
        var sysIP: String?
        val osName = System.getProperty("os.name")
        if (osName.contains("Windows")) {
            sysIP = InetAddress.getLocalHost().hostAddress
        } else {
            sysIP = getSystemIP4Linux("eth0")
            if (sysIP == null) {
                sysIP = getSystemIP4Linux("eth1")
                if (sysIP == null) {
                    sysIP = getSystemIP4Linux("eth2")
                    if (sysIP == null) {
                        sysIP = getSystemIP4Linux("usb0")
                    }
                }
            }
        }
        sysIP
    } catch (E: Exception) {
        System.err.println("System IP Exp : " + E.message)
        null
    }
}

//For Linux OS
fun getSystemIP4Linux(name: String): String? {
    return try {
        var ip : String?=null
        val networkInterface = NetworkInterface.getByName(name)
        val inetAddress = networkInterface.inetAddresses
        var currentAddress = inetAddress.nextElement()
        while (inetAddress.hasMoreElements()) {
            currentAddress = inetAddress.nextElement()
            if (currentAddress is Inet4Address && !currentAddress.isLoopbackAddress()) {
                ip = currentAddress.toString()
                break
            }
        }
        if (ip != null) {
            if (ip.startsWith("/")) {
                ip = ip.substring(1)
            }
        }
        ip
    } catch (E: Exception) {
        System.err.println("System Linux IP Exp : " + E.message)
        null
    }
}

//Main Function, Entry Point of Program
fun main(args: Array<String>) {

    //Call Function to get IP Address
    val ipAddress = getSystemIP()

    //Print IP Address
    println("System IP : $ipAddress")
}



OUTPUT:- 
System IP : 192.168.43.41
