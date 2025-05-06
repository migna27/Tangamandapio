/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.entities;

import java.util.List;
import mx.itson.tangamandapio.enums.WeatherStatus;

/**
 *
 * @author gosva
 */
public class Wheather {
      private String city;
    private int temperature;
    private int humidity;
    private int windSpeed;
    private WeatherStatus status;
    private List<Forecast> forecast;
}
