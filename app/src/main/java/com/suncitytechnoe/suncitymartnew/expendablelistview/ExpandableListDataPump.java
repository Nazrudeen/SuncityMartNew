package com.suncitytechnoe.suncitymartnew.expendablelistview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ExpandableListDataPump {
    public static HashMap<String, List<String>> getData() {
        HashMap<String, List<String>> expandableListDetail = new HashMap<String, List<String>>();

        List<String> menswear = new ArrayList<String>();
        menswear.add("Footwear");
        menswear.add("Men's Grooming");
        menswear.add("Top Wear");
        menswear.add("Bottom Wear");
        menswear.add("Sports Wear");
        menswear.add("Innerwear & Speelwear");
        menswear.add("Watches");

        List<String> womenswear = new ArrayList<String>();
        womenswear.add("Footwear");
        womenswear.add("Westearn Wear");
        womenswear.add("Lingerie & Sleepwear");
        womenswear.add("Sarees");
        womenswear.add("Top Wear");
        womenswear.add("Bottom Wear");


        List<String> accessories = new ArrayList<String>();
        accessories.add("Backpacks");
        accessories.add("Suitcases");
        accessories.add("Duffel Bags");
        accessories.add("Wallets");
        accessories.add("Belts");
        accessories.add("Messenger Bags");
        accessories.add("Luggage");


        expandableListDetail.put("MEN'S WEAR", menswear);
        expandableListDetail.put("WOMEN'S WEAR", womenswear);
        expandableListDetail.put("ACCESSORIES", accessories);
        return expandableListDetail;

    }
}
