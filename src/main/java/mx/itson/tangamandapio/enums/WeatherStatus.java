/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package mx.itson.tangamandapio.enums;

import com.google.gson.annotations.SerializedName;

/**
 *
 * @author gosva
 */
public enum WeatherStatus {
    @SerializedName("1")
    SUNNY, 
    @SerializedName("2")
    SNOW, 
    @SerializedName("3")
    RAIN,
    @SerializedName("4")
    OTRO
}
