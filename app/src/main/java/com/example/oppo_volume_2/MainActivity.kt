package com.example.oppo_volume_2

import android.app.Activity
import android.content.Context
import android.media.AudioManager
import android.media.AudioManager.FLAG_SHOW_UI
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity


class Main : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
}
internal class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val intent = intent;
        val alarmVolume = intent.getIntExtra("ALARM_VOLUME",-1)
        if (alarmVolume == -1){
            var changealarmVolume : Boolean = false
        }else{
            var changealarmVolume : Boolean = true
            val manager: AudioManager = getSystemService(Context.AUDIO_SERVICE) as AudioManager
            if ( changealarmVolume == true) {
                manager.setStreamVolume(AudioManager.STREAM_ALARM, alarmVolume, 0)
                }
        }

        val musicVolume = intent.getIntExtra("MEDIA_VOLUME",-1)
        if (musicVolume == -1){
            var changemusicVolume : Boolean = false
        }else{
            var changemusicVolume : Boolean = true
            val manager: AudioManager = getSystemService(Context.AUDIO_SERVICE) as AudioManager
            if ( changemusicVolume == true) {
                manager.setStreamVolume(AudioManager.STREAM_MUSIC, musicVolume, 0)
            }
        }
        val ringVolume = intent.getIntExtra("RING_VOLUME",-1)
        if (ringVolume == -1){
            var changeringVolume : Boolean = false
        }else{
            var changeringVolume : Boolean = true
            val manager: AudioManager = getSystemService(Context.AUDIO_SERVICE) as AudioManager
            if ( changeringVolume == true) {
                manager.setStreamVolume(AudioManager.STREAM_RING, ringVolume, 0)
            }
        }
        val notificationVolume = intent.getIntExtra("NOTIFICATION_VOLUME",-1)
        if (notificationVolume == -1){
            var changenotificationVolume : Boolean = false
        }else{
            var changenotificationVolume : Boolean = true
            val manager: AudioManager = getSystemService(Context.AUDIO_SERVICE) as AudioManager
            if ( changenotificationVolume == true) {
                manager.setStreamVolume(AudioManager.STREAM_NOTIFICATION, notificationVolume, 0)
            }
        }
        val bluetoothVolume = intent.getIntExtra("BLUETOOTH_VOLUME",-1)
        if (bluetoothVolume == -1){
            var changebluetoothVolume : Boolean = false
        }else{
            var changebluetoothVolume : Boolean = true
            val manager: AudioManager = getSystemService(Context.AUDIO_SERVICE) as AudioManager
            if ( changebluetoothVolume == true) {
                manager.setStreamVolume(6, bluetoothVolume, 0)
            }
        }
        val systemVolume = intent.getIntExtra("SYSTEM_VOLUME",-1)
        if (systemVolume == -1){
            var changesystemVolume : Boolean = false
        }else{
            var changesystemVolume : Boolean = true
            val manager: AudioManager = getSystemService(Context.AUDIO_SERVICE) as AudioManager
            if ( changesystemVolume == true) {
                manager.setStreamVolume(AudioManager.STREAM_SYSTEM, systemVolume, 0)
            }
        }
        val voicecallVolume = intent.getIntExtra("VOICE_CALL_VOLUME",-1)
        if (voicecallVolume == -1){
            var changevoicecallVolume : Boolean = false
        }else{
            var changevoicecallVolume : Boolean = true
            val manager: AudioManager = getSystemService(Context.AUDIO_SERVICE) as AudioManager
            if ( changevoicecallVolume == true) {
                manager.setStreamVolume(AudioManager.STREAM_VOICE_CALL, voicecallVolume, 0)
            }
        }
        val dtmfVolume = intent.getIntExtra("DTMF_VOLUME",-1)
        if (dtmfVolume == -1){
            var changedtmfVolume : Boolean = false
        }else{
            var changedtmfVolume : Boolean = true
            val manager: AudioManager = getSystemService(Context.AUDIO_SERVICE) as AudioManager
            if ( changedtmfVolume == true) {
                manager.setStreamVolume(AudioManager.STREAM_DTMF, dtmfVolume, 0)
            }
        }
        this.finish();
    }
}