package com.example.tony.canchalista;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentMapas extends SupportMapFragment implements OnMapReadyCallback {
    private GoogleMap   mMap;

    public FragmentMapas() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View vista = inflater.inflate(R.layout.fragment_fragment_mapas, container, false);



        return vista;
    }
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        Marcadores.complejos(mMap);


        LatLng complejo = new LatLng(-26.8307052, -65.20279649999998);
        mMap.addMarker(new MarkerOptions()
                .position(complejo)
                .title("Coplejo 1 - Tucuman - Argentina")
                .snippet("Complejo 1 ")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE))
        );

        mMap.moveCamera(CameraUpdateFactory.newLatLng(complejo));

        // seteo mi posicion

        //mMap.setMyLocationEnabled(true);
        mMap.getUiSettings().setZoomControlsEnabled(true);
        mMap.getUiSettings().setCompassEnabled(true);
        mMap.getUiSettings().setMapToolbarEnabled(true);
        mMap.getUiSettings().setMyLocationButtonEnabled(true);

        mMap.setMinZoomPreference(7.5f);
        mMap.setMaxZoomPreference(19.0f);

        mMap.setMapType(googleMap.MAP_TYPE_NORMAL);

    }
}
