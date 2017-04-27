package com.example.gaurang.agrohelper;

/**
 * Created by Gaurang on 20-11-2016.
 */
public class Data {

        private String name;
        private String phoneno;
        private String address;
        private String price;

        public Data() {
        }

        public String getname() {
            return name;
        }
        public String getprice() {
            return price;
        }

        public String getaddress() {
            return address;
        }

        public String getphoneno() {
            return phoneno;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public void setPhoneno(String phoneno) {
            this.phoneno = phoneno;
        }
        public void setPrice(String price) {
            this.price = price;
        }
    }