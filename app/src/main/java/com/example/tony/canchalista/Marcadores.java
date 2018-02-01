package com.example.tony.canchalista;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

/**
 * Created by Tony on 1/2/2018.
 */

public abstract class Marcadores {
    public static  void complejos(GoogleMap mMap){


        LatLng complejo1 = new LatLng(-26.805079, -65.261692);//OZ Futbol	Avenida camino del Peru 1094
        LatLng complejo2 = new LatLng(-26.854418, -65.224829);//Francia 98	Avenida alem 1950
        LatLng complejo3 = new LatLng(-26.823316, -65.243055);//Alemania Padel & Club	Pasaje Alemania 67
        LatLng complejo4 = new LatLng(-26.803357, -65.281589);//Unico Sport Futbol	Avenida Presidencia Peron 1100

        mMap.addMarker(new MarkerOptions().position(complejo1).title("Coplejo 1").snippet("Complejo 1.1 ").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE)));
        mMap.addMarker(new MarkerOptions().position(complejo2).title("Coplejo 2").snippet("Complejo 2.2 ").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE)));
        mMap.addMarker(new MarkerOptions().position(complejo3).title("Coplejo 3").snippet("Complejo 3.3 ").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE)));
        mMap.addMarker(new MarkerOptions().position(complejo4).title("Coplejo 4").snippet("Complejo 4.4 ").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE)));

    }

}
