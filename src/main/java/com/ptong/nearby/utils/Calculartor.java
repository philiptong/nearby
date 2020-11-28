package com.ptong.nearby.utils;

import com.ptong.nearby.model.Location;

public class Calculartor {

    // Haversine formula
    public static double getDistance(Location locationA, Location locationB) {
        double lat1 = locationA.getLatitude();
        double lat2 = locationB.getLatitude();
        double lng1 = locationA.getLongitude();
        double lng2 = locationB.getLongitude();

        if ((lat1 == lat2) && (lng1 == lng2)) {
            return 0;
        } else {
            double earthRadius = 6371000; // meters
            double dLat = Math.toRadians(lat2 - lat1);
            double dLng = Math.toRadians(lng2 - lng1);
            double a = Math.sin(dLat / 2) * Math.sin(dLat / 2) + Math.cos(Math.toRadians(lat1))
                    * Math.cos(Math.toRadians(lat2)) * Math.sin(dLng / 2) * Math.sin(dLng / 2);
            double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
            float dist = (float) (earthRadius * c);
            return dist;
        }
    }

}
