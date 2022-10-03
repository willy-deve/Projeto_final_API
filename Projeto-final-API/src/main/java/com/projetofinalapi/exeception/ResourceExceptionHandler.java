package com.projetofinalapi.exeception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;
import java.time.Instant;

@ControllerAdvice

public class ResourceExceptionHandler {

    @ExceptionHandler(ExeceptionPageNotFound.class)
    public ResponseEntity<StandarError> entity(ExeceptionPageNotFound objeto, HttpServletRequest request){

        StandarError erro = new StandarError();

        erro.setTimestamp(Instant.now()); //pega o horario atual
        erro.setStatus(HttpStatus.NOT_FOUND.value()); //pega o status do erro 404 .value converte em numero
        erro.setError("Recurso não encontrado, pois objeto esta vazio/null"); //mostra uma mensagem
        erro.setMessage(objeto.getMessage()); //pega a mensagem la do service
        erro.setPath(request.getRequestURI()); //pega o caminho

        //retorna o status junto as informações
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(erro);
    }


}
