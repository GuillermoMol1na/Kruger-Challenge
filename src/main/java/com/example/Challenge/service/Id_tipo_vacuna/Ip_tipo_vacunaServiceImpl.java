package com.example.Challenge.service.Id_tipo_vacuna;


import com.example.Challenge.model.entity.Id_tipo_Vacuna.Id_tipo_vacuna;
import com.example.Challenge.model.repository.Id_tipo_vacuna.Id_tipo_vacunaRepository;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class Ip_tipo_vacunaServiceImpl implements Ip_tipo_vacunaService{

    private final Id_tipo_vacunaRepository repository;

    public Ip_tipo_vacunaServiceImpl(Id_tipo_vacunaRepository repository) {
        this.repository = repository;
    }

    @Override
    public String getTipoVac(int vac_id) {
        Optional<Id_tipo_vacuna> idVac = repository.findById(vac_id);
        if(idVac.isPresent()) {
            return idVac.get().getName();
        }
        else {
            return null;
        }

    }

    @Override
    public Integer getIdTipoVac(String name_vac) {
        Optional<Id_tipo_vacuna> idVac = repository.findByName(name_vac);
        if(idVac.isPresent()) {
            return idVac.get().getId();
        }
        else {
            return null;
        }
    }
}
