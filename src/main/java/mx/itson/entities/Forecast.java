/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.entities;

import com.google.gson.annotations.SerializedName;
import java.util.Date;
import mx.itson.tangamandapio.enums.WeatherStatus;

/**
 *
 * @author gosva
 */
public class Forecast {
  private Date day;
  @SerializedName("min_temperature")
  private int minTemperature;
  @SerializedName("max_temperature")
  private int maxTemperature;
  private WeatherStatus status;
  
    
}
