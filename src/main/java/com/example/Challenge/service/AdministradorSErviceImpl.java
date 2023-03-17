package com.example.Challenge.service;

import com.example.Challenge.model.entity.Empleado.Empleado;
import com.example.Challenge.model.pojo.dto.Empleado.EmpleadoDTO;
import com.example.Challenge.model.pojo.vo.Empleado.EmpleadoVO;
import com.example.Challenge.model.repository.EmpleadoRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class AdministradorSErviceImpl implements AdministradorService{
    private final EmpleadoRepository repository;

    @Autowired
    public AdministradorSErviceImpl(EmpleadoRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<EmpleadoVO> findAllEmpleados() {
        List<Empleado> listOrigin= repository.findAll();
        List<EmpleadoVO> listResult= new ArrayList<>();
        for (Empleado entity : listOrigin) {
            listResult.add(empleadoToVO(entity));
        }
        return  listResult;
    }
    @Override
    public List<EmpleadoVO> findAllEmpVaccinated() {
        List<Object[]> listOrigin= repository.findAllEmpVaccinated();
        List<EmpleadoVO> listResult= new ArrayList<>(listOrigin.size());
        for (Object[] object : listOrigin) {
            EmpleadoVO vo = new EmpleadoVO();
            vo.setId((Integer) object[0]);
            vo.setCedula((Integer) object[1]);
            vo.setNombres((String) object[2]);
            vo.setApellidos((String) object[3]);
            vo.setCorreo((String) object[4]);
            vo.setFechaNacimiento((Date) object[5]);
            vo.setDireccion((String) object[6]);
            vo.setTelefono((Integer) object[7]);
            vo.setEstadoVacunacion((Boolean) object[8]);
            vo.setTipoVacuna((String) object[9]);
            vo.setFechaVacunacion((Date) object[10]);
            vo.setNumeroDosis((Integer) object[11]);
            listResult.add(vo);
        }
        return listResult;
    }

    @Override
    public List<EmpleadoVO> findAllEmpNotVaccinated() {
        List<Object[]> listOrigin= repository.findAllEmpNotVaccinated();
        List<EmpleadoVO> listResult= new ArrayList<>(listOrigin.size());
        for (Object[] object : listOrigin) {
            EmpleadoVO vo = new EmpleadoVO();
            vo.setId((Integer) object[0]);
            vo.setCedula((Integer) object[1]);
            vo.setNombres((String) object[2]);
            vo.setApellidos((String) object[3]);
            vo.setCorreo((String) object[4]);
            vo.setFechaNacimiento((Date) object[5]);
            vo.setDireccion((String) object[6]);
            vo.setTelefono((Integer) object[7]);
            vo.setEstadoVacunacion((Boolean) object[8]);
            listResult.add(vo);
        }
        return listResult;
    }

    @Override
    public List<EmpleadoVO> findAllEmpVaccinatedSputnik() {
        List<Object[]> listOrigin= repository.findAllEmpVaccinatedSputnik();
        List<EmpleadoVO> listResult= new ArrayList<>(listOrigin.size());
        for (Object[] object : listOrigin) {
            EmpleadoVO vo = new EmpleadoVO();
            vo.setId((Integer) object[0]);
            vo.setCedula((Integer) object[1]);
            vo.setNombres((String) object[2]);
            vo.setApellidos((String) object[3]);
            vo.setCorreo((String) object[4]);
            vo.setFechaNacimiento((Date) object[5]);
            vo.setDireccion((String) object[6]);
            vo.setTelefono((Integer) object[7]);
            vo.setEstadoVacunacion((Boolean) object[8]);
            vo.setTipoVacuna((String) object[9]);
            vo.setFechaVacunacion((Date) object[10]);
            vo.setNumeroDosis((Integer) object[11]);
            listResult.add(vo);
        }
        return listResult;
    }
    @Override
    public List<EmpleadoVO> findAllEmpVaccinatedAstra() {
        List<Object[]> listOrigin= repository.findAllEmpVaccinatedAstra();
        List<EmpleadoVO> listResult= new ArrayList<>(listOrigin.size());
        for (Object[] object : listOrigin) {
            EmpleadoVO vo = new EmpleadoVO();
            vo.setId((Integer) object[0]);
            vo.setCedula((Integer) object[1]);
            vo.setNombres((String) object[2]);
            vo.setApellidos((String) object[3]);
            vo.setCorreo((String) object[4]);
            vo.setFechaNacimiento((Date) object[5]);
            vo.setDireccion((String) object[6]);
            vo.setTelefono((Integer) object[7]);
            vo.setEstadoVacunacion((Boolean) object[8]);
            vo.setTipoVacuna((String) object[9]);
            vo.setFechaVacunacion((Date) object[10]);
            vo.setNumeroDosis((Integer) object[11]);
            listResult.add(vo);
        }
        return listResult;
    }


    @Override
    public List<EmpleadoVO> findAllEmpVaccinatedPfzier() {
        List<Object[]> listOrigin= repository.findAllEmpVaccinatedPfzier();
        List<EmpleadoVO> listResult= new ArrayList<>(listOrigin.size());
        for (Object[] object : listOrigin) {
            EmpleadoVO vo = new EmpleadoVO();
            vo.setId((Integer) object[0]);
            vo.setCedula((Integer) object[1]);
            vo.setNombres((String) object[2]);
            vo.setApellidos((String) object[3]);
            vo.setCorreo((String) object[4]);
            vo.setFechaNacimiento((Date) object[5]);
            vo.setDireccion((String) object[6]);
            vo.setTelefono((Integer) object[7]);
            vo.setEstadoVacunacion((Boolean) object[8]);
            vo.setTipoVacuna((String) object[9]);
            vo.setFechaVacunacion((Date) object[10]);
            vo.setNumeroDosis((Integer) object[11]);
            listResult.add(vo);
        }
        return listResult;
    }

    @Override
    public List<EmpleadoVO> findAllEmpVaccinatedJhonson() {
        List<Object[]> listOrigin= repository.findAllEmpVaccinatedJhonson();
        List<EmpleadoVO> listResult= new ArrayList<>(listOrigin.size());
        for (Object[] object : listOrigin) {
            EmpleadoVO vo = new EmpleadoVO();
            vo.setId((Integer) object[0]);
            vo.setCedula((Integer) object[1]);
            vo.setNombres((String) object[2]);
            vo.setApellidos((String) object[3]);
            vo.setCorreo((String) object[4]);
            vo.setFechaNacimiento((Date) object[5]);
            vo.setDireccion((String) object[6]);
            vo.setTelefono((Integer) object[7]);
            vo.setEstadoVacunacion((Boolean) object[8]);
            vo.setTipoVacuna((String) object[9]);
            vo.setFechaVacunacion((Date) object[10]);
            vo.setNumeroDosis((Integer) object[11]);
            listResult.add(vo);
        }
        return listResult;
    }

    @Override
    public Optional<Empleado> findByIdEmpleado(int id) {
        return repository.findById(id);
    }

    @Override
    public Optional<EmpleadoVO> findByIdEmpleadoVO(int id) {
        return Optional.of(empleadoToVO(repository.findById(id).get()));
    }

    @Override
    public Optional<EmpleadoVO> findByCedula(int cedula) {
        Optional<Empleado> entity = repository.findByCedula(cedula);
        return entity.map(this::empleadoToVO);
    }

    @Override
    public void delete(Empleado entity) {
        repository.delete(entity);
    }

    @Override
    public EmpleadoVO persist(EmpleadoDTO dto) {
        Empleado entity = new Empleado();
        entity.setCedula(dto.getCedula());
        entity.setNombres(dto.getNombres());
        entity.setApellidos(dto.getApellidos());
        entity.setCorreo(dto.getCorreo());
        repository.save(entity);
        return  null;
    }

    @Override
    public void update(Empleado entity) {
        repository.save(entity);
    }

    private EmpleadoVO empleadoToVO(Empleado e) {
        EmpleadoVO vo = new EmpleadoVO();
        BeanUtils.copyProperties(e, vo);
        return vo;
    }

}
