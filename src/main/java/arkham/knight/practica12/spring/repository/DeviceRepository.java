package arkham.knight.practica12.spring.repository;

import arkham.knight.practica12.spring.models.Device;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeviceRepository extends JpaRepository<Device, Long> {

    Device findDeviceById(Long id);
}
