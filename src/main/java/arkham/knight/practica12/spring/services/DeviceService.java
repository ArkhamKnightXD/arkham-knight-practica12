package arkham.knight.practica12.spring.services;

import arkham.knight.practica12.spring.models.Device;
import arkham.knight.practica12.spring.repository.DeviceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class DeviceService {

    @Autowired
    private DeviceRepository deviceRepository;

    public void createDevice(Device device){

        deviceRepository.save(device);
    }

    public List<Device> listAllDevices(){

        return deviceRepository.findAll();
    }

    public Device findDeviceById(long id){

        return deviceRepository.findDeviceById(id);
    }


    public void deleteUser(Device device){

        deviceRepository.delete(device);
    }

}
