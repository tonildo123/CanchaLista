package com.example.tony.canchalista;

import android.util.Log;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

import java.util.Map;

/**
 * Created by usuario on 20/01/2018.
 */

public class AdminFCM  extends FirebaseMessagingService
{
    @Override
    public void onDeletedMessages() {
        super.onDeletedMessages();
    }

    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {
        super.onMessageReceived(remoteMessage);
        String titulo = remoteMessage.getNotification().getTitle();
        String texto = remoteMessage.getNotification().getBody();
        Map map = remoteMessage.getData();

        Log.i("Notification Recibida", ":");
        Log.i("Título :   ", titulo);
        Log.i("Texto  :   ", texto);

       // showNotification(titulo, texto);
    }
/*

    private void showNotification(String titulo, String texto) {
        final Intent intent = new Intent(this, MainActivity.class);
        switch(titulo){
            case "NuevoTorneo":
                intent.putExtra("Fragments",R.layout.fragment_observatorio);
                break;
            case "canchaNueva":
                intent.putExtra("Fragments",R.id.nav_mipyme);
                break;
            case "ResumenCampeonato":
                intent.putExtra("Fragments",R.id.nav_CRONOGRAMAtab);
                break;
            case "resumenPartido":
                intent.putExtra("Fragments",R.id.nav_reqtab);
                break;
            case "jugadorSumado":
                intent.putExtra("Fragments",R.id.nav_mapas);
                break;
            case "jugadorSumado":
                intent.putExtra("Fragments",R.id.nav_mapas);
                break;
            case "jugadorSumado":
                intent.putExtra("Fragments",R.id.nav_mapas);
                break;
            default:
                intent.putExtra("Fragments",R.id.nav_noticias);
                break;
    }*/
}
