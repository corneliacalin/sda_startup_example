package com.sda.corneliacalin.startup.service;


import com.sda.corneliacalin.startup.service.dto.CarDTO;

public interface CarService {
    /**
     * create a new car for the given carDTO.
     *
     * @param carDTO, details of the new car
     * @return the id of the new created car
     */
    Long addCar(CarDTO carDTO);
}
