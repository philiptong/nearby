package com.ptong.nearby.utils;

import com.ptong.nearby.model.Location;

import org.junit.Test;

public class GeneratorTest {

    @Test
    public void shouldGenerateNewLocationNearBy() {
        Location currentLocation = new Location();
        currentLocation.setLatitude(51.5074);
        currentLocation.setLongitude(-0.1278);
        long t1 = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            Location newLocation = Generator.getLocationInLatLngRad(10000, currentLocation);
            System.out.println(newLocation.getLatitude() + " " + newLocation.getLongitude());
            System.out.println(Calculartor.getDistance(currentLocation, newLocation));
        }
        long t2 = System.currentTimeMillis();
        System.out.println("time used " + (t2 - t1) + " ms");

    }

}
