package com.projetofinalapi.services;

import com.projetofinalapi.entities.Recados;
import com.projetofinalapi.exeception.ExeceptionPageNotFound;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Service
public class RecadosService {

    private List<Recados> banco_dados = new ArrayList<>();


    private Integer id = 0;


    public Recados save(Recados recados){
        Recados recado = new Recados();
        recado.setId(++id);
        recado.setDetail(recados.getDetail());
        recado.setDescription(recados.getDescription());

        banco_dados.add(recado);

        return recado;
    }



    public List<Recados> findAll(){
        return banco_dados;
    }



    public Recados findById(Integer id){
        Recados recados = new Recados();

        for (Recados r : banco_dados){
            if (r.getId().equals(id)){
                recados.setId(r.getId());
                recados.setDetail(r.getDescription());
                recados.setDescription(r.getDescription());
            }
        }

        if (Objects.isNull(recados.getId()) || Objects.isNull(recados.getDetail()) || Objects.isNull(recados.getDescription())){
            throw new ExeceptionPageNotFound("Registro nao encontrado");
        }else {

            return recados;

        }

    }


    public void delete(Integer id){

//        banco_dados.removeIf(recadoApagdo -> recadoApagdo.getId().equals(id));

        List<Recados> recado = new ArrayList<>();

        for (Recados r : banco_dados){
            if (r.getId().equals(id)){
                recado.add(r);
            }
        }

        banco_dados.removeAll(recado);

    }


    public Recados update(Integer id, Recados recados){

        for (Recados r : banco_dados){
            if (r.getId().equals(id)){
                r.setDescription(recados.getDescription());
                r.setDetail(recados.getDetail());

            }

        }
        return recados;
    }
}


