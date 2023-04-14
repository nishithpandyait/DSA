package com.tech.dsa

class Phone( var phoneNumber:String? = null,
             var battery: String? = null,
             var os: String? = null,
             var ram: String? = null,
             var screenSize: String? = null,
             var processor: String? = null,
             var checkbox: Boolean = false

) {


    companion object {
        var a = 1;
    }

   /* var phoneNumber:String? = null
    var battery: String? = null
    var os: String? = null
    var ram: String? = null
    var screenSize: String? = null
    var processor: String? = null*/


    class Builder {

        var battery: String? = null
        var os: String? = null
        var ram: String? = null
        var screenSize: String? = null
        var processor: String? = null
        var phoneNumber: String? = null

        fun setBattery(battery: String) = apply {
            this.battery = battery
            return this
        }
        fun setPhoneNumber(phoneNumber: String) = apply {
            this.phoneNumber = phoneNumber
            return this
        }

        fun setOs(os: String) = apply {
            this.os = os
            return this
        }

        fun setRam(ram: String) = apply {
            this.ram = ram
            return this
        }

        fun setScreenSize(screenSize: String) = apply {
            this.screenSize = screenSize
            return this
        }

        fun setProcessor(processor: String) = apply {
            this.processor = processor
            return this
        }



        fun build(): Phone {
            return Phone(phoneNumber,battery,os,ram,screenSize,processor)
        }
    }


    override fun toString(): String {
        return "Phone(battery=$battery, os=$os, ram=$ram, screenSize=$screenSize, processor=$processor)"
    }


}