package com.brown_chicken.mapapp01;

import android.os.Bundle;

import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //activity_maps.xmlに作成した内容を画面に表示
        setContentView(R.layout.activity_maps);

        //プラグメント・マネージャwp取得
        FragmentManager manager = getSupportFragmentManager()


        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        //Mapのフラグメントを取得
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);

        //Mapのフラグメントにコールバックを登録
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        //Latlngクラスのオブジェクトを生成
        LatLng sydney = new LatLng(-34, 151);

        //マップにマーカー追加
        mMap.addMarker(new MarkerOptions().position(sydney).title("Marker in Sydney"));

        //カメラの更新情報に従ってカメラ位置を変更
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));

        //カメラの更新情報を生成
        CameraUpdate cUpdate = CameraUpdateFactory.newLatLngZoom(new LatLng(35.68,139.76),12);

        //カメラの更新情報に従ってカメラ位置を変更
        mMap.moveCamera(cUpdate);
    }
}
