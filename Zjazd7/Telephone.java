package com.cw7;

public class Telephone {
        String model;
        double resolution;
        String number;

        public void telephone(String model, double resolution, String number) {
            this.model = model;
            this.resolution = resolution;
            this.number = number;
        }

        void sendSMS(String number, String text) {
            System.out.println("Sending Message: "+text+" to number "+number);
        }
    }